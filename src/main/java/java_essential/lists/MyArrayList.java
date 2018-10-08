package java_essential.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    // TODO: 08.10.2018 +
    @Override
    public int size() {
        return 0;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean isEmpty() {
        return false;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean add(Object o) {
        return false;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean remove(Object o) {
        return false;
    }

    // TODO: 08.10.2018 *
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    // TODO: 08.10.2018 *
    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    // TODO: 08.10.2018 +
    @Override
    public void clear() {

    }

    // TODO: 08.10.2018 +
    @Override
    public Object get(int index) {
        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public Object set(int index, Object element) {
        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public void add(int index, Object element) {

    }

    // TODO: 08.10.2018 +
    @Override
    public Object remove(int index) {
        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    // TODO: 08.10.2018 +
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    // TODO: 08.10.2018 *
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    // TODO: 08.10.2018 *
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
