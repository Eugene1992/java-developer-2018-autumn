package HomeWork01;

import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int LENGTH = 4; // можно ставить любой размер >= 2 и будет работать
        int[] arr = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            System.out.println("Enter " + (i + 1) + " number:");
            arr[i] = scan.nextInt();
        }

        System.out.print("Entered numbers: ");
        Print(arr);

        Sort(arr);

        System.out.print("Sorted numbers: ");
        Print(arr);

        if (LENGTH >= 2)
            System.out.println("Second biggest number: " + arr[1]);
        else
            System.out.println("Array size is less than 2");
    }

    private static void Print(int[] arr){
        for (int anArr : arr) System.out.print(anArr + " ");
        System.out.println();
    }

    private static void Sort(int[] arr){
        int temp, index;
        for (int counter = 1; counter < arr.length; counter++){
            temp = arr[counter];
            index = counter - 1;
            while (index >= 0 && arr[index] < temp){
                arr[index + 1] = arr[index];
                arr[index] = temp;
                index--;
            }
        }
    }

}

// Задание 5
// Задано четыре переменных, найти и вывести на экран вторую по величине.