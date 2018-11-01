package java_essential.home_work05;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList();
        MyArrayList my1 = new MyArrayList();


        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.set(0, 3);
        System.out.println(myList.set(0, 3));

    }
}
