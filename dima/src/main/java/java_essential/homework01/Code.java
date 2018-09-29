package java_essential.homework01;

public class Code {
    public static void main(String[] args) {
        Employee[] listOfEmployees = createListOfEmployees(10);
        System.out.println("Список сотрудников ");
        employeesData(listOfEmployees);
        System.out.println("Самый высокооплачиваемый сотрудник ");
        employeesData(maxSalary(listOfEmployees));
        System.out.println("Интервал по зарплатам  ");
        employeesData(salaryInterval(listOfEmployees, 28000, 32000));
        System.out.println("Сума на зарплаты  ");
        System.out.println(calculateEmployeesSalarySum(listOfEmployees));
        System.out.println("СОтрудники с одним именем ");
        employeesData(employeesByFirstName(listOfEmployees, "Катя"));
    }

    static Employee maxSalary(Employee[] listOfEmployees) {
        Employee result = listOfEmployees[0];
        for (Employee employee : listOfEmployees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

    static Employee[] salaryInterval(Employee[] listOfEmployees, int startInterval, int endInterval) {
        Employee[] salaryEmployees = new Employee[listOfEmployees.length];
        int i = 0;

        for (Employee e : listOfEmployees) {
            if ((e.salary >= startInterval) && (e.salary <= endInterval)) {
                salaryEmployees[i] = e;
                i++;
            }
        }
        return salaryEmployees;
    }

    static int calculateEmployeesSalarySum(Employee[] listOfEmployees) {
        int sum = 0;
        for (Employee elem : listOfEmployees) {
            sum += elem.salary;
        }
        return sum;
    }

    static Employee[] employeesByFirstName(Employee[] listOfEmployees, String firstName) {
        Employee[] employeesName = new Employee[listOfEmployees.length];
        int i = 0;
        for (Employee elem : listOfEmployees) {
            if (elem.firstName == firstName) {
                employeesName[i] = elem;
                i++;
            }
        }
        return employeesName;
    }

    static void employeesData(Employee listOfEmployees) {
        System.out.println("[Имя = " + listOfEmployees.firstName + " " + listOfEmployees.lastName + ", Возраст = "
                + listOfEmployees.age + ", Зарплата = " + listOfEmployees.salary + ", Статус = "
                + listOfEmployees.married + ", id = " + listOfEmployees.id + "]");
    }

    static void employeesData(Employee[] listOfEmployees) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                employeesData(listOfEmployees[i]);
            }
        }
    }

    static Employee[] createListOfEmployees(int count) {
        Employee[] listOfEmployees = new Employee[count];
        String[] employeeFirstName = new String[]{"Катя", "Дима", "Лиза", "Паша", "Маша", "Анна", "Лера", "Сергей", "Виталий", "Настя"};

        String[] employeerLastName = new String[]{"Калиник", "Чумец", "Русанка", "Пишковский", "Машковская", "Вольга", "Собко", "Серый", "Витальков", "Сластенская"};
        int[] employeerAge = new int[]{20, 19, 24, 18, 27, 19, 25, 28, 21, 20};
        int[] employeerSalary = new int[]{27518, 16001, 28740, 34720, 22190, 34316, 19274, 23598, 17134, 32678};
        boolean[] employeerStatus = new boolean[]{false, false, true, true, false, true, true, false, false, false};
        for (int index = 0; index < listOfEmployees.length; index++) {
            listOfEmployees[index] = new Employee();
            listOfEmployees[index].id = index + 1;
            listOfEmployees[index].firstName = employeeFirstName[index];
            listOfEmployees[index].lastName = employeerLastName[index];
            listOfEmployees[index].age = employeerAge[index];
            listOfEmployees[index].salary = employeerSalary[index];
            listOfEmployees[index].married = employeerStatus[index];
        }
        return listOfEmployees;
    }
}


