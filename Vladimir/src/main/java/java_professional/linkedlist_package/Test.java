package java_professional.linkedlist_package;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> listForTest = new MyLinkedList<>();
        List<Integer> listFor = new MyLinkedList<>();
        listFor.add(10);
        listFor.add(11);
        listFor.add(24);
        System.out.println("Size: " + listForTest.size());
        System.out.println("List is empty: " + listForTest.isEmpty());
        listForTest.add(5);
        listForTest.add(6);
        listForTest.add(7);
        listForTest.add(9);
        System.out.println("List is empty: " + listForTest.isEmpty());
        System.out.println("Size: " + listForTest.size());
        System.out.println("List contains 8: " + listForTest.contains(8));
        System.out.println("List contains 5: " + listForTest.contains(5));
        System.out.println(Arrays.toString(listForTest.toArray()));
        System.out.println(listForTest.remove(1));
        System.out.println(Arrays.toString(listForTest.toArray()));
        System.out.println(listForTest.addAll(listFor));
        System.out.println(Arrays.toString(listForTest.toArray()));
        System.out.println(listForTest.addAll(2, listFor));
        System.out.println(Arrays.toString(listForTest.toArray()));
        listForTest.clear();
        System.out.println("Size: " + listForTest.size());
        listForTest.add(20);
        listForTest.add(21);
        listForTest.add(22);
        listForTest.add(23);
        listForTest.add(24);
        listForTest.add(21);
        System.out.println("Get: " + listForTest.get(2));
        System.out.println("Set: " + listForTest.set(2, 55));
        System.out.println("Index of 21 is: " + listForTest.indexOf(21));
        System.out.println("Last Index of 21 is: " + listForTest.lastIndexOf(21));
        listForTest.add(1, 77);
        System.out.println(Arrays.toString(listForTest.toArray()));
        System.out.println("Remove with index 2:" + listForTest.remove(2));
        listForTest.subList(2, 3);
        System.out.println(Arrays.toString(listForTest.subList(2, 3).toArray()));
        System.out.println(Arrays.toString(listForTest.toArray()));
        System.out.println("Size: " + listForTest.size());
        listForTest.removeAll(listFor);
        System.out.println(Arrays.toString(listForTest.toArray()));

    }
}