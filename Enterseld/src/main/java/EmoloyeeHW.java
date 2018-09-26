public class EmoloyeeHW {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();

        //Создать 10 объектов класса Employee

        firstEmployee.id = 1;
        firstEmployee.firstName = "Anton";
        firstEmployee.lastName = "Korov";
        firstEmployee.age = 25;
        firstEmployee.salary = 13000;
        firstEmployee.isMarried = false;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 2;
        secondEmployee.firstName = "Viktor";
        secondEmployee.lastName = "Gorinin";
        secondEmployee.age = 33;
        secondEmployee.salary = 10000;
        secondEmployee.isMarried = true;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 3;
        thirdEmployee.firstName = "Kiril";
        thirdEmployee.lastName = "funtov";
        thirdEmployee.age = 46;
        thirdEmployee.salary = 26000;
        thirdEmployee.isMarried = false;

        Employee fourthEmployee = new Employee();
        fourthEmployee.id = 4;
        fourthEmployee.firstName = "Max";
        fourthEmployee.lastName = "Costyun";
        fourthEmployee.age = 37;
        fourthEmployee.salary = 18000;
        fourthEmployee.isMarried = true;

        Employee fifthEmployee = new Employee();
        fifthEmployee.id = 5;
        fifthEmployee.firstName = "Yan";
        fifthEmployee.lastName = "Kurosi";
        fifthEmployee.age = 18;
        fifthEmployee.salary = 6000;
        fifthEmployee.isMarried = true;

        Employee sixthEmployee = new Employee();
        sixthEmployee.id = 6;
        sixthEmployee.firstName = "Andrey";
        sixthEmployee.lastName = "Hatin";
        sixthEmployee.age = 54;
        sixthEmployee.salary = 27500;
        sixthEmployee.isMarried = true;

        Employee seventhEmployee = new Employee();
        seventhEmployee.id = 7;
        seventhEmployee.firstName = "Tom";
        seventhEmployee.lastName = "Hanks";
        seventhEmployee.age = 27;
        seventhEmployee.salary = 32000;
        seventhEmployee.isMarried = true;

        Employee eighthEmployee = new Employee();
        eighthEmployee.id = 8;
        eighthEmployee.firstName = "William";
        eighthEmployee.lastName = "Sotin";
        eighthEmployee.age = 23;
        eighthEmployee.salary = 7700;
        eighthEmployee.isMarried = false;

        Employee ninthEmployee = new Employee();
        ninthEmployee.id = 9;
        ninthEmployee.firstName = "Tania";
        ninthEmployee.lastName = "Urokova";
        ninthEmployee.age = 30;
        ninthEmployee.salary = 20300;
        ninthEmployee.isMarried = false;

        Employee tenthEmployee = new Employee();
        tenthEmployee.id = 10;
        tenthEmployee.firstName = "Gai";
        tenthEmployee.lastName = "Sherstuk";
        tenthEmployee.age = 19;
        tenthEmployee.salary = 10500;
        tenthEmployee.isMarried = false;

        Employee[] employeesArray = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, fourthEmployee,
                fifthEmployee, sixthEmployee, seventhEmployee, eighthEmployee, ninthEmployee, tenthEmployee};

        printSeparatorLine();
        System.out.println("Richest is");
        printEmployeesData(maxSel(employeesArray));
        printSeparatorLine();

        System.out.println("Salary interval");
        printAllEmployeesData(getSalaryInterval(employeesArray, 15000, 20000));
        printSeparatorLine();

        System.out.println("salary sum");
        System.out.println(calcEmployeesSalarySum(employeesArray));
        printSeparatorLine();


    }

    //находит сотрудника с максимальной зарплатой

    static Employee maxSel(Employee[] employeesArray) {
        Employee result = employeesArray[0];
        for (Employee employee : employeesArray) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

    //находит всех сотрудников с заданным интервалом зарплаты

    static Employee[] getSalaryInterval(Employee[] employeesArray, int startInterval, int endInterval) {
        Employee[] salaryEmployees = new Employee[employeesArray.length];
        int i = 0;

        for (Employee e : employeesArray) {
            if ((e.salary >= startInterval) && (e.salary <= endInterval)) {
                salaryEmployees[i] = e;
                i++;
            }
        }
        return salaryEmployees;
    }

    //подсчитывает зарплату всех сотрудников

    static int calcEmployeesSalarySum(Employee[] employeesArray) {
        int sum = 0;
        for (Employee elem : employeesArray) {
            sum += elem.salary;
        }
        return sum;
    }

    //печатает красиво информацию о сотруднике(ах), например Employee[name="Yevhenii", age=22, salary=20000000]

    static void printEmployeesData(Employee employeesArray) {
        System.out.println("[name = " + employeesArray.firstName + " " + employeesArray.lastName + ", age = "
                + employeesArray.age + ", salary = " + employeesArray.salary + ", Married = "
                + employeesArray.isMarried + ", id = " + employeesArray.id + "]");
    }

    static void printAllEmployeesData(Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                printEmployeesData(employeesArray[i]);
            }
        }
    }

    static void printSeparatorLine() {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}

