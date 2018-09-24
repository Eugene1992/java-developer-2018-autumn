public class Employee {
    public static void main(String[] args) {
        String[][] employee = new String[][]{{"Henry", "25", "1500"}, {"Julia", "34", "1000"}, {"Maks", "27", "2000"}};
        System.out.println(maxSalary(employee)[0]);
    }

    static String[] maxSalary(String[][] employee) {
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (Integer.parseInt(employee[i][2]) > max) {
                max = i;
            }
        }
        return employee[max];
    }
}
