package java_essential.newListClass;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NewUserList implements List {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;
    private Object[] elementsArray;

    public NewUserList() {
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
        this.elementsArray = new Object[DEFAULT_CAPACITY];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public Object[] getElementsArray() {
        return elementsArray;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object newObject) {
        for (int index = 0; index < this.size; index++) {
            if (this.elementsArray[index].equals(newObject)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray = new Object[this.size];
        for (int index = 0; index < this.size; index++) {
            objectArray[index] = this.elementsArray[index];
        }
        return objectArray;
    }

    @Override
    public boolean add(Object newObject) {
        this.size++;
        checkAndEnlargeCapacity(0);
        this.elementsArray[this.size - 1] = newObject;
        return true;
    }

    @Override
    public boolean remove(Object newObject) {
        return removeElementFromList(newObject);
    }

    @Override
    public boolean addAll(Collection newCollection) {
        checkAndEnlargeCapacity(newCollection.size());
        for (Object newObject : newCollection) {
            this.add(newObject);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection newCollection) {
        checkIndexForOut(index);
        checkAndEnlargeCapacity(newCollection.size());
        insertCollectionIntoList(index, newCollection);
        return true;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[DEFAULT_CAPACITY];
        this.elementsArray = newArray;
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
    }

    @Override
    public Object get(int index) {
        checkIndexForOut(index);
        return this.elementsArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        checkIndexForOut(index);
        this.elementsArray[index] = element;
        return this.elementsArray[index];
    }//что тут возвращать? ArrayList возвращает старое значение

    @Override
    public void add(int index, Object element) {
        this.size++;
        checkIndexForOut(index);
        checkAndEnlargeCapacity(0);
        insertElementIntoList(index, element);
    }

    @Override
    public Object remove(int index) {
        checkIndexForOut(index);
        removeElementByIndex(index);
        this.size--;
        return this.elementsArray[index];
    }//что тут возвращать? ArrayList возвращает старое значение

    @Override
    public int indexOf(Object newObject) {
        for (int index = 0; index < this.size; index++) {
            Object element = this.elementsArray[index];
            if (element.equals(newObject)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object newObject) {
        for (int index = this.size - 1; index >= 0; index--) {
            Object element = this.elementsArray[index];
            if (element.equals(newObject)) {
                return index;
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

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection newCollection) {
        boolean objectRemoved = false;
        for (Object newObject : newCollection) {
            objectRemoved = removeElementFromList(newObject);
        }
        return objectRemoved;
    }

    @Override
    public boolean containsAll(Collection newCollection) {
        int objectCount = 0;
        for (Object newObject : newCollection) {
            if (contains(newObject)) {
                objectCount++;
            }
        }
        return objectCount == newCollection.size();
    }//true - только если все элементы коллекции есть в списке

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private void checkAndEnlargeCapacity(int addCapacity) {
        if (this.size + addCapacity + 1 >= this.capacity) {
            this.capacity = (this.capacity + addCapacity) * 3 / 2 + 1;
            Object[] newArray = new Object[this.capacity];
            for (int index = 0; index < this.size; index++) {
                newArray[index] = this.elementsArray[index];
            }
            this.elementsArray = newArray;
        }
    }

    private boolean removeElementFromList(Object newObject) {
        boolean objectRemoved = false;
        for (int index = 0; index < this.size; index++) {
            if (this.elementsArray[index].equals(newObject)) {
                removeElementByIndex(index);
                this.size--;
                objectRemoved = true;
                index--;
            }//объект может присутствовать не один раз
        }
        return objectRemoved;
    }

    private void removeElementByIndex(int indexRemove) {
        Object[] newArray = new Object[this.capacity];
//        for (int index = 0; index < indexRemove; index++) {
//            newArray[index] = this.elementsArray[index];
//        }
//        if (indexRemove + 1 < this.size) {
//            for (int index = indexRemove + 1; index < this.size; index++) {
//                newArray[index - 1] = this.elementsArray[index];
//            }
//        }
        System.arraycopy(this.elementsArray, 0, newArray, 0, indexRemove);
        if (indexRemove + 1 < this.size) {
            System.arraycopy(this.elementsArray, indexRemove + 1, newArray, indexRemove,
                    this.size - indexRemove - 1);
            }
        this.elementsArray = newArray;
    }

    private void checkIndexForOut(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of list borders!");
        }
    }

    private void insertCollectionIntoList(int indexInsert, Collection newCollection) {
        Object[] newArray = new Object[this.capacity];
        this.size += newCollection.size();
//        int breakPoint = 0;
//        for (int index = 0; index < indexInsert; index++) {
//            newArray[index] = this.elementsArray[index];
//            breakPoint++;
//        }
//        for (Object newObject : newCollection) {
//            newArray[indexInsert] = newObject;
//            indexInsert++;
//        }
//        if (indexInsert < this.size) {
//            for (int index = indexInsert; index < this.size; index++) {
//                breakPoint++;
//                newArray[index] = this.elementsArray[breakPoint];
//            }
//        }
        System.arraycopy(this.elementsArray, 0, newArray, 0, indexInsert);
        int index = indexInsert;
        for (Object newObject : newCollection) {
            newArray[index] = newObject;
            index++;
        }
        if (index < this.size) {
            System.arraycopy(this.elementsArray, indexInsert, newArray, index,
                    this.size - indexInsert - 1);
        }
        this.elementsArray = newArray;
    }

    private void insertElementIntoList(int indexInsert, Object element) {
        Object[] newArray = new Object[this.capacity];
//        for (int index = 0; index < indexInsert; index++) {
//            newArray[index] = this.elementsArray[index];
//        }
//        newArray[indexInsert] = element;
//        if (indexInsert < this.size) {
//            for (int index = indexInsert + 1; index < this.size; index++) {
//                newArray[index] = this.elementsArray[index - 1];
//            }
//        }
        System.arraycopy(this.elementsArray, 0, newArray, 0, indexInsert);
        newArray[indexInsert] = element;
        System.arraycopy(this.elementsArray, indexInsert, newArray, indexInsert + 1,
                this.size - indexInsert - 1);
        this.elementsArray = newArray;
    }
}
