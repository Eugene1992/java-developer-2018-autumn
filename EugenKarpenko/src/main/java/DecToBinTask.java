public class DecToBinTask {
    public static void main(String[] args) {

        int a = 99;

        int bin0 = a % 2;
        int dec0 = a / 2;

        int bin1 = dec0 % 2;
        int dec1 = dec0 / 2;

        int bin2 = dec1 % 2;
        int dec2 = dec1 / 2;

        int bin3 = dec2 % 2;
        int dec3 = dec2 / 2;

        int bin4 = dec3 % 2;
        int dec4 = dec3 / 2;

        int bin5 = dec4 % 2;
        int dec5 = dec4 / 2;

        int bin6 = dec5 % 2;
        int dec6 = dec5 / 2;

        int bin7 = dec6 % 2;
        int dec7 = dec6 / 2;


        System.out.println("a DEC = " + a );
        System.out.println("a BIN = " + bin7 + bin6 + bin5 + bin4 + " " + bin3 + bin2 + bin1 + bin0 );

    }
}
