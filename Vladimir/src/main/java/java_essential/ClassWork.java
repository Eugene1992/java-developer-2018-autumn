package java_essential;

public class ClassWork {
    public static void main(String[] args) {
        String[] name = {"Denis", "Maks", "Artur"};
        int[] age = {25, 30, 22};
        int[] salary = {1000, 3500, 2000};
        int maxSalaryNumber = 0;
        for (int i = 0; i < (salary.length - 1); i++) {
            if (salary[i] > salary[i + 1]) {
                maxSalaryNumber = i;
            } else {
                maxSalaryNumber = i + 1;
            }
        }
        System.out.println("Max salary: " + salary[maxSalaryNumber] + " have " + name[maxSalaryNumber] + "(age " + age[maxSalaryNumber] + ")");
    }
}
