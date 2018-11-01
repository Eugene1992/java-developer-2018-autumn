package java_professional.employee_package;

public class ComparableEmloyee implements Comparable<ComparableEmloyee> {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private boolean isMarried;

    ComparableEmloyee(int id, String firstName, String lastName, int age, int salary, boolean isMarried) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    @Override
    public int compareTo(ComparableEmloyee other) {
//        if (this.salary > other.salary) return 1;
//        if (this.salary < other.salary) return -1;
//        if (this.age > other.age) return 1;
//        if (this.age < other.age) return -1;
//        else return 0;

        return this.age - other.age != 0 ? this.salary - other.salary : 0;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", salary = " + salary +
                ", isMarried = " + isMarried +
                '}' + "\n";
    }
}
