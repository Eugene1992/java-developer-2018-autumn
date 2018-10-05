package homeworks.javaEssential.homework02;

import java.util.List;

public class RemoveOperation extends GetRemoveListOperation {
    @Override
    public void runOperation(List list, int index) {
        list.remove(index);
    }
}
