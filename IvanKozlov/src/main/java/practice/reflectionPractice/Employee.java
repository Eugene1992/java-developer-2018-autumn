package practice.reflectionPractice;

import practice.reflectionPractice.annotations.JSONEntity;
import practice.reflectionPractice.annotations.JSONField;

@JSONEntity
public class Employee {

    @JSONField(name = "superName")
    private String name;

    @JSONField(name = "age")
    private int age;

    @JSONField(name = "isMarried")
    private boolean isMarried;

//    @JSONField(name = "children")
//    private String[] children = {"Anna", "Sam"};

    public Employee(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
