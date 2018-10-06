package java_essential.homeworks.homework05;

import java.util.List;

/**
 * Клас с методами утилитами
 */

public class Methods {


    /**
     * Метод, который возвращает строку( в которой выбраный символ вводиться заданое количество раз
     */
    public static String outputSymbols(char symbol, int numberOfSymbols) {
        String result = "";
        for (int i = 0; i < numberOfSymbols; i++) {
            result += symbol;
        }
        return result;
    }

    /**
     * Метод необходимый для коректного отображения таблицы. Он заполняет строку subStr пробелами
     * с обоих сторон пока длина subStr не станет равна mainStr
     */
    public static String outputForTable(String mainStr, String subStr) {
        do {
            subStr = " " + subStr;
            if (subStr.length() == mainStr.length() - 1) {
                break;
            }
            subStr = subStr + " ";
        } while (subStr.length() < mainStr.length() - 1);
        subStr = subStr + "|";
        return subStr;
    }


    /**
     * Метод инициализирующий список значениями
     */
    public static List initializeList(List<Object> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }
}
