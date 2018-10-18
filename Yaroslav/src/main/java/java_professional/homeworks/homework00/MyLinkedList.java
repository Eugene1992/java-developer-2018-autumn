package java_professional.homeworks.homework00;

import java.util.*;

public class MyLinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;


    MyLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }


    /**
     * Метод, который возвращает размер списка
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Метод, который проверяет являеться ли список пустым
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Метод, который проверяет есть ли в списке такой обьект как переданый
     */
    @Override
    public boolean contains(Object element) {
        for(E elem : this) {
            if(elem.equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator(){
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = first;

        public E next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            E elem = current.elem;
            current = current.next;
            return elem;
        }

        public boolean hasNext() { return current != null; }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Метод, который добавляет обьект в конец списка
     */
    @Override
    public boolean add(E elem) {
        if(elem == null){
            return false;
        }
        if(isEmpty()){
            last = new Node<>(null, elem, null);
            first = last;
        }
        else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current = last;
            last = new Node<>(current, elem, null);
            current.next = last;

        }
        size++;
        return true;
    }


    /**
     * Метод, который удаляет первое вхождения обькта elem в список если
     * такой есть
     */
    @Override
    public boolean remove(Object elem) {
        if(first == null || elem == null){
            return false;
        }
        if(size == 1){
            first = null;
            last = null;
            return true;
        }

        Node current = first;
        boolean isDeleted = false;
        while(current.next != null){
            if(isDeleted){
                current.elem = current.next.elem;
                current = current.next;
            }
            else if(current.elem.equals(elem)){
                isDeleted = true;
            }
            else{
                current = current.next;
            }
        }
        if(isDeleted) {
            last = current.prev;
            last.next = null;
            size--;
            return true;
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        int counter = 0;
        Node current = first;
        while(counter != index ){
            current = current.next;
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    private static class Node<E> {
        E elem;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.elem = element;
            this.next = next;
            this.prev = prev;
        }
    }



    @Override
    public String toString() {
        String res = "[";
        int counter = 0;
        for (E elem : this) {
            counter++;
            if(counter == size){
                res += elem;
            }
            else {
                res += elem + ", ";
            }
        }
        res += "]";
        return res;
    }
}
