package java_professional.linkedlist_package;

//import javax.xml.soap.Node;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;

import java.util.*;

public class MyLinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;
//    LinkedList<E> myLinkedList = new LinkedList<>();

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;

        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E element : this) {
            if (element == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new MyLinkedListIterator();
    }


    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (E element : this) {
            array[i] = element;
            i++;
        }
        return array;
    }

    @Override
    public boolean add(E element) {
        add(size, element);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)) {
            remove(indexOf(o));
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c.isEmpty()) {
            return false;
        } else {
            for (E elem : c) {
                add(elem);
            }
            return true;
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (c.isEmpty()) {
            return false;
        } else {
            for (E elem : c) {
                add(index, elem);
                index++;
            }
            return true;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (size == 0) {
            return null;
        } else {
            if (index == 0) {
                return first.element;
            } else if (index == size - 1) {
                return last.element;
            } else {
                MyLinkedListIterator iterator = new MyLinkedListIterator();
                int counter = 0;
                if (index < size / 2) {
                    while (iterator.hasNext()) {
//                        for (E element : this) {
                        if (counter == index) {
                            return iterator.next();
                        }
                        counter++;
//                        }
                    }
                } else {
                    counter = size - 1;
                    MyLinkedListIterator fromEndIterator = new MyLinkedListIterator(this.size());
                    E element = fromEndIterator.previous();
                    while (fromEndIterator.hasPrevious()) {
                        if (index == counter) {
                            return element;
                        }

                        counter--;
                    }
                }
            }
            return null;
        }
    }

    @Override
    public E set(int index, E element) {
//        E elementForReturn = remove(index);
//        add(index, element);
//        return elementForReturn;
//
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (size == 0) {
            return null;
        }
        if (index == size - 1) {
            E elementForReturn = last.element;
            last.element = element;
            return elementForReturn;
        }
        if (index == 0) {
            E elementForReturn = first.element;
            first.element = element;
            return elementForReturn;
        } else {
            E elementForReturn;
            int counter = 0;
            Node current = first;
            Node secondary;
            if (index < size / 2) {
                secondary = current.prev;
                while (index != counter) {
                    current = current.next;
                    secondary = current.prev;
                    counter++;
                }
            } else {
                counter = size - 1;
                current = last;
                secondary = current.prev;
                while (index != counter) {
                    current = secondary;
                    secondary = current.prev;
                    counter--;
                }
            }
            elementForReturn = (E) current.element;
            current.element = element;
            return elementForReturn;
        }
    }

    @Override
    public void add(int index, E element) {
        if (size == 0) {
            first = new Node(null, element, null);
            last = first;
            size++;
        } else if (index == 0) {
            Node newNode = new Node(null, element, first);
            first.prev = newNode;
            first = newNode;
            size++;
        } else if (index == size) {
            Node newNode = new Node(last, element, null);
            last.next = newNode;
            last = newNode;
            size++;
        } else {
            int counter = 0;
//            for (E e: this){

            Node current = first;
            Node secondary;
            if (index < size / 2) {
                secondary = current.prev;
                while (index != counter) {
                    current = current.next;
                    secondary = current.prev;
                    counter++;
                }
            } else {
                counter = size - 1;
                current = last;
                secondary = current.prev;
                while (index != counter) {
                    current = secondary;
                    secondary = current.prev;
                    counter--;
                }
            }
            Node newNode = new Node(secondary, element, current);
            current.prev = newNode;
            secondary.next = newNode;
//            }
            size++;
        }
    }

    @Override
    public E remove(int index) {
        Node current;
        if (index == 0) {
            current = first;
            first = first.next;
            first.prev = null;
        } else if (index == size - 1) {
            current = last;
            last = last.prev;
            last.next = null;
        } else {
            int counter = 0;
            current = first;
            if (index < size / 2) {
                while (index != counter) {
                    current = current.next;
                    counter++;
                }
            } else {
                counter = size - 1;
                current = last;
                while (index != counter) {
                    current = current.prev;
                    counter--;
                }
            }
            Node previous;
            Node after;
            previous = current.prev;
            after = current.next;
            previous.next = after;
            after.prev = previous;
        }
        size--;
        return (E) current.element;
    }

    @Override
    public int indexOf(Object o) {
        int counter = 0;
        for (E element : this) {
            if (element.equals(o)) {
                return counter;
            }
            counter++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyLinkedListIterator listIterator = new MyLinkedListIterator();
        int counter = size - 1;
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().equals(o)) {
                return counter;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return new MyLinkedListIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        MyLinkedList<E> myLinkedList = new MyLinkedList<>();
        MyLinkedListIterator iterator = new MyLinkedListIterator(fromIndex);
        int counter = fromIndex;

        while (counter != toIndex + 1 && iterator.hasNext()) {
            myLinkedList.add(iterator.next());
            counter++;
        }
        return myLinkedList;
    }

    @Override
    public boolean retainAll(Collection c) {
        int indexForBoolean = size;
        for (E element : this) {
            if (!c.contains(element)) {
                remove(element);
            }
        }
        return indexForBoolean < size;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class MyLinkedListIterator implements ListIterator<E> {

        private Node<E> current = first;
        private Node<E> afterCurrent = last;

        //конструктор для итератора
        MyLinkedListIterator() {
        }

        //конструктор для итератора c индексом
        MyLinkedListIterator(int index) {
            int counter = 0;
            while (counter != index) {
                current = current.next;
                counter++;
            }
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (hasNext() == false) {
                throw new NoSuchElementException();
            }
            E element = current.element;
            current = current.next;
            return element;
        }

        @Override
        public boolean hasPrevious() {
            return afterCurrent != null;
        }

        @Override
        public E previous() {
            if (hasPrevious() == false) {
                throw new NoSuchElementException();
            }
            E element = afterCurrent.element;
            afterCurrent = afterCurrent.prev;
            return element;
        }

        @Override
        public int nextIndex() {
            if (hasNext() == false) {
                throw new NoSuchElementException();
            }
            int indexForReturn = 0;
            current = current.next;
            indexForReturn++;
            return indexForReturn;
        }

        @Override
        public int previousIndex() {
            if (hasPrevious() == false) {
                throw new NoSuchElementException();
            }
            int indexForReturn = size - 1;
            current = current.prev;
            indexForReturn--;
            return indexForReturn;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }

    @Override
    public String toString() {
        String result = "( ";
        int border = 0;
        for (E elem : this) {
            if (border == size) {
                result += elem + " )";
            } else {
                result += elem + " ";
            }
        }
        return result;
    }
}
