package java_starter.homework00;

public class HomeWork {
    public static void main(String[] args) {
//        1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte a;
        short b;
        int c;
        long d;

//        2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 5 + 6;

//        3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        b = 1279 - 54;

//        4. Инициализировать переменную типа int результатом деления двух любых чисел
        c = 100000 / 2;

//        5. Инициализировать переменную типа long результатом умножения двух любых чисел
        d = 32 * 55;

//        6. Передать перменной типа byte результат суммы двух переменной типа byte
        byte s1 = 5;
        byte s2 = 9;
        byte sum = (byte) (s1 + s2);

//        7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short sh1 = 150;
        short sh2 = 155;
        byte by = 5;
        byte rez = (byte) ((sh1 + sh2) / by);

//        8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        short sho1 = 300;
        short sho2 = 150;
        byte by1 = 8;
        byte by2 = 4;
        int r = (sho1 / sho2) * (by1 / by2);

//        9. Поменять значения двух целочисленных переменных используя третью
        int first = 5;
        int second = 10;
        int change;
        change = first;
        first = second;
        second = change;

//        10. Поменять значения двух переменных без использования третей
        int home1 = 12;
        int home2 = 15;
        home1 = home1 + home2;
        home2 = home1 - home2;
        home1 = home1 - home2;
    }
}
