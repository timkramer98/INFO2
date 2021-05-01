public class Count {
    private int counter = 0;


    public synchronized void inc(){
        counter++;
        notify();
    }
    public synchronized void dec(){
        if (counter ==0){
            try{
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        counter--;
    }
    public int get(){
        return counter;
    }


}
