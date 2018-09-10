package homeWork;

public class HomeWork00 {
    public static void main(String[] args) {

       // 1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte a;
        short b;
        int c;
        long d;

        // 2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 50 + 50;

        // 3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        b = 100 - 50;

        // 4. Инициализировать переменную типа int результатом деления двух любых чисел
        c = 100 / 2 ;

        //  5. Инициализировать переменную типа long результатом умножения двух любых чисел
        d = 10 * 10;

        // 6. Передать перменной типа byte результат суммы двух переменной типа byte
        byte one = 10;
        byte  two = 10;
        byte three = (byte) (one + two);

        // 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short A = 10;
        short B = 10;
        byte C = 2;
        byte D = (byte) ((A + B) / C);

        // 8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        int E;
        short oneTask8 = 10;
        short twoTask8 = 10;
        byte A1 = 10;
        byte A2 = 10;
        E = (oneTask8 / twoTask8) * (A1 / A2);

        //  9. Поменять значения двух целочисленных переменных используя третью
        int A3 = 5;
        int A4 = 10;
        int change;
        change = A3;
        A3 = A4;
        A4 = change;
        
        // 10. Поменять значения двух переменных без использования третей
        int first = 10;
        int second = 20;
        first = second * second;
        second = first;

        System.out.println (first);
        System.out.println (second);





    }
}

