package java_essential.object_class_methods;

public class Employee implements Cloneable {
    private String name;
    private int age;
    private Home home;

    public Employee(String name, int age, Home home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public Home getHome() {
        return home;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm almost dead..");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employee(this.name, this.age, new Home(this.getHome().getStreet(), this.getHome().getNum()));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name.toString() + '\'' +
                ", age=" + age +
                ", home=" + home.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (home != null ? home.hashCode() : 0);
        return result;
    }
}
