package polimorfismo.application;

import polimorfismo.application.employee.Employee;
import polimorfismo.application.employee.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionarios? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsorced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHours = sc.nextDouble();

            if (ch == 'y') {

                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee(name, hours, valuePerHours, additionalCharge));
                ;
            } else {
                list.add(new Employee(name, hours, valuePerHours));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
