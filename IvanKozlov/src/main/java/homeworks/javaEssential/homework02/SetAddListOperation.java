package homeworks.javaEssential.homework02;

import java.util.List;

public abstract class SetAddListOperation extends ListOperation implements SetAdd {
    public long getExecutionTime(List list, Object object, int index) {
        long startTime = ListOperation.makeTimeStamp();
        runOperation(list, object, index);
        long endTime = makeTimeStamp();

        return endTime - startTime;
    }
}
