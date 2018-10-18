package java_professional.homeworks.homework00;


import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.add(100);
        myLinkedList.add(200);
        myLinkedList.add(300);
        myLinkedList.add(400);
        myLinkedList.add(500);
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.remove((Integer)300);
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.contains(100));
        System.out.println(myLinkedList.contains(400));
        System.out.println(myLinkedList.contains(1000));
    }
}
