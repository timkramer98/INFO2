import java.util.Iterator;



/**
 * Question:
 *
 * You are asked to implement an IterableString allowing
 * to iterate on the successive chars of a given string
 *
 * Once it is done, copy-paste the complete class in Inginious also with the imports
 *
 *
 * Feel free to add methods or fields in the class but do not modify
 * the signature and behavior of existing code
 *
 */
public class StringIterator {

    /**
     * Factory method
     * @param s the string on which to iterate
     * @return a new instance of your implementation of an IterableString allowing to iterate on s
     */
    public static IterableString makeIterableString(String s) {
        // TODO return an instance of your class that implements the interface
        return new Stringiterator(s);

    }

    /**
     * An IterableString permit to iterate on each character of a
     * string one by one from left to right
     */
    public interface IterableString extends Iterable<Character>{
        public boolean hasNext();
        public char next();
        public Iterator iterator();

    }

    public static class Stringiterator implements IterableString{
        String s;
        int length;
        int current;


        public Stringiterator(String s) {
            if (s.length() != 0) {
                this.s = s;
                this.length = s.length();
                this.current = 0;
            }
        }



        @Override
        public boolean hasNext() {
            return this.current != this.length;
        }

        @Override
        public char next() {
            if (hasNext()){
                int r = this.current;
                this.current++;
                return this.s.charAt(r);
            }
            return 0;
        }

        @Override
        public Iterator iterator() {
            return (Iterator) new StringIterator();
        }
    }


}
