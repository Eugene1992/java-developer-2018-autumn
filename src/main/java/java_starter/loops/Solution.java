package java_starter.loops;

public class Solution {
    public static void main(String[] args) {
        int a = 8888;
        int toBin = a;
        int toHex = a;

        String binResult = "";
        String hexResult = "";

        while (toBin > 0) {
            binResult = toBin % 2 + binResult;
            toBin /= 2;
        }

        System.out.println(binResult);

        while (toHex > 0) {
            int curr = toHex % 16;
            if (curr > 9) {
                switch (curr) {
                    case 10:
                        hexResult = "A" + hexResult;
                        break;
                    case 11:
                        hexResult = "B" + hexResult;
                        break;
                    case 12:
                        hexResult = "C" + hexResult;
                        break;
                    case 13:
                        hexResult = "D" + hexResult;
                        break;
                    case 14:
                        hexResult = "E" + hexResult;
                        break;
                    case 15:
                        hexResult = "F" + hexResult;
                        break;
                }
            } else {
                hexResult = curr + hexResult;
            }
            toHex /= 16;
        }

        System.out.println(hexResult);
    }
}
