package java_essential.homeworks.homework06;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    private Object[] values;
    private int size;
    private int capacity;


    /**
     * Конструктор по умолчанию
     */
    public MyArrayList() {
        this.capacity = 10;
        this.values = new Object[capacity];
    }

    /**
     * Конструктор с заданой вместимостью
     */
    MyArrayList(int capacity) {
        this.capacity = capacity;
        this.values = new Object[capacity];
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
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод, который возвращает масив созданый из списка
     */
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        copy(values, array, 0, size);
        return array;
    }

    /**
     * Метод, который добавляет обьект в конец списка
     */
    @Override
    public boolean add(Object o) {
        if (o == null) {
            return true;
        }
        if (capacity == size + 1) {
            makeCapacityBigger();
        }
        values[size] = o;
        size++;
        return true;
    }

    /**
     * Метод, который удаляет первое вхождения обькта о в список если
     * такое есть
     */
    @Override
    public boolean remove(Object o) {
        if (o == null) {
            return true;
        }
        int removedElementIndex;
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                isFound = true;
                removedElementIndex = i;
                for (int j = removedElementIndex; j < size - 1; j++) {
                    values[j] = values[j + 1];
                }
            }
        }
        if (isFound) {
            values[size - 1] = null;
            size--;
        }
        return true;
    }



    /**
     * Метод, который удаляет все элементы из списка
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }

    /**
     * Метод, который возвращает элемент списка по индексу
     */
    @Override
    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        }
        return null;
    }

    /**
     * Метод, который заменяет элемент списка по индексу на новый
     */
    @Override
    public Object set(int index, Object element) {
        if (index < size && index >= 0) {
            values[index] = element;
            return values[index];
        }
        return null;
    }

    /**
     * Метод, который добавляет обьект в список по заданому индексу
     */
    @Override
    public void add(int index, Object element) {
        if (index <= size && index >= 0) {
            if (capacity == size + 1) {
                makeCapacityBigger();
            }
            for (int i = size; i > index; i--) {
                values[i] = values[i - 1];
            }
            values[index] = element;
            size++;
        }
    }

    /**
     * Метод, который удаляет элемент списка по индексу
     */
    @Override
    public Object remove(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size; i++) {
                if (i == size - 1) {
                    values[i] = null;
                    size--;
                    return values[i];
                }
                values[i] = values[i + 1];
            }
        }
        return null;
    }

    /**
     * Метод, который находит индекс первого вхождения данного элемента
     * в список
     */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод, который находит индекс последнего вхождения данного
     * элемента в список
     */
    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i > 0; i--) {
            if (values[i].equals(o)) {
                return i;
            }
        }
        return -1;
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
    public boolean addAll(Collection c) {
        return addAll(size, c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (c == null) {
            return false;
        }
        for (Object element : c) {
            add(index, element);
            index++;
        }
        return true;
    }


    /** Дополнительный метод */
    /**
     * Метод для разширения списка
     */
    private void makeCapacityBigger() {
        capacity = (int) (capacity * 1.5);
        Object[] newValues = new Object[capacity];
        copy(values, newValues, 0, size);
        values = newValues;
    }

    /** Дополнительный метод */
    /**
     * Метод для копирования списка
     */
    private void copy(Object[] arrayWhichCopy, Object[] arrayWhereCopy, int from, int to) {
        for (int i = from, j = 0; i < to; i++, j++) {
            arrayWhereCopy[i] = arrayWhichCopy[j];
        }
    }


    //not used
    @Override
    public Iterator iterator() {
        return null;
    }

    //not used
    @Override
    public ListIterator listIterator() {
        return null;
    }

    //not used
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    //not used
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    //not used
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    //not used
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
