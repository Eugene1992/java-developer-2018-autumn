package java_professional.compare;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        /*if (this.age < other.age) return 1;
        if (this.age > other.age) return -1;
        if (this.salary < other.salary) return 1;
        if (this.salary > other.salary) return -1;
        return 0;*/

        return this.age - other.age != 0 ? this.salary - other.salary : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
