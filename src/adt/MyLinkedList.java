package adt;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private Node<E> head = null;
        private int size = 0;
        private E data;
        private Node<E> next;

        public Node(E item, Node<E> head) {
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }

        private void addFirst(E item) {
            head = new Node<>(item, head);
        }

    }


    @Override
    public void add(int index, E item) {

    }
}
