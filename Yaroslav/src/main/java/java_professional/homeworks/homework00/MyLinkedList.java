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
        private Node<E> currentInverse = last;

        public E next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            E elem = current.elem;
            current = current.next;
            return elem;
        }

        public boolean hasNext() { return current != null; }
    }

    /**
     * Метод, который возвращает масив созданый из списка
     */
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int counter = 0;
        for(E elem : this){
            array[counter] = elem;
            counter++;
        }
        return array;
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
        add(size, elem);
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
        int index = indexOf(elem);
        remove(index);
        return true;
    }


    /**
     * Метод, который проверяет входят ли все элементы передвной
     * колекции в список
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        if(c == null){
            return false;
        }
        for(Object object : c){
            if(!contains(object)){
                return false;
            }
        }
        return true;
    }


    /**
     * Метод, который добавляет в конец списка все элементы переданой
     * колекции
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c == null){
            return false;
        }
        for(E elem : c){
            add(elem);
        }
        return true;
    }


    /**
     * Метод, который вставляет в список все элементы переданой
     * колекции. Вставляет начиная с номера єлемента index
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (c == null){
            return false;
        }
        for(E elem : c){
            add(index, elem);
        }
        return true;
    }


    /**
     * Метод, который удаляет из списка все элементы, значения которых равны любому
     * из элементов переданой колекции
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null){
            return false;
        }
        for(Object object : c){
            while(contains(object)){
                remove(object);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    /**
     * Метод, который удаляет все элементы из списка
     */
    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Метод, который возвращает элемент списка по индексу
     */
    @Override
    public E get(int index) {
        int counter = 0;
        for(E elem : this){
            if(counter == index){
                return elem;
            }
            counter++;
        }
        return null;
    }


    /**
     * Метод, который заменяет элемент списка по индексу на новый
     */
    @Override
    public E set(int index, E element){
        Node current = first;
        int counter = 0;
        while(current != null) {
            if (counter == index){
                current.elem = element;
                return element;
            }
            current = current.next;
            counter++;
        }
        return null;
    }


    /**
     * Метод, который добавляет обьект в список по заданому индексу
     */
    @Override
    public void add(int index, E element) {
        if(isEmpty()){
            last = new Node<>(null, element, null);
            first = last;
            size++;
        }
        else if(index == 0){
            Node newNode = new Node(null, element, first);
            first = newNode;
            size++;
        }
        else if(index == size ){
            Node newNode = new Node(last, element, null);
            last.next = newNode;
            last = newNode;
            size++;
        }
        else if(index < size && index > 0 && element != null) {
            int counter = 0;
            Node current = first;
            Node prevCurrent = first.prev;
            while (counter != index) {
                current = current.next;
                prevCurrent = current.prev;
                counter++;
            }
            Node newNode = new Node(prevCurrent, element, current);
            current.prev = newNode;
            prevCurrent.next = newNode;
            size++;
        }
    }


    /**
     * Метод, который удаляет элемент списка по индексу
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index > size + 1 || isEmpty()){
            return null;
        }
        Node<E> current;
        if(index == 0){
            current = first.next;
            first = current;
            first.prev = null;
        }
        else if(index == size - 1){
            current = last.prev;
            last = current;
            last.next = null;
        }
        else{
            current = first;
            int counter = 0;
            while (counter != index) {
                current = current.next;
                counter++;
            }
            Node<E> newNext = current.next;
            Node<E> newPrev = current.prev;
            newNext.prev = newPrev;
            newPrev.next = newNext;
        }
        size--;
        return current.elem;
    }


    /**
     * Метод, который находит индекс первого вхождения данного элемента
     * в список
     */
    @Override
    public int indexOf(Object o) {
        int counter = 0;
        Node current = first;
        while(current != null){
            if(current.elem.equals(o)){
                return counter;
            }
            current = current.next;
            counter++;
        }
        return -1;
    }


    /**
     * Метод, который находит индекс последнего вхождения данного
     * элемента в список
     */
    @Override
    public int lastIndexOf(Object o) {
        int counter = size - 1;
        Node current = last;
        while(current != null){
            if(current.elem.equals(o)){
                return counter;
            }
            current = current.prev;
            counter--;
        }
        return -1;
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


    /**Метод для вывода списка*/
    @Override
    public String toString() {
        String res = "[";
        int counter = 0;
        Node current = first;
        while(current != null) {
            counter++;
            if(counter == size){
                res += current.elem;
            }
            else {
                res += current.elem + ", ";
            }
            current = current.next;
        }
        res += "]";
        return res;
    }


    /** Вспомагательный вложеный клас*/
    private static class Node<E> {
        E elem;         /** значение самого элемента*/
        Node<E> next;   /** отсылка на следующий элемент*/
        Node<E> prev;   /** отсылка на предыдущий элемент*/

        Node(Node<E> prev, E element, Node<E> next) {
            this.elem = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
