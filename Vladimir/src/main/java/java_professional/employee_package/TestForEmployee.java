package java_professional.employee_package;

import java_professional.linkedlist_package.MyLinkedList;

import java.util.Collections;
import java.util.List;

public class TestForEmployee {
    public static void main(String[] args) {
        List<ComparableEmloyee> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new ComparableEmloyee(153_229_557, "Denis", "Kravets", 50, 50_000, true));
        myLinkedList.add(new ComparableEmloyee(156_564_221, "Andrey", "Lytosh", 45, 45_000, true));
        myLinkedList.add(new ComparableEmloyee(159_741_101, "Irina", "Bal", 40, 75_000, true));
        myLinkedList.add(new ComparableEmloyee(175_195_666, "Matyas", "Petho", 28, 45_000, false));
        myLinkedList.add(new ComparableEmloyee(199_551_337, "Boris", "Taramun", 33, 17_000, false));
        myLinkedList.add(new ComparableEmloyee(176_279_937, "Anna", "Prus", 30, 15_000, true));

        System.out.println(myLinkedList);
        Collections.sort(myLinkedList, new EmployeeComparator());
//            @Override
//            public int compare(ComparableEmloyee o1, ComparableEmloyee o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.size());
    }
}
