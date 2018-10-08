package java_essential.home_work04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    List<Integer> linkedList = new LinkedList<>();

    public void outPutNewLinkedList() {
        initializationList(linkedList);
        List<Long> linkedNewList = new LinkedList<>();
        getNewList(linkedList, linkedNewList);
        getList(linkedNewList);
    }

    List<Integer> arrayList = new ArrayList<>();

    public void outPutNewArrayList() {
        initializationList(arrayList);
        List<Long> arrayNewList = new ArrayList<>();
        getNewList(arrayList, arrayNewList);
        getList(arrayNewList);
    }

    //    метод для инициализации списка
    public void initializationList(List<Integer> list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(i);
        }
    }

    //    метод для выбора метода add, get, set, remove и запуска времени
    public long chooseSomeMethod(List<Integer> list, int chooseIndex, int indexNumber, int element) {
        long start;
        switch (chooseIndex) {
            case 1:
                start = System.currentTimeMillis();
                list.add(indexNumber, element);
                return start;
            case 2:
                start = System.currentTimeMillis();
                list.get(indexNumber);
                return start;
            case 3:
                start = System.currentTimeMillis();
                list.set(indexNumber, element);
                return start;
            default:
                start = System.currentTimeMillis();
                list.remove((indexNumber - 1));
                return start;
        }
    }

    //    метод для подсчета времени один раз
    public long countTime(List<Integer> list, int chooseIndex, int indexNumber, int element) {
        long begin = chooseSomeMethod(list, chooseIndex, indexNumber, element);
        long end = System.currentTimeMillis();
        return end - begin;
    }

    //метод создания нового списка после подсчета времени при испольованию разных методов в списках
    public List<Long> getNewList(List<Integer> list, List<Long> linkedNewList) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < list.size(); j += (list.size() / 2 - 1)) {
                linkedNewList.add(countTime(list, i, j, 555));
            }
        }
        return linkedNewList;
    }

    //метод для вывода списка
    public void getList(List<Long> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

}