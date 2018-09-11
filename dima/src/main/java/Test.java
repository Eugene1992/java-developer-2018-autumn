public class Test {
        public static void main(String[] args) {
            byte firstNumber = 10;
            short secondNumber = 100;
            int thirdNumber = 1000;
            long fourthNumber = 10000;
            System.out.println(firstNumber);
            System.out.println(secondNumber);
            System.out.println(thirdNumber);
            System.out.println(fourthNumber);
            byte firstAdd = 2;
            byte secondAdd = 13;
            System.out.println(firstAdd + secondAdd);
            short firstSubtractor = 100;
            short secondSubtractor = 39;
            System.out.println(firstSubtractor - secondSubtractor);
            int firstDivider = 5000;
            int secondDivider = 1000;
            System.out.println(firstDivider / secondDivider);
            long firstMultiplier = 1500;
            long secondMultiplier = 300;
            System.out.println(firstMultiplier * secondMultiplier);
            byte firstNumberforSumm = 20;
            byte secondNumberforSumm = 30;
            byte thirdNumberforSumm = (byte) (firstNumberforSumm + secondNumberforSumm);
            System.out.println(thirdNumberforSumm);
            byte fouthNumberforSumm = 10;
            byte fifthNumberforSumm = 20;
            byte sixNumberforDivider = 5;
            short firstResult = (byte) (fouthNumberforSumm + fifthNumberforSumm);
            short thirdResult = (byte) (firstResult / sixNumberforDivider);
            System.out.println(thirdResult);
            short firstIntNumber = 200;
            short secondIntnumber = 100;
            byte thirdIntnumber = 2;
            byte fourthIntnumber = 4;
            byte fifthIntnumber = (byte) (fourthIntnumber / thirdIntnumber);
            short sixIntnumber = (short) (firstIntNumber / secondIntnumber);
            int sevensIntnumber = (short) sixIntnumber * (byte) fifthIntnumber;
            System.out.println(sevensIntnumber);
            byte a = 6;
            byte b = 7;
            byte c;
            c = a;
            a = b;
            b = c;
            System.out.println(a);
            System.out.println(b);
            int q = 5;
            int w = 6;
            q=w+w;
            w=q-w;
            System.out.println(q);
            System.out.println(w);
        }
    }

