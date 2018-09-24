package javaEssential.homework;

import java.util.Scanner;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int age;
    int salary;
    boolean isMarried;

    Employee setEmployee(Scanner scan) {
        System.out.println("Please input information about new Employee");
        System.out.print("Name : ");
        this.firstName = scan.next();
        System.out.println();
        System.out.print("Surname : ");
        this.lastName = scan.next();
        System.out.println();
        System.out.print("Age : ");
        this.age = scan.nextInt();
        System.out.println();
        System.out.print("Salary : ");
        this.salary = scan.nextInt();
        System.out.println();
        String answer;
        do {
            System.out.print("Married? (Yes / No) : ");
            answer = scan.next();
            if (answer.equals("Yes")) {
                this.isMarried = true;
            } else if (answer.equals("No")) {
                this.isMarried = false;
            }
        } while (!answer.equals("Yes") && !answer.equals("No"));
        return this;
    }

    void print() {
        System.out.println("Employee #" + id);
        System.out.println("Name : " + this.firstName);
        System.out.println("Surname : " + this.lastName);
        System.out.println("Age : " + this.age);
        System.out.println("Salary : " + this.salary);
        System.out.print("Married : " + (this.isMarried ? "Yes" : "No"));
        System.out.println();
        System.out.println();
    }
}
