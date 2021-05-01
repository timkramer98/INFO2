import java.util.function.Predicate;
import java.util.function.Function;

public class Cons<E> {
    // The item inside this list node
    public E v;
    // The next element, null if there is none
    public Cons<E> next;

    // Returns a new Cons by applying Function function on all elements
    public <R> Cons <R> map(Function <E,R> function) {
        Cons<R> mappedCons = new Cons<R>(function.apply(this.v), null);
        if(this.next != null) {
            mappedCons.next = this.next.map(function);
        }
        return mappedCons;
    }
    // Returns a new Cons containing all elements that match Predicate predicate
    public Cons <E> filter(Predicate <E> predicate) {
        Cons filtered = new Cons(null, null);
        Cons head = this;
        while(head != null){
            E headValue = (E) head.v;
            if(predicate.test(headValue)){
                filtered.v = head.v;
                if(head.next != null){
                    filtered.next = head.next.filter(predicate);
                }
                return filtered;
            }
            head = head.next;
        }
        return null;

    }

    // Constructor
    public Cons(E v, Cons<E> next) {
        this.v = v;
        this.next = next;
    }
}
