package java_professional.annotation;

//@JsonEntity
public class Employee {
//    @JsonField
    private String firstName;

    private String lastName;

//    @JsonField(name="superAge")
    private int age;

//    Employee emp = new Employee("John", "Johnson", 22);
//    String s = toJson(emp);
//
//    {
//        "firstName": "John",
//        "superAge": 22
//    }


    public Employee() {
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(@MyAnnotation(value ="a") String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        @MyAnnotation(value ="a") int a = 10;
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
