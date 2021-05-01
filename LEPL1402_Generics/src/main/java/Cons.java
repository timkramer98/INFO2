public class Cons {
    // The item inside this list node
    public int v;
    // The next element, null if there is none
    public Cons next;

    // Returns a new Cons by applying function f on all elements
    public Cons map(F f) {
        Cons newcons = new Cons(f.apply(this.v), null);
        if (next != null){
            newcons.next = this.next.map(f);
        }
        return newcons;

    }
    // Returns a new Cons containing all elements that match predicate p
    public Cons filter(P p) {
        Cons fcons = new Cons(0, null);
        Cons head = this;
        while(head != null){
            if (p.filter(head.v)){
                fcons.v = head.v;
                if (head.next != null){
                    fcons.next = head.next.filter(p);
                }
                return fcons;
            }
            head = head.next;
        }
        return null;
    }


    // Constructor
    public Cons(int v, Cons next) {
        this.v = v;
        this.next = next;
    }
}