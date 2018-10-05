package homeworks.javaEssential.homework02;

import java.util.List;
import java.util.function.Function;

public abstract class ListOperation {
    public static long makeTimeStamp() {
        return System.currentTimeMillis();
    }

    public long getExecutionTime() {
        long startTime = makeTimeStamp();

        long endTime = makeTimeStamp();

        return endTime - startTime;
    }
}
