package java_essential.home_work05;

import java.util.Collection;

public class MyArrayList {
    private Object[] arrayForList;
    private Object[] newArrayForChange;
    private int arraySize;

    public MyArrayList() {
        arrayForList = new Object[arraySize];
        arraySize = 10;
    }

    public int size() {
        int counter = 0;
        for (Object arrayElement : arrayForList) {
            if (arrayElement != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isEmpty() {
        for (Object arrayElement : arrayForList) {
            if (arrayElement != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object o) {
        for (Object arrayElement : arrayForList) {
            if (arrayElement.equals(o)) {
                return true;
            }
        }
        return false;
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

    public boolean add(Object o) {
        if (Methods.getLastIndexOfArray(arrayForList) == (arrayForList.length - 1)) {
            Methods.getBiggerArray(arrayForList)[Methods.getLastIndexOfArray(arrayForList) + 1] = o;
            return true;
        } else {
            arrayForList[Methods.getLastIndexOfArray(arrayForList) + 1] = o;
            return true;
        }
    }

    public boolean remove(Object o) {
        for (int i = 0; i < arrayForList.length; i++) {
            if (arrayForList[i].equals(o)) {
                System.arraycopy(arrayForList, (i + 1), arrayForList, i, arrayForList.length - i - 1);
                arrayForList[Methods.getLastIndexOfArray(arrayForList)] = null;
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
            if (index >= (arrayForList.length - 1)) {
                if (index == arrayForList.length) {
                    newArrayForChange = Methods.getBiggerArray(arrayForList);
                    newArrayForChange[index] = element;
                }
                if (index == arrayForList.length) {
                    newArrayForChange = Methods.getBiggerArray(arrayForList);
                    newArrayForChange[index + 1] = newArrayForChange[index];
                    newArrayForChange[index] = element;
                }
            } else {
                if (Methods.getLastIndexOfArray(arrayForList) == (arrayForList.length - 1)) {
                    newArrayForChange = Methods.getBiggerArray(arrayForList);
                    System.arraycopy(newArrayForChange, index, newArrayForChange, index + 1, newArrayForChange.length - index - 1);
                    newArrayForChange[index] = element;
                } else {
                    System.arraycopy(arrayForList, index, arrayForList, index + 1, arrayForList.length - index - 1);
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
