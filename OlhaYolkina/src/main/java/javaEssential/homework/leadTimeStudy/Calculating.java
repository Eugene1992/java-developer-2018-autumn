package javaEssential.homework.leadTimeStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Calculating {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        arrayList = inputList(arrayList);
        linkedList = inputList(linkedList);

        int[][] arrayListResults = calculateValuesForOneList(arrayList);
        int[][] linkedListResults = calculateValuesForOneList(linkedList);

        outputResults(compareResults(arrayListResults, linkedListResults));
    }

    public static int oneChecking(List<Integer> list, int position, String functionName) {
        long start = System.currentTimeMillis();
        if (functionName.equals("get")) {
            for (int i = 0; i < 100_000; i++) {
                list.get(position);
            }
        }
        if (functionName.equals("add")) {
            for (int i = 0; i < 100_000; i++) {
                list.add(position, 777);
            }
        }
        if (functionName.equals("set")) {
            for (int i = 0; i < 100_000; i++) {
                list.set(position, 777);
            }
        }
        if (functionName.equals("remove")) {
            for (int i = 0; i < 100_000; i++) {
                list.remove(position);
            }
        }
        long end = System.currentTimeMillis();
        return (int) (end - start);
    }

    public static List<Integer> inputList(List<Integer> list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(0, 333);
        }
        return list;
    }

    public static int calculateAvarageValue(List<Integer> list, int position, String functionName) {
        long sumTime = 0;
        for (int i = 0; i < 100; i++) {
            sumTime += oneChecking(list, position, functionName);
        }
        return (int) (sumTime / 100_000);
    }

    public static int[] calculateValuesForOneFunction(List<Integer> list, String functionName) {
        int[] results = new int[3];
        results[0] = calculateAvarageValue(list, 0, functionName);
        results[1] = calculateAvarageValue(list, list.size() / 2, functionName);
        results[2] = calculateAvarageValue(list, list.size() - 1, functionName);
        return results;
    }

    public static int[][] calculateValuesForOneList(List<Integer> list) {
        int[][] results = new int[4][3];
        results[0] = calculateValuesForOneFunction(list, "get");
        results[1] = calculateValuesForOneFunction(list, "add");
        results[2] = calculateValuesForOneFunction(list, "set");
        results[3] = calculateValuesForOneFunction(list, "remove");
        return results;
    }

    public static String[][] compareResults(int[][] arrayListResults, int[][] linkedListResults) {
        String[][] results = new String[5][4];
        results[0][0] = "Function/Position";
        results[0][1] = "start";
        results[0][2] = "middle";
        results[0][3] = "end";
        results[1][0] = "get";
        results[2][0] = "add";
        results[3][0] = "set";
        results[4][0] = "remove";
        for (int i = 1; i < results[0].length; i++) {
            for (int j = 1; j < results[1].length; j++) {
                if (arrayListResults[i-1][j-1] > linkedListResults[i-1][j-1]) {
                    results[i][j] = "Array List better: (arr " + arrayListResults[i-1][j-1] + " to link " + linkedListResults[i-1][j-1] + ")";
                } else if (arrayListResults[i-1][j-1] < linkedListResults[i-1][j-1]) {
                    results[i][j] = "Linked List better: (arr " + arrayListResults[i-1][j-1] + " to link " + linkedListResults[i-1][j-1] + ")";
                } else {
                    results[i][j] = "Equal: (arr " + arrayListResults[i-1][j-1] + " to link " + linkedListResults[i-1][j-1] + ")";
                }
            }
        }
        return results;
    }

    public static void outputResults(Object[][] results) {
        for (int i = 0; i < results[0].length; i++) {
            for (int j = 0; j < results[1].length; j++) {
                System.out.print(results[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
