package classwork06;

public class MaxSalaryOfEmployer {

    public static void main(String[] args) {
        String[] names = {"Alexander", "Andrey", "Maxim"};
        int[] age = {25, 28, 29};
        int[] salaries = {10000, 20000, 17000};
        int maxSalaryIndex = 0;
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > maxSalaryIndex) {
                maxSalaryIndex = i;
            }
        }
        System.out.println("Максимальная зарплата " + salaries[maxSalaryIndex]
                + "грн у сотрудника " + names[maxSalaryIndex]);
    }
}
