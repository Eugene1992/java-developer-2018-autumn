package java_professional.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomKeyTest {
    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();

        Employee employee = new Employee("Yevhenii", "Deineka", 25, false, 7.5);
        map.put(employee, 777);

        Employee employee2 = new Employee("Yevhenii", "Deineka", 25, false, 7.5);

        System.out.println(map.get(employee));
        System.out.println(map.get(employee2));

    }
}
