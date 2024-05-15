package exercicio_heranca_polimorfismo_abstracts;

import exercicio_heranca_polimorfismo_abstracts.entities.Company;
import exercicio_heranca_polimorfismo_abstracts.entities.Individual;
import exercicio_heranca_polimorfismo_abstracts.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of taxpayer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company(i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, he);
                list.add(x);
            } else {
                System.out.print("Number of employees: ");
                int quantityEmp = sc.nextInt();
                Company emp = new Company(name, anualIncome, quantityEmp);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + tp.tax());
        }
        double sum = 0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
            System.out.println(sum);
        }

        sc.close();
    }
}
