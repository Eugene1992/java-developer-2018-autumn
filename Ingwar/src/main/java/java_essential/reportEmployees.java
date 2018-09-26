package java_essential;

import java.util.Scanner;

public class reportEmployees {

	public static void main(String[] args) {
		Employee[] listOfEmployees = createListOfEmployees(10);
		showEmployees(listOfEmployees);
        System.out.println();
		System.out.println("Richest in the list:");
		showEmployees(getMaxPayed(listOfEmployees));
        System.out.println();
		Scanner scan = new Scanner(System.in);
        System.out.println("Input salary low limit");
        int lowLimit = scan.nextInt();
        System.out.println("Input salary high limit");
        int highLimit = scan.nextInt();
        showEmployees(getEmployeesWithin(listOfEmployees,lowLimit,highLimit));
        System.out.println();
        System.out.print("General salary sum: ");
        System.out.println(getsalarySum(listOfEmployees));
        System.out.println();
        System.out.println("Input name for a search:");
        scan.nextLine();
        String name = scan.nextLine();
        showEmployees(getEmployeesWithin(listOfEmployees,name));
        scan.close();
	}
	
	static Employee[] createListOfEmployees(int count) {
		Employee[] listOfEmployees = new Employee[count];
		String[] firstNames = new String[]{"John","Jane","Frank","Josh","Anna","Jane","Susan",
				"Kelly","Rob","Barry"};
		String[] lastNames = new String[]{"Cooper","Brand","Gese","Bernick","Gese","Tulwar","Camper",
				"Swann","Kochinsky","Longfort"};
		int[] ages = new int[] {22,24,32,35,42,36,28,33,25,24};
		int[] salaries = new int[] {2000,3000,4000,5000,10000,4500,3800,7000,4300,5900};
		boolean[] married = new boolean[] {false,false,true,true,true,false,false,true,false,true};
		for(int index = 0;index < listOfEmployees.length;index++) {
			listOfEmployees[index] = new Employee();
			listOfEmployees[index].id = index + 1;
			listOfEmployees[index].firstName = firstNames[index];
			listOfEmployees[index].lastName = lastNames[index];
			listOfEmployees[index].age = ages[index];
			listOfEmployees[index].salary = salaries[index];
			listOfEmployees[index].isMarried = married[index];
		}
		return listOfEmployees;
	}
	
	static void showEmployees(Employee[] list) {
        if(list.length > 0) {
            for(int index = 0; index < list.length; index++) {
                System.out.println("Employee: ID "+list[index].id+" "+list[index].firstName+" "+
                        list[index].lastName+", salary: "+list[index].salary);
            }
        } else {
            System.out.println("No data!");
        }
	}
	
	static void showEmployees(Employee maxPayed) {
		System.out.println("Employee: ID "+maxPayed.id+" "+maxPayed.firstName+" "+
				maxPayed.lastName+", salary: "+maxPayed.salary);
	}
	
	static Employee getMaxPayed(Employee[] listOfEmployees) {
		int maxIndex = 0;
		int maxSalary = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			if(listOfEmployees[index].salary > maxSalary) {
				maxSalary = listOfEmployees[index].salary;
				maxIndex = index;
			}
		}
		return listOfEmployees[maxIndex];
	}
	
	static Employee[] getEmployeesWithin(Employee[] listOfEmployees, int lowLimit, int highLimit) {
		int newArrayLenght = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			if(listOfEmployees[index].salary >= lowLimit && listOfEmployees[index].salary <= highLimit) {
				newArrayLenght++;
			}
		}
		Employee[] newList = new Employee[newArrayLenght];
		int newIndex = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			if(listOfEmployees[index].salary >= lowLimit && listOfEmployees[index].salary <= highLimit) {
				newList[newIndex] = listOfEmployees[index];
				newIndex++;
			}
		}
		return newList;
	}
	
	static int getsalarySum(Employee[] listOfEmployees) {
		int salarySum = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			salarySum += listOfEmployees[index].salary;
		}
		return salarySum;
	}
	
	static Employee[] getEmployeesWithin(Employee[] listOfEmployees, String name) {
		int newArrayLenght = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			if(listOfEmployees[index].firstName.matches(name)) {
				newArrayLenght++;
			}
		}
		Employee[] newList = new Employee[newArrayLenght];
		int newIndex = 0;
		for(int index = 0; index < listOfEmployees.length; index++) {
			if(listOfEmployees[index].firstName.matches(name)) {
				newList[newIndex] = listOfEmployees[index];
				newIndex++;
			}
		}
		return newList;
	}
}
