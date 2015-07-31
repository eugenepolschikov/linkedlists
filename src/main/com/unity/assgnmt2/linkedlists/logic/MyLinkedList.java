package main.com.unity.assgnmt2.linkedlists.logic;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by ypolshchykau on 31.07.2015.
 * ============== information section =========================
 * Short summary on the fact what linked list is:
 * LinkedList = Data + Next Member
 * Where it's the last member of the list if next is NULL
 * So a 5 member LinkedList would be:
 * <p/>
 * LinkedList(Data1, LinkedList(Data2, LinkedList(Data3, LinkedList(Data4, LinkedList(Data5, NULL)))))
 * But you can think of it as simply:
 * Data1 -> Data2 -> Data3 -> Data4 -> Data5 -> NULL
 * ============END OF unformation section ===================
 * <p/>
 * <p/>
 * implementation of a singly-linked-list. The 'T' type is a generic type placeholder.
 * Basically, this linked list should work with any type that inherits from Object.
 * If you use it for primitive types be sure to use the nullable class equivalents (ex 'Integer' for the 'int' type).
 * The 'last' variable isn't really necessary except that it shortens insertions to O(1) time.
 * Removals are slow since they run in O(N) time but it allows you to remove the first occurrence of a value in the list.
 */

public class MyLinkedList<T> implements Iterable<T> {
    private Node first;
    private Node last;
    private int N;

    public MyLinkedList() {
        first = null;
        last = null;
        N = 0;
    }

    /**
     * append method for linked list
     *
     * @param item
     */

    public void append(T item) {
        if (item == null) {
            throw new NullPointerException("The first argument for addLast() is null.");
        }
        if (!isEmpty()) {
            Node prev = last;
            last = new Node(item, null);
            prev.next = last;
        } else {
            last = new Node(item, null);
            first = last;
        }
        N++;
    }

    public void prepend(T item) {
        if (item == null) {
            throw new NullPointerException("The first argument for addLast() is null.");
        }
        if (!isEmpty()) {
            Node toPrepend = new Node(item, null);
            Node following = first;
            toPrepend.next = following;
            first = toPrepend;

        } else {
            last = new Node(item, null);
            first = last;
        }
        N++;
    }

    public void addInAscOrder(T item) {
        if (item == null) {
            throw new NullPointerException("The first argument for addLast() is null.");
        }
//        case when initial list is empty

        if (N == 0) {
            append(item);
            return;
        }

//        case when intial list contains SINGLE element

        if (N == 1) {
            Node toAddInOrder = new Node(item, null);
            int res = ((Integer) first.data).compareTo((Integer) toAddInOrder.data);
            if (res > 0) {
                this.prepend(item);
            } else {
                this.append(item);
            }

            return;

        }
//case: initial list elem num>=2
        if (N >= 2) {


            Node toAddInOrder = new Node(item, null);


            Node iterator = first;
            Node previous = iterator;
            for (int i = 0; i < N; i++) {

                int res = ((Integer) iterator.data).compareTo((Integer) toAddInOrder.data);
                if (res < 0) {
                    if(i==N-1){
                        this.append(item);
                        return;
                    }
                    previous = iterator;
                    iterator=previous.next;
                    continue;
                } else if (res == 0) {
                    Node elemBefore = iterator;
                    Node elemAfter = iterator.next;
                    toAddInOrder.next = elemAfter;
                    elemBefore.next = toAddInOrder;
                    break;
                } else if (res >= 0) {
//insert in the very beginning

                    if (iterator == first) {

                        toAddInOrder.next = iterator;
                        first = toAddInOrder;
                    }

                    else{
                        previous.next=toAddInOrder;
                        toAddInOrder.next=iterator;

                    }

                    /*Node elemAfter = iterator;
                    toAddInOrder.next = elemAfter;*/

                    break;
                }

            }


        }
        N++;

    }

    /**
     * method resposible for removing one List item.
     *
     * @param item - actual value to remove from the list
     * @return
     */

    public boolean remove(T item) {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove() from and empty list.");
        }
        boolean result = false;
        Node prev = first;
        Node curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(item)) {
                // remove the last remaining element
                if (N == 1) {
                    first = null;
                    last = null;
                }
                // remove first element
                else if (curr.equals(first)) {
                    first = first.next;
                }
                // remove last element
                else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                }
                // remove element
                else {
                    prev.next = curr.next;
                }
                N--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = current.data;
            current = current.next;
            return item;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this)
            s.append(item + " ");
        return s.toString();
    }


}