package java_professional.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        SortedMap<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        Employee natasha = new Employee("Natasha", 23);
        Employee oksana = new Employee("Oksana", 24);
        employeeMap.put(new Employee("Anna", 27), 1);
        employeeMap.put(natasha, 11);
        employeeMap.put(oksana, 61);
//        employeeMap.put(null, 61);

        System.out.println(employeeMap);

        Employee firstKey = employeeMap.firstKey();
        System.out.println(firstKey);

        Employee last = employeeMap.lastKey();
        System.out.println(last);

        System.out.println(employeeMap.headMap(oksana));
        System.out.println(employeeMap.tailMap(oksana));
    }
}
