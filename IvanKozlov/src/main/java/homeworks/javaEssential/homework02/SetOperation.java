package homeworks.javaEssential.homework02;

import java.util.List;

public class SetOperation extends ListOperation implements SetAdd {
    @Override
    public void runOperation(List list, Object object, int index) {
        list.set(index,object);
    }
}
