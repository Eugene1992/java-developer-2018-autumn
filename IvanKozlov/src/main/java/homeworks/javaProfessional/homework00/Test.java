package homeworks.javaProfessional.homework00;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomLinkedList<String> newList = new CustomLinkedList<>();

//        isEmptyTest, should be true
        System.out.println(newList.isEmpty());

//        add test
        newList.add("one");
        newList.add("two");
        newList.add("three");

//        size test, should be three
        System.out.println(newList.size());

//        getTest should return "two"
        System.out.println(newList.get(1));

        newList.add("four");

//        toArray test, should println one --> four in order
        Object[] array = newList.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        contains test, should return true
        System.out.println(newList.contains("four"));

//        contains test, should return false
        System.out.println(newList.contains("five"));

//        add with index test
        newList.add(2, "addedIndexTwo");
        newList.printCustomLinkedListValues();

        System.out.println(newList.size());

//        todo <T> T[] toArray(T[] a) test

//        todo removeAll(Collection<?> c) test

//        todo retainAll(Collection<?> c) test

//        indexOf(Object o) test, should return 1
        newList.add("two");
        System.out.println(newList.indexOf("two"));

//        lastIndexOf(Object o) test should return 5
        System.out.println(newList.lastIndexOf("two"));
        System.out.println(newList.size());


//        remove(Object o) test, should return size 5 and values without "three"
        newList.remove("three");
        System.out.println(newList.size());
        newList.printCustomLinkedListValues();

//        remove(int index) test, should return size 4 and values without "one"
        newList.remove(0);
        System.out.println(newList.size());
        newList.printCustomLinkedListValues();

//        subList(int fromIndex, int toIndex) tested during debug

        newList.add("a");
        newList.add("b");
        newList.add("c");
        newList.add("d");
        newList.add("e");
        newList.add("f");
        newList.add("end");

        newList.printCustomLinkedListValues();

        Object[] sublistedListArray = newList.subList(3, 8).toArray();

//        clear test, should return 0 and true

        newList.clear();
        System.out.println(newList.size());
        System.out.println(newList.isEmpty());

//        addAll tests works))))

        newList.add("one");
        newList.add("two");
        newList.add("three");

        newList.printCustomLinkedListValues();

        LinkedList<String> secondList = new LinkedList<>();
        secondList.add("four");
        secondList.add("five");
        secondList.add("six");

        LinkedList<String> thirdList = new LinkedList<>();
        thirdList.add("seven");
        thirdList.add("eight");
        thirdList.add("nine");

        newList.addAll(secondList);
        System.out.println("Done");
        newList.addAll(1, secondList);

        newList.printCustomLinkedListValues();

//        containsAll test, should return true and false

        System.out.println(newList.containsAll(secondList));
        System.out.println(newList.containsAll(thirdList));

        System.out.println(newList.removeAll(secondList));
        newList.printCustomLinkedListValues();

    }
}
