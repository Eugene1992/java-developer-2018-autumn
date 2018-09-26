package starter;

import java.util.Scanner;

public class DecToBinHex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input desired calculation system: 16, 8 or 2");
        String system1Calc = scan.next();
        String finalNumber = " ";
        System.out.println("Input decimal number");
        long initNumber = scan.nextLong();
        switch (system1Calc) {
            case "16":
                while (initNumber > 0) {
                    long symbol = initNumber % 16;
                    initNumber = initNumber - symbol;
                    initNumber = initNumber / 16;
                    if (symbol <= 9) {
                        finalNumber = symbol + finalNumber;
                    } else {
                        if (symbol == 10) {
                            finalNumber = "A" + finalNumber;
                        } else if (symbol == 11) {
                            finalNumber = "B" + finalNumber;
                        } else if (symbol == 12) {
                            finalNumber = "C" + finalNumber;
                        } else if (symbol == 13) {
                            finalNumber = "D" + finalNumber;
                        } else if (symbol == 14) {
                            finalNumber = "E" + finalNumber;
                        } else if (symbol == 15) {
                            finalNumber = "F" + finalNumber;
                        }
                    }
                }
                finalNumber = "0x" + finalNumber;
                break;
            case "8":
                while (initNumber > 0) {
                    long symbol = initNumber % 8;
                    initNumber = initNumber - symbol;
                    initNumber = initNumber / 8;
                    finalNumber = symbol + finalNumber;
                }
                break;
            case "2":
                int count = 1;
                while (initNumber > 0) {
                    if (count % 5 == 0) {
                        finalNumber = " " + finalNumber;
                    }
                    long symbol = initNumber % 2;
                    initNumber = initNumber - symbol;
                    initNumber = initNumber / 2;
                    finalNumber = symbol + finalNumber;
                    count++;
                }
                finalNumber = "0" + finalNumber;
                break;
            default:
                System.out.println("Calculation system not recognized");
        }
        if (finalNumber != " ") {
            System.out.println("Transformed to " + finalNumber);
        }

    }
}
