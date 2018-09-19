package homeWork;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.util.Arrays;

public class HomWork03 {
    public static void main(String[] args) {

        //1.Вывести в консоль все парные числа одномерного массива.

        System.out.println("Задание 1 - Вывести в консоль все парные числа одномерного массива.");
        System.out.println("Есть массив array1: ");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println("Все парные числа массива array1: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) System.out.print(array1[i] + ", ");
        }

        //2. Вывести все числа одномерного массива в обратном порядке.

        System.out.println();
        System.out.println("Задание 2 - Вывести все числа одномерного массива в обратном порядке.");
        System.out.println("Есть массив array2: ");
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array2));
        System.out.println();
        System.out.println("Числа массива array2 в обратном порядке: ");
        for (int i = array2.length; i > 0; i--) System.out.print(array2[i - 1] + ", ");

        //3. Вывести первую и вторую половину одномерного массива.

        System.out.println();
        System.out.println("Задание 3 - Вывести первую и вторую половину одномерного массива.");
        System.out.println("Есть массив array3: ");
        int[] array3 = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(array3));
        System.out.println();
        System.out.println("Выводем первую половину массива array3: ");
        for (int i = 0; i < array3.length / 2; i++) System.out.print(array3[i] + ", ");
        System.out.println();
        System.out.println("Выводем вторую половину массива array3: ");
        for (int i = array3.length / 2; i < array3.length; i++) System.out.print(array3[i] + ", ");

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.

        System.out.println();
        System.out.println("Задание 4 - Вывести первую и вторую половину одномерного массива в обратном порядке.");
        System.out.println("Есть массив array4: ");
        int[] array4 = {5, 10, 15, 20, 25, 30};
        System.out.println(Arrays.toString(array4));
        System.out.println();
        System.out.println("Выводем первую половину массива array4 в обратном порядке:");
        for (int i = array4.length / 2; i > 0; i--) System.out.print(array4[i - 1] + ", ");
        System.out.println();
        System.out.println("Выводем вторую половину массива array4 в обратном порядке:");
        for (int i = array4.length; i > array4.length / 2; i--) System.out.print(array4[i - 1] + ", ");

        //5. Найти сумму всех элементов в массиве.

        System.out.println();
        System.out.println("Задание 5 - Найти сумму всех элементов в массиве.");
        System.out.println("Есть массив array5: ");
        int[] array5 = {10, 10, 10};
        System.out.println(Arrays.toString(array5));
        System.out.println();
        System.out.println("Сумма элементов массива array5:");
        int sumArray5 = 0;
        for (int i = 0; i < array5.length; i++) {
            sumArray5 = array5[i] + sumArray5;
        }
        System.out.println(sumArray5);

        //6. Найти среднеарифметическое всех чисел массива.
        System.out.println();
        System.out.println("Задание 6 - Найти среднеарифметическое всех чисел массива.");
        System.out.println("Есть массив array6: ");
        double[] array6 = {15, 25, 10};
        System.out.println(Arrays.toString(array6));
        System.out.println();
        System.out.println("Среднеарифметическое всех чисел массива array 6:");
        double sumArray6 = 0;
        double averageArray6 = 0;
        for (int i = 0; i < array6.length; i++) {
            sumArray6 = array6[i] + sumArray6;
            averageArray6 = sumArray6 / array6.length;
        }
        System.out.println(averageArray6);

        //7. Найти минимальное и максимальное число в массиве.
        System.out.println();
        System.out.println("Задание 7 - Найти минимальное и максимальное число в массиве.");
        System.out.println("Есть массив array7: ");
        int[] array7 = {5, 10, 3, 25, 200};
        System.out.println(Arrays.toString(array7));
        System.out.println();
        int maxArray7 = array7[0];
        int minArray7 = array7[0];
        for (int i = 0; i < array7.length; i++) {
            if (maxArray7 < array7[i]) {
                maxArray7 = array7[i];
            } else if (minArray7 > array7[i]) {
                minArray7 = array7[i];
            }
        }
        System.out.println("Максимальное число: " + maxArray7 + " Минимальное число: " + minArray7);

        //8. Заменить все отрицательные числа в массиве на 0.

        System.out.println();
        System.out.println("Задание 8 - Заменить все отрицательные числа в массиве на 0.");
        System.out.println("Есть массив array8: ");
        int[] array8 = {5, -10, 3, 25, -1};
        System.out.println(Arrays.toString(array8));
        System.out.println();
        int replacement = 0;
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] < 0) {
                array8[i] = replacement;
            } else array8[i] = array8[i];
        }
        System.out.println("Массив после замены всех отрицательных числел на 0 :");
        for (int element : array8) System.out.print(element + ", ");

        //9. Подсчитать одинаковые числа в одномерном массиве.
        System.out.println();
        System.out.println("Задание 9 - Подсчитать одинаковые числа в одномерном массиве.");
        System.out.println("Есть массив array9: ");
        int[] array9 = {10, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array9));
        int countEqual;
        int elem;
        System.out.println();
        System.out.println("Левый столбик - значения массива, правый - количество повторений ");
        for (int i = 0; i < array9.length; i++) {
            elem = array9[i];
            countEqual = 0;
            for (int countIn = 0; countIn < array9.length; countIn++) {
                if (elem == array9[countIn]) {
                    countEqual++;
                }
            }
            System.out.println(elem + " - " + countEqual);
        }

        //10. Поменять минимальное и максимальное числа в массиве местами.

        System.out.println();
        System.out.println("Задание 10 - Поменять минимальное и максимальное числа в массиве местами.");
        System.out.println("Есть массив array10: ");
        int[] array10 = {5, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array10));
        int maxArray10 = array10[0];
        int maxIndexArray10 = 0;
        int minArray10 = array10[0];
        int minIndexArray10 = 0;
        for (int i = 0; i < array10.length; i++) {
            if (maxArray10 < array10[i]) {
                maxArray10 = array10[i];
                maxIndexArray10 = i;
            } else if (minArray10 > array10[i]) {
                minArray10 = array10[i];
                minIndexArray10 = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + maxArray10 + " Минимальное число: " + minArray10);
        array10[maxIndexArray10] = minArray10;
        array10[minIndexArray10] = maxArray10;
        System.out.println("Массив после хамены :");
        System.out.println(Arrays.toString(array10));

        //11. Инвертировать массив.

        System.out.println();
        System.out.println("Задание 11 - Инвертировать массив.");
        System.out.println("Есть массив array11: ");
        int[] array11 = {5, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array11));
        int[] intArrayTarget = new int[array11.length];
        for (int i = array11.length - 1; i >= 0; i--) {
            intArrayTarget[array11.length - 1 - i] = array11[i];
        }
        System.out.println("Инвертированный массив:");
        System.out.println(Arrays.toString(intArrayTarget));

        //12.Вывести в консоль половину массива, среднеарифметическое которых является большим.

        System.out.println();
        System.out.println("Задание 12 - Вывести в консоль половину массива, среднеарифметическое которых является большим.");
        System.out.println("Есть массив array12:");
        int[] array12 = {10, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(array12));
        int sumFirstPart = 0;
        int sumNextPart = 0;
        for (int i = 0; i < array12.length / 2; i++) {
            sumFirstPart = sumFirstPart + array12[i];
        }
        for (int i = array12.length / 2; i < array12.length; i++) {
            sumNextPart = sumNextPart + array12[i];
        }
        double firsPartAverage = sumFirstPart / array12.length;
        double nextPartAverage = sumNextPart / array12.length;
        if (firsPartAverage < nextPartAverage) {
            System.out.println("Среднеарифметическое второй части массива больше !");
            for (int i = array12.length / 2; i < array12.length; i++)
                System.out.print(array12[i] + ", ");
        }
        if (firsPartAverage > nextPartAverage) {
            System.out.println("Среднеарифметическое первой части массива больше:");
            for (int i = 0; i < array12.length / 2; i++)
                System.out.print(array12[i] + ", ");
        } else System.out.println("Среднеарифметическое частей одинаковые !");

        //13. Найти сумму отрицательных чисел в одномерном массиве.
        System.out.println();
        System.out.println("Задание 13 - Найти сумму отрицательных чисел в одномерном массиве");
        System.out.println("Есть массив array13:");
        int[] array13 = {10, -10, 10, -10, 10, 10};
        System.out.println(Arrays.toString(array13));
        int sumNegativNumber = 0;
        for (int i = 0; i < array13.length; i++) {
            if (array13[i] < 0) sumNegativNumber = sumNegativNumber + array13[i];
        }
        if (sumNegativNumber < 0) System.out.println("Сумма отрицательных чисел масива: " + sumNegativNumber);
        else System.out.println("В массиве нету отрицательных чисел!");

        //14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.

        System.out.println();
        System.out.println("Задание 14 - Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно");
        System.out.println("Есть массив array14:");
        int[] array14 = {10, -10, 10, -10, 0, 10};
        System.out.println(Arrays.toString(array14));
        for (int i = 0; i < array14.length; i++) {
            if (array14[i] == 0) {
                break;
            } else System.out.print(array14[i] + ", ");
        }

        //15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        // TODO: 19.09.2018
        /*16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены
        до минимального элемента всего массива.*/
        /*System.out.println();
        System.out.println("Задание 16: ");
        System.out.println("Есть массив array16:");
        int[] array16 = {10, -10, 40, 30, 1, 10};
        System.out.println(Arrays.toString(array16));
        int minArray16 = array16[0];
        int minIndexArray16 = 0;
        for (int i = 0; i < array16.length; i++){
            if (array16[i] < minArray16){
                minArray16 = array16[i];
                minIndexArray16 = i;
            }
            System.out.println("Элементы массива до минимального элемента в массиве: ");
            for (int i = 0; i < minIndexArray16; i++)
        }*/
    }
}










