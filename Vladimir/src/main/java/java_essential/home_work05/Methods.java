package java_essential.home_work05;

public class Methods {
    //метод для увеличения размера массива
    public static Object[] getBiggerArray(Object[] arrayForList) {
        int newArraySize = ((arrayForList.length * 3) / 2 + 1);
        return new Object[newArraySize];
    }

    //    метод для поиска последнего индекса в массиве
    public static int getLastIndexOfArray(Object[] arrayForList) {
        int lastIndexOfArray = 0;
        for (int i = 0; i < arrayForList.length; i++) {
            if (arrayForList[i] != null) {
                lastIndexOfArray = i;
            }
        }
        return lastIndexOfArray;
    }
}
