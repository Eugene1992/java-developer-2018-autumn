package java_essential.home_work04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    private final int AMOUNT_LIST_ELEMENT = 100_000;
    private int SOME_ELEMENT = 555;

    public int getSOME_ELEMENT() {
        return this.SOME_ELEMENT;
    }

    public void setSOME_ELEMENT(int SOME_ELEMENT) {
        this.SOME_ELEMENT = SOME_ELEMENT;
    }

    //    метод для сравнивания arrayList и linkedList
    public static void getTwoTableWithArrayAndLinkedLists() {
        Lists objectForOutPutList = new Lists();
        objectForOutPutList.outputNewTablArrayList();
        System.out.println("");
        objectForOutPutList.outputNewTablLinkedList();
    }

    //    метод для подсчета времени любого List
    public void getTablWithSomeList(List<Integer> list) {
        writeHeadOfNewTabl("List");
        initializationList(list, AMOUNT_LIST_ELEMENT);
        List<Long> arrayNewList = new ArrayList<>();
        getNewList(list, arrayNewList);
        getList(arrayNewList);
        System.out.println("");
        writeLine();
    }

    public void outputNewTablArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        writeHeadOfNewTabl(StringForTable.ARRAYLIST.getName());
        initializationList(arrayList, AMOUNT_LIST_ELEMENT);
        List<Long> arrayNewList = new ArrayList<>();
        getNewList(arrayList, arrayNewList);
        getList(arrayNewList);
        System.out.println("");
        writeLine();
    }

    public void outputNewTablLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        writeHeadOfNewTabl(StringForTable.LINKEDLIST.getName());
        initializationList(linkedList, AMOUNT_LIST_ELEMENT);
        List<Long> linkedNewList = new LinkedList<>();
        getNewList(linkedList, linkedNewList);
        getList(linkedNewList);
        System.out.println("");
        writeLine();
    }

    //    метод для инициализации списка
    private void initializationList(List<Integer> list, int AMOUNT_LIST_ELEMENT) {
        for (int i = 0; i < AMOUNT_LIST_ELEMENT; i++) {
            list.add(i);
        }
    }

    //    метод для выбора метода add, get, set, remove и запуска времени
    private long chooseSomeMethod(List<Integer> list, int chooseIndex, int indexNumber, int element) {
        long start;
        switch (chooseIndex) {
            case 1:
                start = System.nanoTime();
                list.add(indexNumber, element);
                return start;
            case 2:
                start = System.nanoTime();
                list.get(indexNumber);
                return start;
            case 3:
                start = System.nanoTime();
                list.set(indexNumber, element);
                return start;
            default:
                start = System.nanoTime();
                list.remove((indexNumber));
                return start;
        }
    }

    //    метод для подсчета времени один раз
    private long countTime(List<Integer> list, int chooseIndex, int indexNumber, int element) {
        long begin = chooseSomeMethod(list, chooseIndex, indexNumber, element);
        long end = System.nanoTime();
        return ((end - begin) / 1_000);
    }

    //метод создания нового списка после подсчета времени при испольованию разных методов в списках
    private List<Long> getNewList(List<Integer> list, List<Long> linkedNewList) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < list.size(); j += (list.size() / 2 - 1)) {
                linkedNewList.add(countTime(list, i, j, 555));
            }
        }
        return linkedNewList;
    }

    //метод для вывода списка
    private void getList(List<Long> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print(checkStr(StringForTable.ADD.getName()));
            }
            if (i == 3) {
                System.out.println();
                System.out.print(checkStr(StringForTable.GET.getName()));
            }
            if (i == 6) {
                System.out.println();
                System.out.print(checkStr(StringForTable.SET.getName()));
            }
            if (i == 9) {
                System.out.println();
                System.out.print(checkStr(StringForTable.REMOVE.getName()));
            }
            if (i == 2 || i == 5 || i == 8 || i == 11) {
                System.out.print(checkStr(Long.toString(list.get(i))) + " ");
                System.out.print(" |");
            } else {
                System.out.print(checkStr(Long.toString(list.get(i))) + " ");
            }
        }
    }

    //    метод для создани таблички
    private void writeHeadOfNewTabl(String str) {
        writeLine();
        System.out.println(checkStr(str) + checkStr(StringForTable.START.getName()) + " " + checkStr(StringForTable.MIDDLE.getName()) + " " + checkStr(StringForTable.END.getName()) + "  |");
        writeLine();
    }

    //    метод для виравнивания каждой ячейки в таблице
    private String checkStr(String str) {
        str.trim();
        for (int i = 0; i < 15; i++) {
            if (str.length() == 15) {
                break;
            }
            if (i % 2 == 0) {
                str = " " + str;
            } else {
                str += " ";
            }
        }
        str = "|" + str;
        return str;
    }

    //    метод для создания линии таблички
    private void writeLine() {
        for (int i = 0; i < 69; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}