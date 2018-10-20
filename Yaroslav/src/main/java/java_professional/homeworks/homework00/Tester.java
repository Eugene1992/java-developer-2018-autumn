package java_professional.homeworks.homework00;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> myLinkedList = new MyLinkedList<>();



        /** Тест методов isEmpty() и size()*/
        System.out.println("\t\t\tTEST: isEmpty(), size()");
        System.out.println("Список пустой? - " + myLinkedList.isEmpty());
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println("Список" + myLinkedList);
        System.out.println("\n");


        /** Тест метода add(Object o)*/
        System.out.println("\t\t\tTEST: add(Object o)");
        int n = 100;
        for (int i = 0; i < 7; i++) {
            System.out.println("Добавим элемент " + n);
            myLinkedList.add(n);
            n += 100;
        }
        System.out.println("Список пустой? - " + myLinkedList.isEmpty());
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println("Список - " + myLinkedList);
        System.out.println("\n");



        /** Тест метода subList(int fromIndex, int toIndex)*/
        System.out.println("\t\t\tTEST: subList(int fromIndex, int toIndex)");
        int fromIndex = 2;
        int toIndex = 5;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Подсписок будет от индекса " + fromIndex + " до " + toIndex);
        List<Integer> sublist = myLinkedList.subList(fromIndex, toIndex);
        System.out.println("Подсписок - " + sublist);
        System.out.println("\n");



        /** Тест метода contains(Object o)*/
        System.out.println("\t\t\tTEST: contains(Object o)");
        int a = 100;
        int b = 3000;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Элемент " + a + " входит в список? - " + myLinkedList.contains(a));
        System.out.println("Элемент " + b + " входит в список? - " + myLinkedList.contains(b));
        System.out.println("\n");



        /** Тест метода add(int index, Object element)*/
        System.out.println("\t\t\tTEST: add(int index, Object element)");
        int k = 100;
        int index = 6;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("Добавим элемент " + k + " по индексу " + index);
        myLinkedList.add(index, k);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест методов remove(Object o) и remove(int index)*/
        System.out.println("\t\t\tTEST: remove(Object o) и remove(int index)");
        k = 400;
        index = 0;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("Удалим элемент " + k);
        myLinkedList.remove((Object) k);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("Удалим элемент по индексу " + index);
        System.out.println(myLinkedList.remove(index));
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест метода get(int index)*/
        System.out.println("\t\t\tTEST: get(int index)");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("Элемент по индексу " + i + " - " + myLinkedList.get(i));
        }
        System.out.println("\n");



        /** Тест метода set(int index)*/
        System.out.println("\t\t\tTEST: set(int index)");
        k = 1000;
        index = 5;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Меняем элемент по индексу " + index + " на " + k);
        myLinkedList.set(index, k);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест метода indexOf() и lastIndexOf()*/
        System.out.println("\t\t\tTEST: indexOf() и lastIndexOf()");
        k = 100;
        System.out.println("Список - " + myLinkedList);
        System.out.println("Индекс первого вхождения елемента " + k + " = " + myLinkedList.indexOf(k));
        System.out.println("Индекс последнего вхождения елемента " + k + " = " + myLinkedList.lastIndexOf(k));
        System.out.println("\n");



        /** Тест метода addAll(int index, Collection c)*/
        System.out.println("\t\t\tTEST: addAll(int index, Collection c)");
        Collection linkedList = new LinkedList();
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        linkedList.add(77);
        linkedList.add(88);
        linkedList.add(99);
        index = 2;
        System.out.println("Добавляемая колекция - " + linkedList + " по индексу " + index);
        myLinkedList.addAll(index, linkedList);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест метода addAll(Collection c)*/
        System.out.println("\t\t\tTEST: addAll(Collection c)");
        Collection arrayList = new ArrayList();
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Добавляемая колекция - " + arrayList);
        myLinkedList.addAll(arrayList);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");




        /** Тест метода containsAll(Collection c)*/
        System.out.println("\t\t\tTEST: containsAll(Collection c)");
        arrayList = new ArrayList();
        System.out.println("Список - " + myLinkedList);
        arrayList.add(-12);
        arrayList.add(-13);
        arrayList.add(-14);
        System.out.println("Колекция - " + arrayList);
        System.out.println("Входит колекция в список? - " + myLinkedList.containsAll(arrayList));
        arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(100);
        System.out.println("Колекция - " + arrayList);
        System.out.println("Входит колекция в список? - " + myLinkedList.containsAll(arrayList));
        System.out.println("\n");



        /** Тест метод removeAll(Collection c)*/
        System.out.println("\t\t\tTEST: removeAll(Collection c)");
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(1);
        System.out.println("Колекция(для удаления) - " + arrayList);
        myLinkedList.removeAll(arrayList);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест метод retainAll(Collection c)*/
        System.out.println("\t\t\tTEST: retainAll(Collection c)");
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(600);
        System.out.println("Колекция(для не удаления) - " + arrayList);
        myLinkedList.retainAll(arrayList);
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("\n");



        /** Тест метода clear()*/
        System.out.println("\t\t\tTEST: clear()");
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("Удаляем все элементы методом clear()");
        myLinkedList.clear();
        System.out.println("Список - " + myLinkedList);
        System.out.println("Размер списка = " + myLinkedList.size());
        System.out.println("Пустой ли список? " + myLinkedList.isEmpty());

/*



        myLinkedList.clear();
        System.out.println("Размер списка - " + myLinkedList.size());
        System.out.println("Список" + myLinkedList);*/
    }
}
