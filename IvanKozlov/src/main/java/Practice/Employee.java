package practice;

public class Employee {

    static String getEmployeeNameWithLargestSalary(String[][] array) {
        int largestSalaryIndex = 0;

        for (int i = 0; i < array[i].length - 1; i++) {
            if (Integer.parseInt(array[i][2]) > largestSalaryIndex) {
                largestSalaryIndex = i;
            }
        }

        return array[largestSalaryIndex][0];
    }

    public static void main(String[] args) {
        String[][] employeesParameters = {
                {"Alex", "20", "2000"},
                {"John", "25", "2500"},
                {"Jack", "30", "1000"}
        };

        System.out.println(getEmployeeNameWithLargestSalary(employeesParameters));
    }
}
