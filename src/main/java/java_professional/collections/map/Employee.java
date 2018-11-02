package java_professional.collections.map;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private double salaryBonus;

    public Employee(String firstName, String lastName, int age, boolean isMarried, double salaryBonus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
        this.salaryBonus = salaryBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (isMarried != employee.isMarried) return false;
        if (Double.compare(employee.salaryBonus, salaryBonus) != 0) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        return lastName != null ? lastName.equals(employee.lastName) : employee.lastName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (isMarried ? 1 : 0);
        temp = Double.doubleToLongBits(salaryBonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
