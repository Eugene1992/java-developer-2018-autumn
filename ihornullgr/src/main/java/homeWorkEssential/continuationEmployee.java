package homeWorkEssential;

public class continuationEmployee {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        firstEmployee.id = 1;
        firstEmployee.firstName = "Alan";
        firstEmployee.lastName = "Po";
        firstEmployee.age = 20;
        firstEmployee.salary = 22155;
        firstEmployee.isMarried = false;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 2;
        secondEmployee.firstName = "Ihor";
        secondEmployee.lastName = "Rop";
        secondEmployee.age = 23; //eeeee
        secondEmployee.salary = 14000;
        secondEmployee.isMarried = true;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 3;
        thirdEmployee.firstName = "Ivan";
        thirdEmployee.lastName = "Numer";
        thirdEmployee.age = 32;
        thirdEmployee.salary = 7000;
        thirdEmployee.isMarried = false;

        Employee fourEmployee = new Employee();
        fourEmployee.id = 4;
        fourEmployee.firstName = "Konan";
        fourEmployee.lastName = "Varvar";
        fourEmployee.age = 18;
        fourEmployee.salary = 11456;
        fourEmployee.isMarried = false;

        Employee fiveEmployee = new Employee();
        fiveEmployee.id = 5;
        fiveEmployee.firstName = "Arnold";
        fiveEmployee.lastName = "Swarc";
        fiveEmployee.age = 50;
        fiveEmployee.salary = 51100;
        fiveEmployee.isMarried = true;

        Employee sixEmployee = new Employee();
        sixEmployee.id = 6;
        sixEmployee.firstName = "Inna";
        sixEmployee.lastName = "Swarc";
        sixEmployee.age = 44;
        sixEmployee.salary = 51000;
        sixEmployee.isMarried = true;

        Employee sevenEmployee = new Employee();
        sevenEmployee.id = 7;
        sevenEmployee.firstName = "Inna";
        sevenEmployee.lastName = "Swarcof";
        sevenEmployee.age = 25;
        sevenEmployee.salary = 12000;
        sevenEmployee.isMarried = true;

        Employee eightEmployee = new Employee();
        eightEmployee.id = 8;
        eightEmployee.firstName = "Elif";
        eightEmployee.lastName = "Konan";
        eightEmployee.age = 55;
        eightEmployee.salary = 3300;
        eightEmployee.isMarried = false;

        Employee nineEmployee = new Employee();
        nineEmployee.id = 9;
        nineEmployee.firstName = "Gina";
        nineEmployee.lastName = "Swarc";
        nineEmployee.age = 60;
        nineEmployee.salary = 7566;
        nineEmployee.isMarried = false;

        Employee tenEmployee = new Employee();
        tenEmployee.id = 10;
        tenEmployee.firstName = "Karolina";
        tenEmployee.lastName = "Milner";
        tenEmployee.age = 33;
        tenEmployee.salary = 9000;
        tenEmployee.isMarried = true;

        Employee[] employees = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, fourEmployee,
                fiveEmployee, sixEmployee, sevenEmployee, eightEmployee, nineEmployee, tenEmployee};
        Employee richestEmployee = getMoneyEmployee(employees);

        System.out.println(richestEmployee.firstName);
    }

    static Employee getMoneyEmployee(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

}
