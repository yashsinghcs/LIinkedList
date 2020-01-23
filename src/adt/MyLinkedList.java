package adt;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private Node<E> head = null;
        private int size = 0;
        private E data;
        private Node<E> next;

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }

    }

    @Override
    public void add(int index, E item) {

    }
}
