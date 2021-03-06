package java_essential.home_work05;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    private Object[] arrayForList;
    private Object[] newArrayForChange;
    private int capasity;
    private int size = 0;


    public MyArrayList() {
        capasity = 10;
        arrayForList = new Object[capasity];

    }

    public int size() {
        return size;
//        int counter = 0;
//        for (Object arrayElement : arrayForList) {
//            if (arrayElement != null) {
//                counter++;
//            }
//        }
//        return counter;
    }

    public boolean isEmpty() {
        return size == 0;
//        for (Object arrayElement : arrayForList) {
//            if (arrayElement != null) {
//                return false;
//            }
//        }
//        return true;
    }

    public boolean contains(Object o) {
        for (Object arrayElement : arrayForList) {
            if (arrayElement.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        newArrayForChange = new Object[size()];
        int i = 0;
        for (Object arrayElement : arrayForList) {
            newArrayForChange[i] = arrayElement;
            i++;
        }
        return newArrayForChange;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (size >= arrayForList.length) {
            arrayForList = Methods.getBiggerArray(arrayForList);
            arrayForList[size] = o;
            size++;
            return true;
        } else {
            arrayForList[size] = o;
            size++;
            return true;
        }
    }

    public boolean remove(Object o) {
        for (int i = 0; i < arrayForList.length; i++) {
            if (arrayForList[i].equals(o)) {
                System.arraycopy(arrayForList, (i + 1), arrayForList, i, arrayForList.length - i - 1);
                arrayForList[Methods.getLastIndexOfArray(arrayForList)] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean addAll(Collection c) {
        while (arrayForList.length < Methods.getLastIndexOfArray(arrayForList) + 1 + c.size()) {
            Methods.getBiggerArray(arrayForList);
        }
        System.arraycopy(c.toArray(), 0, arrayForList, Methods.getLastIndexOfArray(arrayForList) + 1, c.size());
        return true;
    }

    public boolean addAll(int index, Collection c) {
        try {
            while (arrayForList.length < Methods.getLastIndexOfArray(arrayForList) + c.size() - index) {
                Methods.getBiggerArray(arrayForList);
            }
            System.arraycopy(c.toArray(), index, arrayForList, Methods.getLastIndexOfArray(arrayForList) + 1, c.size() - index - 1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not found element with your index");
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    public void clear() {
        for (Object arrayElement : arrayForList) {
            arrayElement = null;
        }
    }

    public Object get(int index) {
        return arrayForList[index];
    }

    public Object set(int index, Object element) {
        try {
            arrayForList[index] = element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not found element with your index");
        }
        return element;
    }

    public void add(int index, Object element) {
        try {
            if (index >= (size - 1)) {
                if (index == size - 1) {
                    arrayForList = Methods.getBiggerArray(arrayForList);
                    arrayForList[index] = element;
                }
                if (index == size) {
                    arrayForList = Methods.getBiggerArray(arrayForList);
                    arrayForList[index + 1] = arrayForList[index];
                    arrayForList[index] = element;
                }
            } else {
                if (Methods.getLastIndexOfArray(arrayForList) == (size - 1)) {
                    arrayForList = Methods.getBiggerArray(arrayForList);
                    System.arraycopy(arrayForList, index, arrayForList, index + 1, size - index - 1);
                    arrayForList[index] = element;
                } else {
                    System.arraycopy(arrayForList, index, arrayForList, index + 1, size - index - 1);
                    arrayForList[index] = element;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not found element with your index");
        }
    }

    public Object remove(int index) {
        Object removeObject = arrayForList[index];
        try {
            System.arraycopy(arrayForList, index + 1, arrayForList, index, arrayForList.length - index - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not found element with your index");
        }
        return removeObject;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < arrayForList.length; i++) {
            if (arrayForList[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = arrayForList.length - 1; i >= 0; i--) {
            if (arrayForList[i].equals(o)) {
                return i;
            }
        }
        return -1;
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

    public boolean removeAll(Collection c) {
        int variableForBooleanReturn = 0;
        for (Object elementCollection : c) {
            remove(elementCollection);
            if (remove(elementCollection)) {
                variableForBooleanReturn++;
            }
        }
        return variableForBooleanReturn == c.size();

    }

    public boolean containsAll(Collection c) {
        int variableForBooleanReturn = 0;
        for (Object elementCollection : c) {
            add(elementCollection);
            variableForBooleanReturn++;
        }
        return variableForBooleanReturn == c.size();
    }

}
