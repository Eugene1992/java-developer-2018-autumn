package workPracticeStart;

import java.util.Scanner;

public class CalcHexLoop {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Input value");
        int num = scan2.nextInt();
        String st = "";

        while (num != 0) {
            int d = num % 16;
            if (d < 10) {
                st = d + st;
            } else {
                switch (d) {
                    case 10:
                        st = "A" + st;
                        break;
                    case 11:
                        st = "B" + st;
                        break;
                    case 12:
                        st = "C" + st;
                        break;
                    case 13:
                        st = "D" + st;
                        break;
                    case 14:
                        st = "E" + st;
                        break;
                    case 15:
                        st = "F" + st;
                        break;

                }
            }
            num = num / 16;
        }
        System.out.println(st);
    }
}
