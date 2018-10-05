package homeworks.javaEssential.homework02;

import java.util.List;

public abstract class GetRemoveListOperation extends ListOperation implements GetRemove {
    public long getExecutionTime(List list, int index) {
        long startTime = ListOperation.makeTimeStamp();
        runOperation(list, index);
        long endTime = makeTimeStamp();

        return endTime - startTime;
    }
}
