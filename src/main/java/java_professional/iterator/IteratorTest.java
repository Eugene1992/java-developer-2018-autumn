package java_professional.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("b")) {
                iterator.remove();
            } else {
                System.out.println(next);
            }
        }

        /*for (String s : arrayList) {
            System.out.println(s);
        }*/
    }
}
