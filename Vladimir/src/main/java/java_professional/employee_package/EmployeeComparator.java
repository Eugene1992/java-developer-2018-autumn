package java_professional.employee_package;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<ComparableEmloyee> {

    @Override
    public int compare(ComparableEmloyee o1, ComparableEmloyee o2) {
        return o1.getAge() - o2.getAge();
    }
}
