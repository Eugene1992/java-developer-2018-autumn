package homeworks.javaEssential.homework02;

import java.util.List;

public interface SetAdd {
    void runOperation(List list, Object object, int index);

    default void runOperationInTheMiddleOfList(List list, Object object){
        runOperation(list, object, list.size() / 2);
    }

    default void runOperationInTheStartOfList(List list, Object object){
        runOperation(list, object, 0);
    }

    default void runOperationInTheEndOfList(List list, Object object){
        runOperation(list, object, list.size() - 1);
    }
}
