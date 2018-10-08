package java_essential.lists_time_comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Calculatuions {

    private long quantityOfCycles;
    private Object elementValue;

    public void setQuantityOfCycles(long quantityOfCycles) {
        this.quantityOfCycles = quantityOfCycles;
    }

    public void setElementValue(Object elementValue) {
        this.elementValue = elementValue;
    }

    public Calculatuions(long quantityOfCycles, Object elementValue) {
        this.quantityOfCycles = quantityOfCycles;
        this.elementValue = elementValue;
        start();
    }

    private void start() {
        AccessoryMethods.wirteMessage("This comparison will be calculated for array and linked 100_000 " +
                "elements lists");
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        AccessoryMethods.wirteMessage("Time matrix for ArrayList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(arrayList));
        AccessoryMethods.wirteMessage("Time matrix for LinkedList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(linkedList));
    }

    private long[][] fillMatrix(List currentList) {
        long[][] arrayMatrix = new long[4][3];
        int indexLine = 0;
        for (Operations operation : Operations.values()) {
            long[] lineTimes = calculateGetTime(currentList, operation);
            arrayMatrix[indexLine] = lineTimes;
            indexLine++;
        }
        return arrayMatrix;
    }

    private long[] calculateGetTime(List currentList, Operations operationIndex) {
        long[] lineTimes = new long[3];
        for (int indexColumn = 0; indexColumn < lineTimes.length; indexColumn++) {
            long averageSum = 0;
            long startTime = System.currentTimeMillis();
            for (int index = 0; index < this.quantityOfCycles; index++) {
                doOperationWithList(currentList, operationIndex, indexColumn);
            }
            long endTime = System.currentTimeMillis();
            averageSum = endTime - startTime;
            lineTimes[indexColumn] = averageSum;
            if (operationIndex.equals(Operations.ADD) && indexColumn < 2) {
                currentList.clear();
            }
            if (operationIndex.equals(Operations.REMOVE) && indexColumn < 2) {
                fillListForRemove(currentList);
            }
        }
        return lineTimes;
    }

    private void fillListForRemove(List currentList) {
        for (int index = 0; index < this.quantityOfCycles; index++) {
            currentList.add(this.elementValue);
        }
    }

    private void doOperationWithList(List currentList, Operations operationIndex, int placeIndex) {
        switch (operationIndex) {
            case ADD:
                switch (placeIndex) {
                    case 0:
                        currentList.add(0, this.elementValue);
                        break;
                    case 1:
                        currentList.add(currentList.size() / 2, this.elementValue);
                        break;
                    case 2:
                        currentList.add(this.elementValue);
                        break;
                    default:
                }
                break;
            case GET:
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
            case SET:
                switch (placeIndex) {
                    case 0:
                        currentList.set(0, this.elementValue);
                        break;
                    case 1:
                        currentList.set(currentList.size() / 2, this.elementValue);
                        break;
                    case 2:
                        currentList.set(currentList.size() - 1, this.elementValue);
                        break;
                    default:
                }
                break;
            case REMOVE:
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
