
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockQueue {

    public final static int SIZE = 100;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public int head = 0;
    public int tail = 0;
    public final Integer [] cells = new Integer[SIZE];
    public int count = 0;



    public Integer dequeue() {
        lock.lock();
        try{
            while(empty()){
                notEmpty.await();
            }
            int x = cells[head++ % SIZE];
            count--;
            notFull.signal();
            return x;
        } catch (Exception e) {
            return null;
        }
        finally {
            lock.unlock();
        }

    }


    public void enqueue(Integer i) {
        lock.lock();
        try {
            while (full()) {
                notFull.await();
            }
            cells[tail++ % SIZE] = i;
            count++;
            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public boolean full(){
        return this.count == SIZE;
    }

    public boolean empty(){
        return this.head == this.tail;
    }

    public int size() { return this.tail - this.head; }

}
