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
        makeCapacityBigger();
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
                break;
            }
        }
        if (isFound) {
            values[size - 1] = null;
            size--;
        }
        makeCapacitySmaller();
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
            makeCapacityBigger();
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
        makeCapacitySmaller();
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


    /**
     * Метод, который удаляет из списка все элементы, значения которых равны любому
     * из элементов переданой колекции
     */
    @Override
    public boolean removeAll(Collection c) {
        if (c == null) {
            return false;
        }
        for (Object object : c) {
            while (contains(object)) {
                remove(object);
            }
        }
        return true;
    }


    /**
     * Метод, который проверяет входят ли все элементы передвной
     * колекции в список
     */
    @Override
    public boolean containsAll(Collection c) {
        if (c == null) {
            return false;
        }
        for (Object object : c) {
            if (!contains(object)) {
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
    public boolean addAll(Collection c) {
        return addAll(size, c);
    }


    /**
     * Метод, который вставляет в список все элементы переданой
     * колекции. Вставляет начиная с номера єлемента index
     */
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


    /** Дополнительный метод
     * Метод для разширения списка
     */
    private void makeCapacityBigger() {
        if (capacity == size + 1) {
            capacity = (int) (capacity * 1.5);
            Object[] newValues = new Object[capacity];
            copy(values, newValues, 0, size);
            values = newValues;
            //System.out.println("BIGGER");
        }
    }


    /**
     * Дополнительный метод
     * Метод для сужения списка
     */
    private void makeCapacitySmaller() {
        if (size < capacity / 3) {
            capacity = (int) (capacity * 0.5);
            Object[] newValues = new Object[capacity];
            copy(values, newValues, 0, size);
            values = newValues;
            //System.out.println("SMALLER");
        }
    }

    /** Дополнительный метод
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
