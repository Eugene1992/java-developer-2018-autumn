package java_professional.newLinkedList;

public class Employee implements Comparable<Employee> {
    private String Name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee next) {
        return this.age - next.age != 0 ? this.salary - next.salary : 0;
    }
}
