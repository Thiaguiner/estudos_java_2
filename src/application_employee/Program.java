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

        System.out.println("Wich percentage to increase salray? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        sc.close();
    }

    public static class Employee {
        public String name;
        public double grossSalary;
        public double tax;


        public double NetSalary(){
            return grossSalary - tax;
        }

        public void IncreaseSalary(double percentage){
            grossSalary += grossSalary * percentage / 100;
        }

        public String toString(){
            return name + ", $ " + String.format("%.2f", NetSalary());
        }

    }
}
