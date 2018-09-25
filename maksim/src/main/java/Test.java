public class Test {
    public static void main(String[] args) {
        int toBin = 233;
        int toHex = toBin;

        String binRes = "";
        String hexRes = "";

        while (toBin > 0) {
            int cur = toBin % 2;
            binRes = cur + binRes;
            toBin = toBin / 2;
        }

        System.out.println(binRes);


        while (toHex > 0) {
            int cur = toHex % 16;

            if (cur < 10) {
                hexRes = cur + hexRes;
            } else if (cur == 10) {
                hexRes = "A" + hexRes;
            } else if (cur == 11) {
                hexRes = "B" + hexRes;
            } else if (cur == 12) {
                hexRes = "C" + hexRes;
            } else if (cur == 13) {
                hexRes = "D" + hexRes;
            } else if (cur == 14) {
                hexRes = "E" + hexRes;
            } else if (cur == 15) {
                hexRes = "F" + hexRes;
            }

            toHex = toHex / 16;
        }


        System.out.println(hexRes);
    }
}
