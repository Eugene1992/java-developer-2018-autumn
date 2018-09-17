package homeWork.homeWork003;

public class HomeWork003 {
    public static void main(String[] args) {
        //1. Вывести в консоль все парные числа одномерного массива.
        int[] arr1 = new int[6];
        arr1[0] = 5;
        arr1[1] = 10;
        arr1[2] = 12;
        arr1[3] = 11;
        arr1[4] = 66;
        arr1[5] = 33;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println("Четные " + arr1[i]);
            } else System.out.println("Нечетные" + arr1[i]);

        }

        //2. Вывести все числа одномерного массива в обратном порядке.
        int[] arr2 = new int[6];
        arr2[0] = 31;
        arr2[1] = 32;
        arr2[2] = 33;
        arr2[3] = 34;
        arr2[4] = 35;
        arr2[5] = 36;
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);

        }

        //3. Вывести первую и вторую половину одномерного массива.
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i0 = 0; i0 < arr3.length / 2; i0++) {
            System.out.println("Первая половина " + arr3[i0]);
        }

        for (int i = arr3.length / 2; i <= arr3.length - 1; i++) {
            System.out.println("Вторая половина " + arr3[i]);
        }

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i0 = arr4.length - 5; i0 >= 0; i0--) {
            System.out.println("Первая половина в обратном " + arr4[i0]);
        } //выводит 5 индексов ?????

        for (int i = arr4.length - 1; i >= arr4.length / 2; i--) {
            System.out.println("Вторая половина в обратном " + arr4[i]);
        }

        //5. Найти сумму всех элементов в массиве.
        int[] arr5 = {3, 5, 12, 20};
        int sum = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum = sum + arr5[i];
        }
        System.out.println("Сумма всех элементов " + sum);

        //6. Найти среднеарифметическое всех чисел массива.
        int[] arr6 = {22, 23};
        int sum0 = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum0 += arr6[i];
        }
        System.out.println("Среднее арифметическое " + sum0 / arr6.length);

        //7. Найти минимальное и максимальное число в массиве.
        int[] arr7 = {5, 3, 55, 22, 77, 1};
        int max = arr7[0];
        int min = arr7[0];
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] > max) {
                max = arr7[i];
            }
            if (arr7[i] < min) {
                min = arr7[i];
            }
        }System.out.println("Min - " + min + " " + "Max - " + max);
    }
}
