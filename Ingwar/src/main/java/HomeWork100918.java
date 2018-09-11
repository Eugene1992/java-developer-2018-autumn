import java.util.Scanner;

public class HomeWork100918 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Задание 2
        //Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        //консоли целое число, чётным либо нечётным.
        System.out.println("Input a number");
        int inputVar = scan.nextInt();
        if (inputVar%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        //Задание 3
        //Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        //Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        System.out.println("Input first number");
        float floatVar1 = scan.nextFloat();
        System.out.println("Input second number");
        float floatVar2 = scan.nextFloat();
        float floatVarDiff1 = 10-floatVar1;
        if (floatVarDiff1 < 0){
            floatVarDiff1 = -floatVarDiff1;
        }
        float floatVarDiff2 = 10-floatVar2;
        if (floatVarDiff2 < 0){
            floatVarDiff2 = -floatVarDiff2;
        }
        if (floatVarDiff1<floatVarDiff2){
            System.out.println(floatVar1 +" closer to 10");
        }
        else { if (floatVarDiff2<floatVarDiff1) {
            System.out.println(floatVar2+" closer to 10");
        } else {
            System.out.println("Both defferences are the same");
        }
        }
        //Задание 4
        //Задано три переменных, найти и вывести на экран переменную с максимальным значением
        //(значения всех переменных разные).
        int intVar1 = 67;
        int intVar2 = 224;
        int intVar3 = 764;

        if (intVar1 > intVar2) {
            if (intVar1 > intVar3) {
                System.out.println("Maximum is " + intVar1);
            } else {
                System.out.println("Maximum is " + intVar3);
            }
        }
            else {
            if (intVar2 > intVar3) {
                System.out.println("Maximum is " + intVar2);
            } else {
                System.out.println("Maximum is " + intVar3);
            }
        }
        //Задание 5
        //Задано четыре переменных, найти и вывести на экран вторую по величине.
        int intVar4 = 67;
        int intVar5 = 224;
        int intVar6 = 764;
        int intVar7 = 338;

        int firstGreat = intVar4;
        int secondGreat = intVar4;

        if (intVar4 > intVar5) {
            secondGreat = intVar5;
        } else {
            firstGreat = intVar5;
        }
        if (intVar6 > firstGreat) {
            secondGreat = firstGreat;
            firstGreat = intVar6;
        } else {
            if (intVar6 > secondGreat) {
                secondGreat = intVar6;
            }
        }
        if (intVar7 > firstGreat) {
            secondGreat = firstGreat;
            firstGreat = intVar7;
        } else {
            if (intVar7 > secondGreat) {
                secondGreat = intVar7;
            }
        }
        System.out.println("Second great is "+secondGreat);

        //
    }
}
