package adt;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

    }

    @Override
    public void add(int index, E item) {

    }
}
