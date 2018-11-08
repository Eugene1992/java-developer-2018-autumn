package homeworks.javaProfessional.homework00;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomLinkedList<E> implements List<E> {

    private int size = 0;
    private Node<E> firstNode;
    private Node<E> lastNode;

    private static class Node<E> {
        E value;
        Node<E> nextNode;
        Node<E> previousNode;

        Node(Node<E> previousNode, E value, Node<E> nextNode) {
            this.previousNode = previousNode;
            this.value = value;
            this.nextNode = nextNode;
        }
    }

    public CustomLinkedList() {
        firstNode = new Node<>(null, null, lastNode);
        lastNode = new Node<>(firstNode, null, null);
//        todo ask why?
        firstNode.nextNode = lastNode;
    }

    private Node<E> createEmptyNode() {
        return new Node<>(null, null, null);
    }

    private void incrementSize() {
        size++;
    }

    private void decrementSize() {
        size--;
    }

    public void printCustomLinkedListValues() {
        Node<E> currentNode = firstNode.nextNode;

        do {
            System.out.println(currentNode.value);
            currentNode = currentNode.nextNode;
        } while (currentNode.value != null);
    }

    private Node getNodeByIndex(int index) {
        if(isIndexNotLargerThanSize(index)) {
            Node nodeWithNeededIndex = firstNode.nextNode;

            for(int i = 0; i < index; i++) {
                nodeWithNeededIndex = nodeWithNeededIndex.nextNode;
            }

            return nodeWithNeededIndex;
        } else {
            return null;
        }
    }

    private int getNodeIndexByValue(E value) {
        int nodeWIthValueIndex = -1;
        Node currentNode = firstNode.nextNode;

        for(int i = 0; i < size; i++) {
            if(getNodeByIndex(i).value.equals(value)) {
                nodeWIthValueIndex = i;
                break;
            } else {
                currentNode = currentNode.nextNode;
            }
        }
        return nodeWIthValueIndex;
    }

    private boolean isIndexNotLargerThanSize(int index) {
        return (index <= size);
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
        boolean contains = false;

        for (int i = 0; i < size; i++) {
            if(this.get(i).equals(o)) {
                contains = true;
                break;
            }
        }

        return contains;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private Node currentNode = firstNode.nextNode;

            @Override
            public boolean hasNext() {
                return currentNode.nextNode != lastNode;
            }

            @Override
            public E next() {
//                перекинь ссилку
                currentNode = currentNode.nextNode;
                return (E) currentNode.value;
            }

            @Override
            public void remove() {
                currentNode = currentNode.nextNode;
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];

        for (int i = 0; i < size; i++) {
            array[i] = this.get(i);
        }
        return array;
    }

    //    todo
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

//    todo use here add(int index, E e) function
    @Override
    public boolean add(E e) {
        Node<E> newNode = lastNode;
        newNode.value = e;
        newNode.nextNode = new Node<>(newNode, null, null);
        lastNode = newNode.nextNode;

        incrementSize();

        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean elementIsPresent = false;

        if(getNodeIndexByValue((E)o) != -1) {
            remove(getNodeIndexByValue((E) o));
            elementIsPresent = true;
        }
        return elementIsPresent;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean containsAllOfTheElements = true;
        for (Object o : c) {
            if(!this.contains(o)) {
                containsAllOfTheElements = false;
                break;
            }
        }
        return containsAllOfTheElements;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            this.add(e);
        }
        return true;
    }

    //    todo refactor to let index be 0 :)
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        int indexToAdd = index;
        for (E e : c) {
            this.add(indexToAdd, e);
            indexToAdd++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removedAny = false;

        for (Object o : c) {
            for (E e : this) {
                if(e.equals(o)) {
                    this.remove(e);
                    removedAny = true;
                }
            }
        }

        return removedAny;
    }

    //    todo
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        while (!this.isEmpty()) {
            this.remove(0);
        }
    }

    @Override
    public E get(int index) {
        Node<E> currentNode = firstNode.nextNode;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }

    @Override
    public E set(int index, E element) {
        E valueToReturn = (E) getNodeByIndex(index).value;

        getNodeByIndex(index).value = element;

        return valueToReturn;
    }

//    todo fix, so that it can be reused in add(E e) function
    @Override
    public void add(int index, E element) {
        if(isIndexNotLargerThanSize(index)) {
            Node nodeToAdd = new Node(getNodeByIndex(index - 1), element, getNodeByIndex(index));

            nodeToAdd.previousNode.nextNode = nodeToAdd;
            nodeToAdd.nextNode.previousNode = nodeToAdd;

            incrementSize();
        }
    }

    @Override
    public E remove(int index) {

        if(isIndexNotLargerThanSize(index)) {
            Node nodeToRemove = getNodeByIndex(index);

            nodeToRemove.nextNode.previousNode = nodeToRemove.previousNode;
            nodeToRemove.previousNode.nextNode = nodeToRemove.nextNode;

            decrementSize();

            return (E) nodeToRemove;
        }

        return null;
    }

    //    code duplicate
    @Override
    public int indexOf(Object o) {
        int index = -1;
        Node currentNode = firstNode.nextNode;

        for(int i = 0; i < size; i++) {
            if (currentNode.value.equals(o)) {
                index = i;
                break;
            }
            currentNode= currentNode.nextNode;
        }

        return index;
    }

    //    code duplicate
    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        Node currentNode = firstNode.nextNode;

        for(int i = 0; i < size; i++) {
            if (currentNode.value.equals(o)) {
                index = i;
            }
            currentNode= currentNode.nextNode;
        }

        return index;
    }

    //    todo
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    //    todo
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        CustomLinkedList<E> listToReturn = new CustomLinkedList<>();

        for (int i = fromIndex; i < toIndex; i++) {
            listToReturn.add((E) getNodeByIndex(i));
        }
        return listToReturn;
    }
}
