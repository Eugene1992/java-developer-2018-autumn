package java_professional.newLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewUserLinkedListTest {
    public static void main(String[] args) {
        NewUserLinkedList<String> testList = new NewUserLinkedList<>();
        for (int index = 0; index < 10; index++) {
            testList.add("444");
        }
        System.out.println(testList.size());
//        Iterator<String> iterator = testList.listIterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("333");
        arrayList.add("555");
        arrayList.add("666");
        testList.addAll(3, arrayList);
        printTestList(testList);

//        System.out.println(testList.indexOf("333"));
//        System.out.println(testList.lastIndexOf("333"));
//
        System.out.println(testList.containsAll(arrayList));
//
//        testList.removeAll(arrayList);
//        printTestList(testList);

//        List subList = testList.subList(2,5);
//        printTestList(subList);

//        Object[] arrayFromList = testList.toArray(new Object[5]);
//        System.out.println(Arrays.toString(arrayFromList));

        NewUserLinkedList<Employee> newList = new NewUserLinkedList<>();
        newList.add(new Employee("Bonnie", 30, 15000));
        newList.add(new Employee("Greg", 25, 13000));
        newList.add(new Employee("Bill", 28, 11000));
        newList.add(new Employee("Jill", 23, 12000));
        newList.add(new Employee("Jeff", 20, 9000));

        Collections.sort(newList, new NewUserLinkerListComparator());
        printTestList(newList);

        Collections.sort(newList);
        printTestList(newList);

    }

    public static void printTestList(NewUserLinkedList<String> testList) {
        for (String element : testList) {
            System.out.println(element);
        }
    }

    public static void printTestList(List testList) {
        for (Object element : testList) {
            System.out.println(element);
        }
    }
}
