package java_essential.lists_time_comparison;

import java_essential.newListClass.NewUserList;
import java_professional.newLinkedList.NewUserLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Calculatuions {

    private long quantityOfElements;
    private Object elementValue;

    public void setQuantityOfElements(long quantityOfElements) {
        this.quantityOfElements = quantityOfElements;
    }

    public void setElementValue(Object elementValue) {
        this.elementValue = elementValue;
    }

    public Calculatuions(long quantityOfElements, Object elementValue) {
        this.quantityOfElements = quantityOfElements;
        this.elementValue = elementValue;
    }

    public void start() {
        AccessoryMethods.wirteMessage("This comparison will be calculated for array and linked lists");
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> userList = new NewUserList();
        List<Integer> userLinkedList = new NewUserLinkedList<>();
        AccessoryMethods.wirteMessage("Time matrix for ArrayList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(arrayList));
        AccessoryMethods.wirteMessage("Time matrix for LinkedList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(linkedList));
        AccessoryMethods.wirteMessage("Time matrix for NewUserList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(userList));
        AccessoryMethods.wirteMessage("Time matrix for NewUserLinkedList operations");
        AccessoryMethods.drawTimeMatrix(fillMatrix(userLinkedList));
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
        //for (int indexColumn = 0; indexColumn < lineTimes.length; indexColumn++) {
        int indexColumn = 0;
        for (Positions position : Positions.values()) {
            long averageSum = 0;
            long startTime = System.currentTimeMillis();
            for (int index = 0; index < this.quantityOfElements; index++) {
                doOperationWithList(currentList, operationIndex, position);
            }
            long endTime = System.currentTimeMillis();
            averageSum = endTime - startTime;
            lineTimes[indexColumn] = averageSum;
            indexColumn++;
            if (operationIndex.equals(Operations.ADD) && !position.equals(Positions.END)) {
                currentList.clear();
            }
            if (operationIndex.equals(Operations.REMOVE) && !position.equals(Positions.END)) {
                fillListForRemove(currentList);
            }
        }
        return lineTimes;
    }

    private void fillListForRemove(List currentList) {
        for (int index = 0; index < this.quantityOfElements; index++) {
            currentList.add(this.elementValue);
        }
    }

    private void doOperationWithList(List currentList, Operations operationIndex, Positions placeIndex) {
        switch (operationIndex) {
            case ADD:
                switch (placeIndex) {
                    case START:
                        currentList.add(0, this.elementValue);
                        break;
                    case MIDDLE:
                        currentList.add(currentList.size() / 2, this.elementValue);
                        break;
                    case END:
                        currentList.add(this.elementValue);
                        break;
                    default:
                }
                break;
            case GET:
                switch (placeIndex) {
                    case START:
                        currentList.get(0);
                        break;
                    case MIDDLE:
                        currentList.get(currentList.size() / 2);
                        break;
                    case END:
                        currentList.get(currentList.size() - 1);
                        break;
                    default:
                }
                break;
            case SET:
                switch (placeIndex) {
                    case START:
                        currentList.set(0, this.elementValue);
                        break;
                    case MIDDLE:
                        currentList.set(currentList.size() / 2, this.elementValue);
                        break;
                    case END:
                        currentList.set(currentList.size() - 1, this.elementValue);
                        break;
                    default:
                }
                break;
            case REMOVE:
                switch (placeIndex) {
                    case START:
                        currentList.remove(0);
                        break;
                    case MIDDLE:
                        currentList.remove(currentList.size() / 2);
                        break;
                    case END:
                        currentList.remove(currentList.size() - 1);
                        break;
                    default:
                }
                break;
            default:
        }
    }
}
