import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array01 = new int[35];

        System.out.println("Все");
        for (int num = 0; num < array01.length; num++) {
            array01[num] = random.nextInt(100);
            System.out.print(array01[num] + " ");
        }


        //1. Вывести в консоль все парные числа одномерного массива.

        System.out.println();
        System.out.println("Парные");

        for (int num = 0; num < array01.length; num++) {
            if (array01[num] % 2 == 0) {
                System.out.print(array01[num] + " ");
            }
        }

        System.out.println();

        //2. Вывести все числа одномерного массива в обратном порядке.
        int[] array02 = new int[15];

        System.out.println("Вперед");
        for (int num = 0; num < array02.length; num++) {
            array02[num] = random.nextInt(100);
            System.out.print(array02[num] + " ");
        }

        System.out.println();
        System.out.println("Назад");
        for (int num = array02.length - 1; num >= 0; num--) {
            System.out.print(array02[num] + " ");
        }

        System.out.println();

        //3. Вывести первую и вторую половину одномерного массива.
        int[] array03 = new int[50];

        System.out.println("Все:");
        for (int num = 0; num < array03.length; num++) {
            array03[num] = random.nextInt(100);
            System.out.print(array03[num] + " ");
        }

        System.out.println();
        System.out.println("Первая половина:");

        for (int num = 0; num < array03.length / 2; num++) {
            System.out.print(array03[num] + " ");
        }

        System.out.println();
        System.out.println("Вторая половина:");

        for (int num = array03.length / 2; num < array03.length; num++) {
            System.out.print(array03[num] + " ");
        }

        System.out.println();
        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.

        int[] array04 = new int[50];

        System.out.println("Все:");
        for (int num = 0; num < array04.length; num++) {
            array04[num] = random.nextInt(501);
            System.out.print(array04[num] + " ");
        }


        System.out.println();
        System.out.println("Первая половина:");


        for (int num = array04.length - 1; num >= array04.length / 2; num--) {
            System.out.print(array04[num] + " ");
        }


        System.out.println();
        System.out.println("Вторая половина:");
        for (int num = array04.length / 2 - 1; num >= 0; num--) {
            System.out.print(array04[num] + " ");
        }


        System.out.println();
        //5. Найти сумму всех элементов в массиве.
        //6. Найти среднеарифметическое всех чисел массива.
        //7. Найти минимальное и максимальное число в массиве.
        int[] array567 = new int[20];

        System.out.println("Все :");
        for (int num = 0; num < array567.length; num++) {
            array567[num] = random.nextInt(501);
            System.out.print(array567[num] + " ");
        }
        int sum = array567[0];
        int max = array567[0];
        int min = array567[0];
        System.out.println();
        for (int num = 1; num < array567.length; num++) {
            sum += array567[num];
            if (array567[num] > max) {
                max = array567[num];
            }
            if (array567[num] < min) {
                min = array567[num];
            }
        }
        int mid = sum / array567.length;
        System.out.println("Сума = " + sum);
        System.out.println("Среднее = " + mid);
        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);

        System.out.println();
        //8. Заменить все отрицательные числа в массиве на 0.
        int[] array8 = new int[10];

        System.out.println("Все:");
        for (int num = 0; num < array8.length; num++) {
            array8[num] = random.nextInt();
            System.out.print(array8[num] + " ");
        }

        System.out.println();
        System.out.println("После:");

        for (int num = 0; num < array8.length; num++) {
            if (array8[num] < 0) {
                array8[num] = 0;
            }
            System.out.print(array8[num] + " ");
        }

        System.out.println();
        //10. Поменять минимальное и максимальное числа в массиве местами.
        int[] array10 = new int[20];

        System.out.println("После:");
        for (int num = 0; num < array10.length; num++) {
            array10[num] = random.nextInt(501);
            System.out.print(array10[num] + " ");
        }

        int max2 = array10[0];
        int min2 = array10[0];
        int minp = 0, maxp = 0;

        System.out.println();

        for (int num = 1; num < array10.length; num++) {
            if (array10[num] > max2) {
                max2 = array10[num];
                maxp = num;
            }
            if (array10[num] < min2) {
                min2 = array10[num];
                minp = num;
            }
        }

        array10[maxp] += array10[minp];
        array10[minp] = array10[maxp] - array10[minp];
        array10[maxp] = array10[maxp] - array10[minp];

        System.out.println("После:");
        for (int num = 0; num < array10.length; num++) {
            System.out.print(array10[num] + " ");
        }
        System.out.println();
        //13. Найти сумму отрицательных чисел в одномерном массиве.
        int[] array13 = new int[10];
        System.out.println("All:");
        for (int num = 0; num < array13.length; num++) {
            array13[num] = -random.nextInt(50);
            if (random.nextInt(2) == 1) {
                array13[num] *= -random.nextInt(10);
            }
            System.out.print(array13[num] + " ");
        }
        int sum13 = 0;
        for (int num = 0; num < array13.length; num++) {
            if (array13[num] < 0) {
                sum13 += array13[num];
            }
        }
        System.out.println();

        if (sum13 == 0) {
            System.out.println("Нету отр. чисел");
        } else {
            System.out.println("Сума = " + sum13);
        }
        System.out.println();
        // 14.Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.

        int[] array14 = new int[10];

        System.out.println("Все:");
        for (int num = 0; num < array14.length; num++) {
            array14[num] = random.nextInt(50);
        }

        array14[random.nextInt(10)] = 0;

        for (int num = 0; num < array14.length; num++) {
            System.out.print(array14[num] + " ");
        }
        System.out.println();
        System.out.println("До нуля 0:");

        int numIn14 = 0;
        if (array14[0] == 0) {
            System.out.println("0 - первое число");
        }
        while (array14[numIn14] != 0) {
            System.out.print(array14[numIn14] + " ");
            numIn14++;
        }

        System.out.println();
        //16.Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
        int[] array16 = new int[20];

        System.out.println("Все:");
        for (int num = 0; num < array16.length; num++) {
            array16[num] = random.nextInt(501);
            System.out.print(array16[num] + " ");
        }

        int minIn16 = array16[0];
        int posMinIn16 = 0;

        System.out.println();

        for (int num = 1; num < array16.length; num++) {
            if (array16[num] < minIn16) {
                minIn16 = array16[num];
                posMinIn16 = num;
            }
        }

        System.out.println("До минимального: ");
        if (posMinIn16 == 0) {
        }
        for (int num = 0; num < posMinIn16; num++) {
            System.out.print(array16[num] + " ");
        }

        System.out.println();
        //18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
        int[] array18 = new int[20];

        System.out.println("Все:");
        for (int num = 0; num < array18.length; num++) {
            array18[num] = random.nextInt(501);
            System.out.print(array18[num] + " ");
        }

        int minIn18 = array18[0];
        int posMinIn18 = 0;

        System.out.println();

        for (int num = 1; num < array18.length; num++) {
            if (array18[num] < minIn18) {
                minIn18 = array18[num];
                posMinIn18 = num;
            }
        }

        System.out.println("Минимум = " + minIn18);

        if (posMinIn18 < array18.length / 2) {
            System.out.println("первая половина :");
            for (int num = 0; num < array18.length / 2; num++) {
                System.out.print(array18[num] + " ");
            }
        } else {
            System.out.println("Вторая половина:");
            for (int num = array18.length / 2; num < array18.length; num++) {
                System.out.print(array18[num] + " ");
            }
        }
        System.out.println();
    }
    }

