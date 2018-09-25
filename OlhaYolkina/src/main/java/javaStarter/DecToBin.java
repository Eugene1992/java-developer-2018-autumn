package javaStarter;

public class DecToBin {
    public static void main(String[] args) {
        int a = 52;
        int dec = a / 2;
        int a0 = a % 2;
        int dec0 = dec / 2;
        int a1 = dec % 2;
        int dec1 = dec0 / 2;
        int a2 = dec0 % 2;
        int dec2 = dec1 / 2;
        int a3 = dec1 % 2;
        int dec3 = dec2 / 2;
        int a4 = dec2 % 2;
        int dec4 = dec3 / 2;
        int a5 = dec3 % 2;
        int dec5 = dec4 / 2;
        int a6 = dec4 % 2;
        int a7 = dec5 % 2;
        System.out.print(a + " = " + a7 + a6 + a5 + a4 + a3 + a2 + a1 + a0);
    }
}
