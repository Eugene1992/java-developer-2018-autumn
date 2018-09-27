package java_essential.incapsulation;

/*
* private - доступ только в пределах класса
* 'package-private' - доступ только в пределах класса, пакета класса
* protected - доступ только в пределах класса, пакета класса, наследниках класса
* public - доступ только в пределах класса, пакета класса, наследниках класса и вообще везде в программе
*/
public class Employee {
    private String name;
    private int age;
    private int salary;
    private boolean isMarried;

    public Employee() {
    }

    public Employee(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, i'm + " + this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new RuntimeException();
        this.age = age;
    }

    public boolean isaMarried() {
        return isMarried;
    }

    public void setaMarried(boolean aMarried) {
        this.isMarried = aMarried;
    }
}
