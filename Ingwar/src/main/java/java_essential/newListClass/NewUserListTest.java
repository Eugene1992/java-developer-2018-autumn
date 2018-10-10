package java_essential.newListClass;

import java.util.ArrayList;

public class NewUserListTest {
    public static void main(String[] args) {
        NewUserList testList = new NewUserList();
        for (int index = 0; index < 10; index++) {
            testList.add(444);
        }
        printTestList(testList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(333);
        arrayList.add(333);
        arrayList.add(333);
        testList.addAll(3, arrayList);
        printTestList(testList);

        System.out.println(testList.indexOf(333));
        System.out.println(testList.lastIndexOf(333));

        System.out.println(testList.containsAll(arrayList));

        testList.removeAll(arrayList);
        printTestList(testList);

    }

    private static void printTestList(NewUserList testList) {
        System.out.println("Capacity " + testList.getCapacity());
        System.out.println("Size " + testList.getSize());
        for (Object element : testList.getElementsArray()) {
            System.out.println(element);
        }
    }
}
