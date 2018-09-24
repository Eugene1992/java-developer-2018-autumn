package java_essential.oop_intro;

public class Test {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        firstEmployee.name = "Yevhenii";
        firstEmployee.age = 25;
        firstEmployee.salary = 3_000_000;

        Employee secondEmployee = new Employee();
        secondEmployee.name = "Jack";
        secondEmployee.age = 22;
        secondEmployee.salary = 2_000_000;

        Employee thirdEmployee = new Employee();
        thirdEmployee.name = "Anna";
        thirdEmployee.age = 43;
        thirdEmployee.salary = 12_000_000;

        Employee[] employees = new Employee[]{firstEmployee, secondEmployee, thirdEmployee};
        int[] ints = new int[]{2, 43, 12};

        Employee richestEmployee = getRichestEmployee(employees);
//        System.out.println(richestEmployee.name);

        Employee fourthEmployee = new Employee();

        System.out.println(fourthEmployee.age);
        System.out.println(fourthEmployee.name);

        Employee fifthEmployee;
        fifthEmployee = firstEmployee;
        fifthEmployee.salary = 10_000_000;

        System.out.println(firstEmployee.salary);

//        secondEmployee = null;
        System.out.println(secondEmployee.name);

        secondEmployee = thirdEmployee;
        secondEmployee = new Employee();

        System.out.println(thirdEmployee);
    }

    static Employee getRichestEmployee(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

    static Employee[] filterEmployeesByName(Employee[] employees, String name) {
        System.out.println();
        return employees;
    }
}

