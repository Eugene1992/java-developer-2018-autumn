package java_professional.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        ListIterator<String> fromStartIterator = arrayList.listIterator();

        while (fromStartIterator.hasNext()) {
            String current = fromStartIterator.next();
            if (current.equals("b")) {
                fromStartIterator.set(current.toUpperCase());
                fromStartIterator.add("XXX");
                System.out.println(fromStartIterator.previousIndex());
                System.out.println(fromStartIterator.nextIndex());
            }
        }

        System.out.println(arrayList);

        /*ListIterator<String> fromEndIterator = arrayList.listIterator(arrayList.size());
        while (fromEndIterator.hasPrevious()) {
            System.out.println(fromEndIterator.previous());
        }*/
    }
}
