package java_essential.home_work00;

public class MainClass {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        firstEmployee.id = 153_229_557;
        firstEmployee.firstName = "Denis";
        firstEmployee.lastName = "Kravets";
        firstEmployee.age = 50;
        firstEmployee.salary = 50_000;
        firstEmployee.isMarried = true;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 156_564_221;
        secondEmployee.firstName = "Andrey";
        secondEmployee.lastName = "Lytosh";
        secondEmployee.age = 45;
        secondEmployee.salary = 45_000;
        secondEmployee.isMarried = true;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 159_741_101;
        thirdEmployee.firstName = "Irina";
        thirdEmployee.lastName = "Bal";
        thirdEmployee.age = 40;
        thirdEmployee.salary = 40_000;
        thirdEmployee.isMarried = true;

        Employee fourthEmployee = new Employee();
        fourthEmployee.id = 175_195_666;
        fourthEmployee.firstName = "Matyas";
        fourthEmployee.lastName = "Petho";
        fourthEmployee.age = 28;
        fourthEmployee.salary = 39_000;
        fourthEmployee.isMarried = false;

        Employee fifthEmployee = new Employee();
        fifthEmployee.id = 199_551_337;
        fifthEmployee.firstName = "Boris";
        fifthEmployee.lastName = "Taramun";
        fifthEmployee.age = 33;
        fifthEmployee.salary = 17_000;
        fifthEmployee.isMarried = false;

        Employee sixthEmployee = new Employee();
        sixthEmployee.id = 176_279_937;
        sixthEmployee.firstName = "Anna";
        sixthEmployee.lastName = "Prus";
        sixthEmployee.age = 30;
        sixthEmployee.salary = 15_000;
        sixthEmployee.isMarried = true;

        Employee seventhEmployee = new Employee();
        seventhEmployee.id = 133_776_512;
        seventhEmployee.firstName = "Artur";
        seventhEmployee.lastName = "Darakuts";
        seventhEmployee.age = 25;
        seventhEmployee.salary = 15_000;
        seventhEmployee.isMarried = false;

        Employee eighthEmployee = new Employee();
        eighthEmployee.id = 193_336_655;
        eighthEmployee.firstName = "Petro";
        eighthEmployee.lastName = "Halitus";
        eighthEmployee.age = 28;
        eighthEmployee.salary = 13_000;
        eighthEmployee.isMarried = false;

        Employee ninthEmployee = new Employee();
        ninthEmployee.id = 153_441_559;
        ninthEmployee.firstName = "Pavlo";
        ninthEmployee.lastName = "Taran";
        ninthEmployee.age = 35;
        ninthEmployee.salary = 47_000;
        ninthEmployee.isMarried = true;

        Employee tenthEmployee = new Employee();
        tenthEmployee.id = 141_233_937;
        tenthEmployee.firstName = "Irina";
        tenthEmployee.lastName = "Partus";
        tenthEmployee.age = 31;
        tenthEmployee.salary = 57_000;
        tenthEmployee.isMarried = true;

        Employee[] employees = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, fourthEmployee, fifthEmployee, sixthEmployee, seventhEmployee, eighthEmployee, ninthEmployee, tenthEmployee};

        printEmployeeInfo(employees, "Irina");
    }

    //    - находят сотрудника с максимальной зарплатой
    private static Employee getMaxSalaryEmloyee(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.salary < employee.salary) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    //    - находят всех сотрудников с заданным интервалом зарплаты
    private static Employee[] getSalaryIntervalEmloyee(Employee[] employees, int fromSalary, int toSalary) {
        int arrayLength = 0;
        int arNumber = 0;
        for (Employee employee : employees) {
            if (employee.salary >= fromSalary && employee.salary <= toSalary) {
                arrayLength++;
            }
        }
        Employee[] employeesInSalaryInterval = new Employee[arrayLength];
        for (Employee employee1 : employees) {
            if (employee1.salary >= fromSalary && employee1.salary <= toSalary) {
                employeesInSalaryInterval[arNumber] = employee1;
                arNumber++;
            }
        }
        return employeesInSalaryInterval;
    }

    //    - подсчитывает зарплату всех сотрудников
    private static int getAllSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.salary;
        }
        return salarySum;
    }

    //- находят всех сотрудников по заданному имени
    private static Employee[] getEmployeeWithName(Employee[] employees, String str) {
        int arrayLength = 0;
        int arNumber = 0;
        for (Employee employee : employees) {
            if (employee.firstName == str) {
                arrayLength++;
            }
        }
        Employee[] employeesInSalaryInterval = new Employee[arrayLength];
        for (Employee employee : employees) {
            if (employee.firstName == str) {
                employeesInSalaryInterval[arNumber] = employee;
                arNumber++;
            }
        }
        return employeesInSalaryInterval;
    }

    //- печатает красиво информацию о сотруднике(ах), например Employee[name="Yevhenii", age=22, salary=20000000]
    private static void printEmployeeInfo(Employee[] employees, String str) {
        int numberEmployee = 1;
        for (Employee employee : getEmployeeWithName(employees, str)) {
            if (getEmployeeWithName(employees, str).length > 1) {
                System.out.println(numberEmployee + " employee with name: " + str);
                numberEmployee++;
            }
            System.out.println("FirstName: " + employee.firstName);
            System.out.println("LastName: " + employee.lastName);
            System.out.println("id: " + employee.id);
            System.out.println("Age: " + employee.age);
            System.out.println("Salary: " + employee.salary);
            System.out.println("Is married this employee: " + employee.isMarried);
            System.out.println("");
        }
    }
}
