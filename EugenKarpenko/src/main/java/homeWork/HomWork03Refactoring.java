package homeWork;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.util.Arrays;

public class HomWork03Refactoring {
    public static void main(String[] args) {

        //1.Вывести в консоль все парные числа одномерного массива.

        System.out.println("Задание 1 - Есть массив array1: ");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));
        System.out.println("Все парные числа массива array1: ");
        getPairedNumbers(array1);
        getDemarcationLine();

        //2. Вывести все числа одномерного массива в обратном порядке.

        System.out.println("Задание 2 - Есть массив array2: ");
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array2));
        System.out.println("Числа массива array2 в обратном порядке: ");
        getArrayRverse(array2);
        getDemarcationLine();

        //3. Вывести первую и вторую половину одномерного массива.

        System.out.println("Задание 3 - Вывести первую и вторую половину одномерного массива.");
        System.out.println("Есть массив array3: ");
        int[] array3 = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(array3));
        System.out.println("Выводем первую половину массива array3: ");
        getFirstArrayPath(array3);
        System.out.println("\nВыводем вторую половину массива array3: ");
        getSecondArrayPath(array3);
        getDemarcationLine();

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.

        System.out.println("Задание 4 - Вывести первую и вторую половину одномерного массива в обратном порядке.");
        System.out.println("Есть массив array4: ");
        int[] array4 = {5, 10, 15, 20, 25, 30};
        System.out.println(Arrays.toString(array4));
        System.out.println("Выводем первую половину массива array4 в обратном порядке:");
        getFirstArrayPartRverse(array4);
        System.out.println("\nВыводем вторую половину массива array4 в обратном порядке:");
        getSecondArrayPartRverse(array4);
        getDemarcationLine();

        //5. Найти сумму всех элементов в массиве.

        System.out.println("Задание 5 - Найти сумму всех элементов в массиве.");
        System.out.println("Есть массив array5: ");
        int[] array5 = {10, 10, 10};
        System.out.println(Arrays.toString(array5));
        System.out.println("Сумма элементов массива array5:");
        System.out.println(calcArraySum(array5));
        getDemarcationLine();

        //6. Найти среднеарифметическое всех чисел массива.

        System.out.println("Задание 6 - Найти среднеарифметическое всех чисел массива.");
        System.out.println("Есть массив array6: ");
        int[] array6 = {15, 25, 10};
        System.out.println(Arrays.toString(array6));
        System.out.println("Среднеарифметическое всех чисел массива array 6:");
        System.out.println(getAverageArray(array6));
        getDemarcationLine();

        //7. Найти минимальное и максимальное число в массиве.

        System.out.println("Задание 7 - Найти минимальное и максимальное число в массиве.");
        System.out.println("Есть массив array7: ");
        int[] array7 = {5, 10, 3, 25, 200};
        System.out.println(Arrays.toString(array7));
        System.out.println("Минимальное число: " + getMinArrayNumber(array7));
        System.out.println("Максимальное число " + getMaxArrayNumber(array7));
        getDemarcationLine();

        //8. Заменить все отрицательные числа в массиве на 0.

        System.out.println("Задание 8 - Заменить все отрицательные числа в массиве на 0.");
        System.out.println("Есть массив array8: ");
        int[] array8 = {5, -10, 3, 25, -1};
        System.out.println(Arrays.toString(array8));
        System.out.println("Массив после замены всех отрицательных числел на 0 :");
        replacNegativeToNull(array8);
        getDemarcationLine();

        //9. Подсчитать одинаковые числа в одномерном массиве.

        System.out.println("Задание 9 - Подсчитать одинаковые числа в одномерном массиве.");
        System.out.println("Есть массив array9: ");
        int[] array9 = {10, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array9));
        calcIdenticalArrayNumbers(array9);
        getDemarcationLine();


        //10. Поменять минимальное и максимальное числа в массиве местами.

        System.out.println();
        System.out.println("Задание 10 - Поменять минимальное и максимальное числа в массиве местами.");
        System.out.println("Есть массив array10: ");
        int[] array10 = {5, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array10));
        System.out.println("Массив после замены: ");
        replaceMinToMaxArrayNumber(array10);
        getDemarcationLine();

        //11. Инвертировать массив.

        System.out.println();
        System.out.println("Задание 11 - Инвертировать массив.");
        System.out.println("Есть массив array11: ");
        int[] array11 = {5, 15, 15, 10, 25, 30};
        System.out.println(Arrays.toString(array11));
        System.out.println("После Инвертирования:");
        getInvertArray(array11);
        getDemarcationLine();

        //12.Вывести в консоль половину массива, среднеарифметическое которых является большим.

        System.out.println("Задание 12 - Вывести в консоль половину массива, среднеарифметическое которых является большим.");
        System.out.println("Есть массив array12:");
        int[] array12 = {10, 10, 25, 10, 10, 10};
        System.out.println(Arrays.toString(array12));
        outMaxAverageArrayHalf(array12);
        getDemarcationLine();

        //13. Найти сумму отрицательных чисел в одномерном массиве.

        System.out.println("Задание 13 - Найти сумму отрицательных чисел в одномерном массиве");
        System.out.println("Есть массив array13:");
        int[] array13 = {10, -10, 10, -10, 10, 10};
        System.out.println(Arrays.toString(array13));
        int SumNegativeNum = calcArrayNegativeNum(array13);
        if (SumNegativeNum < 0) {
            System.out.println("Сумма отрицательных чисел масива: " + SumNegativeNum);
        } else System.out.println("В массиве нету отрицательных чисел!");
        getDemarcationLine();

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
        System.out.println();
        System.out.println("Задание 15 - Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.");
        System.out.println("Есть массив array15:");
        int[] array15 = {25, 30, 23, -10, 0, 10};
        System.out.println(Arrays.toString(array13));
        int firstGreat = array15[0];
        int firstIndex = 0;
        int secondGreat = array15[0];
        int secondIndex = 0;
        int tempGreat = 0;
        for (int count = 0; count < array15.length; count++) {
            if (array15[count] > firstGreat) {
                tempGreat = firstGreat;
                firstGreat = array15[count];
                if (tempGreat > secondGreat) {
                    secondGreat = tempGreat;
                    secondIndex = firstIndex;
                }
                firstIndex = count;
            } else if (array15[count] > secondGreat) {
                secondGreat = array15[count];
                secondIndex = count;
            }
        }
        array15[secondIndex] = array15[0];
        array15[0] = secondGreat;
        array15[firstIndex] = array15[array15.length - 1];
        array15[array15.length - 1] = firstGreat;
        System.out.println("Результат:");
        System.out.println(Arrays.toString(array15));
    }

    /**
     * Метод вывода разделителя между заданиями
     */
    public static void getDemarcationLine() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     * Метод вывода парных чисел
     */

    public static void getPairedNumbers(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Метод вывода одномерного массива в обратном порядке
     */
    public static void getArrayRverse(int array[]) {
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + " ");
        }
    }

    /**
     * Метод вывода первой половины массива
     */
    public static void getFirstArrayPath(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Метод вывода первой половины массива
     */
    public static void getSecondArrayPath(int array[]) {
        for (int i = array.length / 2; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    /**
     * Метод сумы всех элементов массив
     */
    public static double calcArraySum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Метод вывода первой половины массива в обратном рорядке
     */
    public static void getFirstArrayPartRverse(int array[]) {
        for (int i = array.length / 2; i > 0; i--)
            System.out.print(array[i - 1] + " ");
    }

    /**
     * Метод вывода второй половины массива в обратном порядке
     */
    public static void getSecondArrayPartRverse(int array[]) {
        for (int i = array.length; i > array.length / 2; i--)
            System.out.print(array[i - 1] + " ");
    }

    /**
     * Метод нахождения среднего арифметического массива
     */
    public static double getAverageArray(int array[]) {
        double average = calcArraySum(array) / array.length;
        return average;
    }

    /**
     * Метод находения макс. числа массива
     */
    public static int getMaxArrayNumber(int array[]) {
        int maxNumberArray = array[0];
        for (int i = 0; i < array.length; i++)
            if (maxNumberArray < array[i]) {
                maxNumberArray = array[i];
            }
        return maxNumberArray;
    }

    /**
     * Метод определения Index макс. числа  массива
     */
    public static int getMaxArrayNumIndex(int array[]) {
        int maxNumberArray = array[0];
        int maxIndexNumber = 0;
        for (int i = 0; i < array.length; i++)
            if (maxNumberArray < array[i]) {
                maxNumberArray = array[i];
                maxIndexNumber = i;
            }
        return maxIndexNumber;
    }

    /**
     * Метод находения min числа массива
     */
    public static int getMinArrayNumber(int array[]) {
        int minNumberArray = array[0];
        int minIndexNumber = 0;
        for (int i = 0; i < array.length; i++)
            if (minNumberArray > array[i]) {
                minNumberArray = array[i];
                minIndexNumber = i;
            }
        return minNumberArray;
    }

    /**
     * Метод определения Index мин. числа  массива
     */
    public static int getMinArrayNumIndex(int array[]) {
        int minNumberArray = array[0];
        int minIndexNumber = 0;
        for (int i = 0; i < array.length; i++)
            if (minNumberArray > array[i]) {
                minNumberArray = array[i];
                minIndexNumber = i;
            }
        return minIndexNumber;
    }

    /**
     * Метод замены отрицательных чисел на 0
     */
    public static void replacNegativeToNull(int array[]) {
        int replacement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = replacement;
            } else array[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Метод подсчета одинаковые числ в одномерном массиве
     */
    public static void calcIdenticalArrayNumbers(int array[]) {
        System.out.println("Левый столбик - значения массива, правый - количество повторений ");
        int countEqual;
        int elem;
        for (int i = 0; i < array.length; i++) {
            elem = array[i];
            countEqual = 0;
            for (int countIn = 0; countIn < array.length; countIn++) {
                if (elem == array[countIn]) {
                    countEqual++;
                }
            }
            System.out.println(elem + " - " + countEqual);
        }
    }

    /**
     * Метод замены местами  мин. и макс.  значений в масиве
     */
    public static void replaceMinToMaxArrayNumber(int array[]) {

        int maxArray = array[0];
        int maxIndexArray = 0;
        int minArray = array[0];
        int minIndexArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxArray < array[i]) {
                maxArray = array[i];
                maxIndexArray = i;
            } else if (minArray > array[i]) {
                minArray = array[i];
                minIndexArray = i;
            }
        }
        array[maxIndexArray] = minArray;
        array[minIndexArray] = maxArray;
        System.out.println(Arrays.toString(array));
    }

    /**
     * Метод инвертации массива
     */

    public static void getInvertArray(int array[]) {
        int[] intArrayTarget = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            intArrayTarget[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(intArrayTarget));
    }

    /**
     * Метод вывода полвины массива у которого больше среднеарифметическое
     */
    public static void outMaxAverageArrayHalf(int array[]) {
        int sumFirstPart = 0;
        int sumNextPart = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sumFirstPart = sumFirstPart + array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sumNextPart = sumNextPart + array[i];
        }
        double firsPartAverage = sumFirstPart / array.length;
        double nextPartAverage = sumNextPart / array.length;
        if (firsPartAverage < nextPartAverage) {
            System.out.println("Среднеарифметическое второй части массива больше !");
            for (int i = array.length / 2; i < array.length; i++)
                System.out.print(array[i] + ", ");
        }
        if (firsPartAverage > nextPartAverage) {
            System.out.println("Среднеарифметическое первой части массива больше:");
            for (int i = 0; i < array.length / 2; i++)
                System.out.print(array[i] + ", ");
        } else System.out.println("Среднеарифметическое частей одинаковые !");
    }

    /**
     * Сумма негативных чисел в массиве
     */

    public static int calcArrayNegativeNum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) sum = sum + array[i];
        }
        return sum;
    }
}


























