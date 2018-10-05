package homeworks.javaEssential.homework02;

import java.util.List;

public class AddOperation extends ListOperation implements SetAdd {
    @Override
    public void runOperation(List list, Object object, int index) {
        list.add(index, object);
    }
}
