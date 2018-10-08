package homeworks.javaEssential.homework02;

import java.util.List;

public class GetOperation extends GetRemoveListOperation {
    @Override
    public void runOperation(List list, int index) {
        list.get(index);
    }
}
