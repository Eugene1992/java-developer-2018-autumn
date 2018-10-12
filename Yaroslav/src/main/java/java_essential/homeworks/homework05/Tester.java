package java_essential.homeworks.homework05;

//import java_essential.homeworks.homework06.MyArrayList;

import java_essential.home_work05.MyArrayList;
import java_essential.newListClass.NewUserList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Клас тестер, вызывающий метод run класа TimeCounter
 */
public class Tester {
    public static final int LIST_SIZE = 3_000_000;


    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        TimeCounter tc = new TimeCounter(arrayList, LIST_SIZE);
        tc.run();

        List<Object> linkedList = new LinkedList<>();
        tc = new TimeCounter(linkedList, LIST_SIZE);
        tc.run();

        List<Object> myArrayList = new java_essential.homeworks.homework06.MyArrayList();
        tc = new TimeCounter(myArrayList, LIST_SIZE);
        tc.run();

        List<Object> myArrayList2 = new NewUserList();
        tc = new TimeCounter(myArrayList2, LIST_SIZE);
        tc.run();

        List<Object> myArrayList3 = new MyArrayList();
        tc = new TimeCounter(myArrayList3, LIST_SIZE);
        tc.run();
    }
}
