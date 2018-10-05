package java_essential.lists_time_comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Calculatuions {

    static void start() {
        AccessoryMethods.wirteMessage("This comparison will be calculated for array and linked 100_000 " +
                "elements lists");//, with average value of 10 tries");
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        AccessoryMethods.wirteMessage("Time matrix for ArrayList operations");
        drawTimeMatrix(fillMatrix(arrayList));
        AccessoryMethods.wirteMessage("Time matrix for LinkedList operations");
        drawTimeMatrix(fillMatrix(linkedList));

    }

    private static void drawTimeMatrix(long[][] timeMatrix) {
        AccessoryMethods.wirteMessage("     start   middle  end");
        for (int indexLine = 0; indexLine < timeMatrix.length; indexLine++) {
            String operation = "";
            switch (indexLine) {
                case 0:
                    operation = "add   ";
                    break;
                case 1:
                    operation = "get   ";
                    break;
                case 2:
                    operation = "set   ";
                    break;
                case 3:
                    operation = "remove";
                    break;
                default:
            }
            AccessoryMethods.wirteMessage(" " + operation + " " + timeMatrix[indexLine][0] + "  " +
                    timeMatrix[indexLine][1] + "  " + timeMatrix[indexLine][2]);
        }
        AccessoryMethods.wirteMessage("");
    }

    static long[][] fillMatrix(List currentList) {
        long[][] arrayMatrix = new long[4][3];
        for (int indexLine = 0; indexLine < arrayMatrix.length; indexLine++) {
            long[] lineTimes = calculateGetTime(currentList, indexLine);
            arrayMatrix[indexLine] = lineTimes;
        }
        return arrayMatrix;
    }

    private static long[] calculateGetTime(List currentList, int operationIndex) {
        long[] lineTimes = new long[3];
        for (int indexColumn = 0; indexColumn < lineTimes.length; indexColumn++) {
            long averageSum = 0;
            //for (int indexTry = 0; indexTry < 10; indexTry++) {
            long startTime = System.currentTimeMillis();
            for (int index = 0; index < 100_000; index++) {
                doOperationWithList(currentList, operationIndex, indexColumn);
            }
            long endTime = System.currentTimeMillis();
            averageSum = averageSum + (endTime - startTime);
            //}
            averageSum = averageSum / 10;
            lineTimes[indexColumn] = averageSum;
            if (operationIndex == 0 && indexColumn < 2) {
                currentList.clear();
            }
            if (operationIndex == 3 && indexColumn < 2) {
                fillListForRemove(currentList);
            }
        }
        return lineTimes;
    }

    private static void fillListForRemove(List currentList) {
        for (int index = 0; index < 100_000; index++) {
            currentList.add(777);
        }
    }

    private static void doOperationWithList(List currentList, int operationIndex, int placeIndex) {
        switch (operationIndex) {
            case 0:
                switch (placeIndex) {
                    case 0:
                        currentList.add(0, 777);
                        break;
                    case 1:
                        currentList.add(currentList.size() / 2, 777);
                        break;
                    case 2:
                        currentList.add(777);
                        break;
                    default:
                }
                break;
            case 1:
                switch (placeIndex) {
                    case 0:
                        currentList.get(0);
                        break;
                    case 1:
                        currentList.get(currentList.size() / 2);
                        break;
                    case 2:
                        currentList.get(currentList.size() - 1);
                        break;
                    default:
                }
                break;
            case 2:
                switch (placeIndex) {
                    case 0:
                        currentList.set(0, 888);
                        break;
                    case 1:
                        currentList.set(currentList.size() / 2, 888);
                        break;
                    case 2:
                        currentList.set(currentList.size() - 1, 888);
                        break;
                    default:
                }
                break;
            case 3:
                switch (placeIndex) {
                    case 0:
                        currentList.remove(0);
                        break;
                    case 1:
                        currentList.remove(currentList.size() / 2);
                        break;
                    case 2:
                        currentList.remove(currentList.size() - 1);
                        break;
                    default:
                }
                break;
            default:
        }
    }
}
