package homeworks.javaEssential.homework02;

import java.util.List;

public class SetOperation extends SetAddListOperation {
    @Override
    public void runOperation(List list, Object object, int index) {
        list.set(index,object);
    }
}
