package homeworks.javaEssential.homework04;

public class CustomStack implements Stack{

    private Object[] customStackArray = new Object[0];
    private Object[] bufferArray = new Object[0];

    private void setCustomStackArrayLength(int neededLength) {
        customStackArray = new Object[neededLength];
    }


    private void increaseCustomArrayLengthByOne() {
        setCustomStackArrayLength(customStackArray.length + 1);
    }

    private void decreaseCustomArrayLengthByOne() {
        setCustomStackArrayLength(customStackArray.length - 1);
    }

    private void fillCustomStackArrayWithCurrentValues() {
        for (int i = 0; i < bufferArray.length; i++) {
            customStackArray[i] = bufferArray[i];
        }
    }

    private boolean isNotNull(Object object) {
        return object != null;
    }

    @Override
    public boolean push(Object object) {
        increaseCustomArrayLengthByOne();
        fillCustomStackArrayWithCurrentValues();
        customStackArray[customStackArray.length - 1] = object;
        bufferArray = customStackArray;

        return true;
    }

    @Override
    public boolean pushAll(Object[] objectsArray) {
        for (int i = 0; i < objectsArray.length; i++) {
            push(objectsArray[i]);
        }
        return true;
    }

    @Override
    public Object pull() {
        Object objectToPull = customStackArray[customStackArray.length - 1];

        decreaseCustomArrayLengthByOne();
        for (int i = 0; i < customStackArray.length; i++) {
            customStackArray[i] = bufferArray[i];
        }

        bufferArray = customStackArray;

        return objectToPull;
    }

    @Override
    public int size() {
        return customStackArray.length;
    }

    @Override
    public void print() {
        String stringToPrint = "";
        for (Object object : customStackArray) {
            stringToPrint += (object + ", ");
        }

        System.out.println(stringToPrint);
    }
}
