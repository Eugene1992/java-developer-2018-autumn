package Homeworks.JavaStarter.Homework1;

/*
1. Создать четыре целочисленные переменные типов byte, short, int, long.
2. Инициализировать переменную типа byte результатом суммы двух любых чисел
3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
4. Инициализировать переменную типа int результатом деления двух любых чисел
5. Инициализировать переменную типа long результатом умножения двух любых чисел
6. Передать перменной типа byte результат суммы двух переменной типа byte
7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
9. Поменять значения двух целочисленных переменных используя третью
10. Поменять значения двух переменных без использования третей
 */

public class NumericTypes {
    public static void main(String[] args) {

//        Task 1

        byte byteTypeVariable0;
        short shortTypeVariable0;
        int intTypeVariable0;
        long longTypeVariable;

//        Task 2

        byteTypeVariable0 = 2 + 2;

//        Task 3

        shortTypeVariable0 = 10 - 5;

//        Task 4

        intTypeVariable0 = 4 / 2;

//        Task 5

        longTypeVariable = 3 * 4;

//        Task 6

        byte byteTypeVariable1 = 100;
        byte byteTypeVariable2 = 99;

        byte byteTypeVariable3 = (byte) (byteTypeVariable1 + byteTypeVariable2);

//        Task 7

        short shortTypeVariable1 = 10000;
        short shortTypeVariable2 = 9999;

        byte byteTypeVariable4 = (byte) ((shortTypeVariable1 + shortTypeVariable2) * byteTypeVariable1);

//        Task 8

        int intTypeVariable1 = (int) ((shortTypeVariable1 / shortTypeVariable2) * (byteTypeVariable3 / byteTypeVariable4));

//        Task 9

        int intTypeVariable2;

        intTypeVariable2 = intTypeVariable0;
        intTypeVariable0 = intTypeVariable1;
        intTypeVariable1 = intTypeVariable2;

//        So now intTypeVariable0 has the value of intTypeVariable1 and vice versa

//        Task 10

        int intTypeVariable3 = 5;
        int intTypeVariable4 = 10;

        intTypeVariable3 = intTypeVariable3 + intTypeVariable4;

        intTypeVariable4 = intTypeVariable3 - intTypeVariable4;
        intTypeVariable3 = intTypeVariable3 - intTypeVariable4;

    }
}
