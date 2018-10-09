package java_essential.homeworks.homework06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List myArrayList = new MyArrayList();


        /** Тест методов isEmpty() и size()*/
        System.out.println("Пустой ли список? " + myArrayList.isEmpty());
        System.out.println("Размер списка = " + myArrayList.size());
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();

        /** Тест метода add(Object o)*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Добавим элемент " + i);
            myArrayList.add(i);
        }
        System.out.println("Пустой ли список? " + myArrayList.isEmpty());
        System.out.println("Размер списка = " + myArrayList.size());
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест метода contains*/
        int a = 1000;
        int b = 3;
        System.out.println("Элемент " + a + " входит в список? - " + myArrayList.contains(a));
        System.out.println("Элемент " + b + " входит в список? - " + myArrayList.contains(b));
        System.out.println();


        /** Тест метода add(int index, Object element)*/
        int k = 100;
        int index = 2;
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println("Добавим элемент " + k + " по индексу " + index);
        myArrayList.add(index, k);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println("Добавим элемент " + (k + 11) + " по индексу " + myArrayList.size());
        myArrayList.add(myArrayList.size(), k + 11);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест методов remove(Object o) и remove(int index)*/
        k = 6;
        index = 6;
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println("Удалим элемент " + k);
        myArrayList.remove((Object) k);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println("Удалим элемент по индексу " + index);
        myArrayList.remove(index);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест метода get(int index)*/
        for (int i = 0; i < myArrayList.size() / 2; i++) {
            System.out.println("Элемент по индексу " + i + " - " + myArrayList.get(i));
        }
        System.out.println();


        /** Тест метода set(int index)*/
        k = 100;
        index = 9;
        System.out.println("Меняем элемент по индексу " + index + " на " + k);
        myArrayList.set(index, k);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест метода indexOf() и lastIndexOf() */
        System.out.println("Индекс первого вхождения елемента " + k + " = " + myArrayList.indexOf(k));
        System.out.println("Индекс последнего вхождения елемента " + k + " = " + myArrayList.lastIndexOf(k));
        System.out.println();


        /** Тест метода addAll(int index, Collection c)*/
        Collection linkedList = new LinkedList();
        System.out.println("Список - " + Methods.output(myArrayList));
        linkedList.add(200);
        linkedList.add(300);
        index = 2;
        System.out.println("Добавляемый Список - " + linkedList + " по индексу " + index);
        myArrayList.addAll(index, linkedList);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест метода addAll(Collection c)*/
        Collection arrayList = new ArrayList();
        System.out.println("Список - " + Methods.output(myArrayList));
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);
        System.out.println("Добавляемый Список - " + arrayList);
        myArrayList.addAll(arrayList);
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println();


        /** Тест метода clear()*/
        System.out.println("Удаляем все элементы методом clear()");
        myArrayList.clear();
        System.out.println("Список - " + Methods.output(myArrayList));
        System.out.println("Пустой ли список? " + myArrayList.isEmpty());


    }


}
