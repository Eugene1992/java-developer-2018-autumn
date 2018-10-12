package java_essential.newStackClass;

import java.util.Arrays;
import java.util.Collection;

public class NewUserStack {
    private static final int DEFAULT_STACK_SIZE = 10;
    private Object[] elementsArray;

    public NewUserStack() {
        this.elementsArray = new Object[DEFAULT_STACK_SIZE];
    }

    public NewUserStack(int size) {
        this.elementsArray = new Object[size];
    }

    public int getCurrentStackSize() {
        return this.elementsArray.length;
    }

    public int getCurrentQuantityOfElements() {
        int currentQuantity = 0;
        for (Object element : this.elementsArray) {
            if (element != null) {
                currentQuantity++;
            } else return currentQuantity;
        }
        return currentQuantity;
    }
    
    private void checkIndexForOut(int index) {
        if (index < 0 || index >= this.elementsArray.length) {
            throw new IndexOutOfBoundsException("Index out of list borders!");
        }
    }

    public void checkEnlargeSize(int additionalSize) {
        if (getCurrentQuantityOfElements() + additionalSize > this.elementsArray.length) {
            Object[] newArray = Arrays.copyOf(this.elementsArray, this.elementsArray.length + additionalSize);
            this.elementsArray = newArray;
        }
    }

    public void push(Object newElement) {
        checkEnlargeSize(1);
        this.elementsArray[getCurrentQuantityOfElements()] = newElement;
    }

    public void push(Collection newCollection) {
        checkEnlargeSize(newCollection.size());
        //int lastPosiotion = getCurrentQuantityOfElements();
        for (Object newElement : newCollection) {
            this.elementsArray[getCurrentQuantityOfElements()] = newElement;
            //lastPosiotion++;
        }
    }

    public Object pull() {
        int lastPosiotion = getCurrentQuantityOfElements() - 1;
        if (lastPosiotion > 0) {
            Object upperElement = this.elementsArray[lastPosiotion];
            this.elementsArray[lastPosiotion] = null;
            return upperElement;
        }
        return null;
    }

    public boolean removeElement(Object targetObject) {
        int lastPosiotion = getCurrentQuantityOfElements() - 1;
        int breakPoint = 0;
        for (int index = lastPosiotion; index >= 0; index--) {
            if (this.elementsArray[index].equals(targetObject)) {
                breakPoint = index;
                removeElementByIndex(breakPoint);
                return true;
            }
        }
        return false;
    }

    public void removeElementByIndex(int removeIndex) {
    	checkIndexForOut(removeIndex);
        Object[] newArray = new Object[this.elementsArray.length];
        System.arraycopy(this.elementsArray, 0, newArray, 0, removeIndex);
        System.arraycopy(this.elementsArray, removeIndex + 1, newArray, removeIndex,
                this.elementsArray.length - removeIndex - 1);
        this.elementsArray = newArray;
    }

    public void insertElementByIndex(int insertIndex, Object newObject) {
    	checkIndexForOut(insertIndex);
        checkEnlargeSize(1);
        Object[] newArray = new Object[this.elementsArray.length + 1];
        System.arraycopy(this.elementsArray, 0, newArray, 0, insertIndex);
        newArray[insertIndex] = newObject;
        System.arraycopy(this.elementsArray, insertIndex, newArray, insertIndex + 1,
                this.elementsArray.length - insertIndex);
        this.elementsArray = newArray;
    }

    public void trimSize() {
        Object[] newArray = Arrays.copyOf(this.elementsArray, getCurrentQuantityOfElements());
        this.elementsArray = newArray;
    }

    public void showStack() {
        System.out.println("UP");
        for (int i = this.elementsArray.length - 1; i >= 0; i--) {
            Object element = elementsArray[i];
            System.out.println(element);
        }
        System.out.println("BOTTOM");
    }
}
