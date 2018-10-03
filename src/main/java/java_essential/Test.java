package java_essential;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(2, "X");
        System.out.println(arrayList);
        arrayList.set(2, "XXX");
        System.out.println(arrayList.get(2));

        arrayList.remove(2);


        System.out.println(arrayList);
    }
}
