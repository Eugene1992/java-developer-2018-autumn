/**
 * Created by Student on 9/14/2018.
 */

import java.util.Scanner;

import java.util.Arrays;

public class SeaBattle {
    public static void main(String[] args) {
        byte[][] fieldPc = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        byte[][] fieldPlayer = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Scanner scan = new Scanner(System.in);
        System.out.println("Initialising my field");
        for (int count = 0; count < 4; count++) {
            int randomStr = (int) (Math.random() * 4);
            int randomBox = (int) (Math.random() * 4);
            if (fieldPc[randomStr][randomBox] == 0) {
                fieldPc[randomStr][randomBox] = 1;
            } else count--;
        }
        //System.out.println(Arrays.deepToString(fieldPc));
        System.out.println("Input your coordinates");
        System.out.println("From 1 to 4 on both lines");
        for (int count = 1; count < 5; count++) {
            System.out.println("ship " + count + " line");
            int line = scan.nextByte();
            System.out.println("ship " + count + " box");
            int box = scan.nextByte();
            if (line < 1 || line > 4 || box < 1 || box > 4) {
                System.out.println("Wrong coordinates, try another");
                count--;
            } else if (fieldPlayer[line - 1][box - 1] == 1) {
                System.out.println("Box used, try another");
                count--;
            } else fieldPlayer[line - 1][box - 1] = 1;
        }
        //System.out.println(Arrays.deepToString(fieldPlayer));

    }
}
