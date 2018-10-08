package homeworks.javaEssential.homework02;

import java.util.List;

public interface GetRemove {
    void runOperation(List list, int index);

    default void runOperationInTheMiddleOfList(List list){
        runOperation(list, list.size() / 2);
    }

    default void runOperationInTheStartOfList(List list){
        runOperation(list, 0);
    }

    default void runOperationInTheEndOfList(List list){
        runOperation(list, list.size() - 1);
    }
}
