package homeworks.javaEssential.homework03;

import java.util.*;

public class CustomArrayList implements List{

    private final int DEFAULT_CAPATHITY = 10;
    private final double DEFAULT_INCREMENTOR = 1.5;

    private Object[] bufferArray = {10};
    private Object[] valuesArray = {};

    public CustomArrayList() {

    }

    public CustomArrayList(int size) {
        if(size > 0) {
            valuesArray = new Object[size];
            increaseBufferArray();
        }
    }

    private void increaseBufferArray() {
        if(bufferArray.length >= DEFAULT_CAPATHITY) {
            bufferArray = new Object[(int) (bufferArray.length * DEFAULT_INCREMENTOR)];
        } else {
            bufferArray = new Object[DEFAULT_CAPATHITY];
        }
    }

    private int getNotNullElementsAmount(Object array) {
        int counter = 0;
        for (Object object : bufferArray) {
            if(object != null) {
                counter++;
            }
        }
        return counter;
    }

    private void setValuesArrayLength(int neededLength) {
        valuesArray = new Object[neededLength];
    }

    private void fillValueArrayWithVlaues() {
        for (int i = 0; i < valuesArray.length; i++) {
            for (Object object : bufferArray) {
                if(object != null) {
                    valuesArray[i] = object;
                }
            }
        }
    }

    private boolean isEnoughLengthForNewElements(int newElementsAmount) {
        return ((size() + newElementsAmount) <= bufferArray.length);
    }

    private boolean isIndexValidForCurrentLength(int index) {
        return index <= size();
    }



    // TODO: 08.10.2018 +
    @Override
    public int size() {
        return valuesArray.length;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean contains(Object object) {
        boolean containsObject = false;
        for (int i = 0; i < size(); i++) {
            if(valuesArray[i].equals(object)) {
                containsObject = true;
                break;
            }
        }
        return containsObject;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public Object[] toArray() {
        Object[] convertedToArrayList = new Object[size()];

        for (int i = 0; i < size(); i++) {
            convertedToArrayList[i] = valuesArray[i];
        }
        return convertedToArrayList;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean add(Object object) {
        if(isEnoughLengthForNewElements(1)) {
            bufferArray[size()] = object;
        } else {
            increaseBufferArray();
            bufferArray[size() + 1] = object;
        }
        setValuesArrayLength(getNotNullElementsAmount(bufferArray));
        fillValueArrayWithVlaues();
        return true;
    }

    // TODO: 08.10.2018 +
    @Override
    public boolean remove(Object objectToFind) {
        for (int i = 0; i < bufferArray.length; i++) {
            if (bufferArray[i].equals(objectToFind)) {
                bufferArray[i] = null;
            }
        }
//        todo code duplication, need refactoring
        setValuesArrayLength(getNotNullElementsAmount(bufferArray));
        fillValueArrayWithVlaues();
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
        for (int i = 0; i < bufferArray.length; i++) {
            bufferArray[i] = null;
        }

        valuesArray = new Object[0];
    }

    // TODO: 08.10.2018 +
    @Override
    public Object get(int index) {
        Object elementByIndex = null;
        if(isIndexValidForCurrentLength(index)) {
            elementByIndex = valuesArray[index];
        }
        return elementByIndex;
    }

    // TODO: 08.10.2018 +
    @Override
    public Object set(int index, Object element) {
        Object oldValue = null;
        if(isIndexValidForCurrentLength(index)){
            oldValue = valuesArray[index];
            valuesArray[index] = element;
        }

        return oldValue;
    }

    // TODO: 08.10.2018 +
    @Override
    public void add(int index, Object element) {
        if(isIndexValidForCurrentLength(index)) {
            Object[] arrayPartAfterIndex = new Object[size() - index + 1];
        }
    }

    // TODO: 08.10.2018 +
    @Override
    public Object remove(int index) {

        return null;
    }

    // TODO: 08.10.2018 +
    @Override
    public int indexOf(Object object) {
        int indexOfObject = -1;
        for (int i = 0; i < size(); i++) {
            if(valuesArray[i].equals(object)) {
                indexOfObject = i;
                break;
            }
        }
        return indexOfObject;
    }

    // TODO: 08.10.2018 +
    @Override
    public int lastIndexOf(Object object) {
        int lastIndex = -1;
        for (int i = size(); i >= 0 ; i--) {
            if (valuesArray[i].equals(object)) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
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
