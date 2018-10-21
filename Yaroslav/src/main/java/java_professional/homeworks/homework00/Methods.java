package java_professional.homeworks.homework00;

import java.util.Iterator;
import java.util.List;

public class Methods {

    /** Метод для вывода элементов списка*/
    public static <E> String toStringList(List<E> list){
        int counter = 1;
        String res = "";
        Iterator<E> iterator = list.iterator();
        while(iterator.hasNext()){
            res += counter + ")" + iterator.next() + "\n";
            counter++;
        }
        return res;
    }



    /** Метод для вывода масива*/
    public static <E> String arrayOutput(E[] array){
        String res = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                res += array[i].toString() + "]";
            }
            else{
                res += array[i].toString() + ", ";
            }
        }
        return res;
    }
}
