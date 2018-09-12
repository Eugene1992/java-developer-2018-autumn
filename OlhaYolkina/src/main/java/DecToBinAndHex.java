import java.util.Scanner;

public class DecToBinAndHex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write number");
        int number = scan.nextInt();
        int dec, remainder;

        String binNumber = "";
        dec = number / 2;
        remainder = number % 2;
        binNumber = remainder + binNumber;

        do {
            remainder = dec % 2;
            dec = dec / 2;
            binNumber = remainder + binNumber;
        }
        while (dec != 0);

        System.out.println(number + " in Bin = " + binNumber);
    }
}
