package java_professional.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Sara", 52, 121000));
        employeeList.add(new Employee("Anna", 22, 12000));
        employeeList.add(new Employee("Tom", 32, 14000));
        employeeList.add(new Employee("John", 32, 18000));

        System.out.println(employeeList);

        Collections.sort(employeeList, new EmployeeByAgeComparator());

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });



        System.out.println(employeeList);
    }
}
