package default_methods.application;

import default_methods.entities.BrazilInterestService;
import default_methods.entities.InterestService;
import default_methods.entities.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

//        BrazilInterestService bis = new BrazilInterestService(2.0);
//        UsaInterestService bis = new UsaInterestService(1.0);

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(payment);

        sc.close();
    }
}
