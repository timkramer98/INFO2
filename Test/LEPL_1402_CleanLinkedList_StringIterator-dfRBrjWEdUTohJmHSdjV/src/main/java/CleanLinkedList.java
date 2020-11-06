import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


/**
 * Question:
 *
 * You are asked to clean a increasing sorted linked List (see the TODO below)
 * Cleaning the linkedList means keeping only one occurrence of each value.
 *
 * For instance cleaning: 3,3,3,4,5,5,6,6,6,7,9,9,9,9,10,10
 * Gives: 3,4,5,6,7,9,10
 *
 * Your algorithm should execute in Theta(n)
 * where n are the number of elements in the original list
 *
 */
public class CleanLinkedList {

    Node first = null;
    Node last = null;

    public void add(int v) {
        if (first == null) {
            first = new Node(v, null);
            last = first;
        } else {
            Node newNode = new Node(v, null);
            Node current = first;
            while (current != last && current.v < v) {
                current = current.next;
            }
            if (current == last) {
                current.next = newNode;
                last = current.next;
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void add(int... values) {
        for (int v : values) {
            add(v);
        }
    }


    /**
     * Given the increasingly sorted list, it removes the duplicates
     *
     * @return an increasingly sorted list containing the same set
     * of elements as list but without duplicates.
     */
    public CleanLinkedList clean() {
        CleanLinkedList nL = new CleanLinkedList();
        nL.add(first.v);

        Node current = first;
        int firstVal = first.v;
        while (current != last) {
            while (firstVal == current.v && current != last) {
                current = current.next;
            }
            if (current == last) {
                if (nL.last.v != current.v) {
                    nL.add(current.v);
                }
            } else {
                nL.add(current.v);
                firstVal = current.v;
            }
        }
        return nL;
    }


    class Node {
        int v;
        Node next;

        Node(int v, Node next) {
            this.v = v;
            this.next = next;
        }
    }


}

