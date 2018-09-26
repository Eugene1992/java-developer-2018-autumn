package starter;

public class HomeWorkDecToBin {

    public static void main(String[] args) {
        byte initNumber = 6;
        System.out.println("Decimal number " + initNumber);
        int number = initNumber;
        int symbol8 = number % 2;
        number = number - symbol8;
        number = number / 2;
        int symbol7 = number % 2;
        number = number - symbol7;
        number = number / 2;
        int symbol6 = number % 2;
        number = number - symbol6;
        number = number / 2;
        int symbol5 = number % 2;
        number = number - symbol5;
        number = number / 2;
        int symbol4 = number % 2;
        number = number - symbol4;
        number = number / 2;
        int symbol3 = number % 2;
        number = number - symbol3;
        number = number / 2;
        int symbol2 = number % 2;
        number = number - symbol2;
        number = number / 2;
        int symbol1 = number % 2;
        //number = number-symbol1;
        System.out.println("Binary number " + symbol1 + symbol2 + symbol3 + symbol4 + symbol5 + symbol6 + symbol7 + symbol8);
    }

}
