package Java_HomeWork_00;

public class HomeWorkEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1234567890;
        employee1.firstName = "Tom";
        employee1.lastName = "Benton";
        employee1.age = 26;
        employee1.salary = 3840;
        employee1.isMarried = true;

        Employee employee2 = new Employee();
        employee2.id = 1023456789;
        employee2.firstName = "Katie";
        employee2.lastName = "Tomson";
        employee2.age = 29;
        employee2.salary = 2947;
        employee2.isMarried = false;

        Employee employee3 = new Employee();
        employee3.id = 1203456789;
        employee3.firstName = "Peter";
        employee3.lastName = "Jenkins";
        employee3.age = 45;
        employee3.salary = 5032;
        employee3.isMarried = true;

        Employee employee4 = new Employee();
        employee4.id = 1230456789;
        employee4.firstName = "Alex";
        employee4.lastName = "Hines";
        employee4.age = 35;
        employee4.salary = 6220;
        employee4.isMarried = true;

        Employee employee5 = new Employee();
        employee5.id = 1234056789;
        employee5.firstName = "Erica";
        employee5.lastName = "Robertson";
        employee5.age = 21;
        employee5.salary = 7359;
        employee5.isMarried = false;

        Employee employee6 = new Employee();
        employee6.id = 1234506789;
        employee6.firstName = "Melanie";
        employee6.lastName = "Leonard";
        employee6.age = 32;
        employee6.salary = 2347;
        employee6.isMarried = true;

        Employee employee7 = new Employee();
        employee7.id = 1234560789;
        employee7.firstName = "Robert";
        employee7.lastName = "Cook";
        employee7.age = 26;
        employee7.salary = 7455;
        employee7.isMarried = false;

        Employee employee8 = new Employee();
        employee8.id = 1234567089;
        employee8.firstName = "Richard";
        employee8.lastName = "Cross";
        employee8.age = 30;
        employee8.salary = 5478;
        employee8.isMarried = true;

        Employee employee9 = new Employee();
        employee9.id = 1234567809;
        employee9.firstName = "Dennis";
        employee9.lastName = "Foster";
        employee9.age = 27;
        employee9.salary = 8354;
        employee9.isMarried = false;

        Employee employee10 = new Employee();
        employee10.id = 2134567890;
        employee10.firstName = "Anna";
        employee10.lastName = "Davis";
        employee10.age = 39;
        employee10.salary = 2936;
        employee10.isMarried = true;

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4,
                employee5, employee6, employee7, employee8, employee9, employee10};

        Employee richestEmployee = getMaxSalary(employees);
        System.out.println(richestEmployee.firstName + " " + richestEmployee.lastName);

        System.out.println("Salary interval :");
        printForAllEmployee(intervalSalaryEmployee(employees, 3000, 6000));

        System.out.println("Summary salary :");
        System.out.println(getSumSalary(employees));

        System.out.println("Find name:");
        printForAllEmployee(getEmployeeName(employees, "Anna"));

    }

    static Employee printAllAboutEmployee(Employee employees) {
        System.out.println("first name = " + employees.firstName + ", " + "last name = " +
                employees.lastName + ", " + "age = " + employees.age + ", " + "salary = "
                + employees.salary  + " ]");
        return employees;
    }

    static void printForAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                printAllAboutEmployee(employee);
            }
        }
    }

    static Employee getMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }


    static Employee[] intervalSalaryEmployee(Employee[] employees, int from, int to) {
        Employee[] intervalSearch = new Employee[employees.length];
        int n = 0;
        for (Employee employee : employees) {
            if (employee.salary >= from && employee.salary <= to) {
                intervalSearch[n] = employee;
                n++;
            }
        }
        return intervalSearch;
    }

    static int getSumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.salary;
        }
        return sumSalary;
    }

    static Employee[] getEmployeeName (Employee[] employees, String name){
        Employee[] nameOut = new Employee[employees.length];
        int m = 0;

        for (Employee employee : employees) {
            if (employee.firstName == name) {
                nameOut[m] = employee;
                m++;
            }
        }
        return nameOut;

    }
}

