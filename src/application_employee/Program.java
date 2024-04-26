package application_employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        sc.close();
    }

}
