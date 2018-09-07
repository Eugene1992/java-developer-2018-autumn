package java_starter.variables;

public class DataTypeCasts {
    public static void main(String[] args) {
        byte a = 10;

        int b = a; // not danger cast

        int d = 300;
        byte c = (byte) d; // danger cast

        System.out.println(c);

//        1110 1101 1110 1100 1101 1010 1010 1010
//                                      0000 0000
//        ---------------------------------------
//                                      1010 1010

    }
}
