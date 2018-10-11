package java_essential.newStackClass;

import java.util.ArrayList;

public class StackTest {
    public static void main(String[] args) {
        NewUserStack firstStack = new NewUserStack();
        System.out.println(firstStack.getCurrentStackSize());
        System.out.println(firstStack.getCurrentQuantityOfElements());

        NewUserStack secondStack = new NewUserStack(8);
        System.out.println(secondStack.getCurrentStackSize());
        System.out.println(secondStack.getCurrentQuantityOfElements());

        for (int index = 0; index < secondStack.getCurrentStackSize(); index++) {
            firstStack.push(index);
            secondStack.push(index);
        }
        System.out.println("pull");
        secondStack.showStack();
        System.out.println("Pulling " + secondStack.pull());
        secondStack.showStack();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(333);
        arrayList.add(333);
        arrayList.add(333);
        System.out.println("pull collection");
        firstStack.showStack();
        firstStack.push(arrayList);
        System.out.println("Result:");
        firstStack.showStack();
        System.out.println("Quantity of elements: " + firstStack.getCurrentQuantityOfElements());

        firstStack.removeElement(5);
        System.out.println("Remove element 5");
        firstStack.showStack();

        firstStack.insertElementByIndex(4, 777);
        System.out.println("Insert element 777 on 4 position");
        firstStack.showStack();

        System.out.println("Trimming");
        firstStack.trimSize();
        firstStack.showStack();

    }
}
