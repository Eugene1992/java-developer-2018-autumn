package java_professional.annotations;

public class TestConvertToJson {
    public static void main(String[] args) {
        Employee greg = new Employee("Greg", 25, 10000);
        greg.setCup(new CoffeeCup("black"));
        ConvertToJson<Employee> convert = new ConvertToJson<>(greg);
        convert.Convert();
        System.out.println(convert.getJsonString());
    }
}
