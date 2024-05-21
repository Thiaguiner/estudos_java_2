package exercicio_fixacao_tratamento_excecoes.application;

import exercicio_fixacao_tratamento_excecoes.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para saque: ");
        double amount = sc.nextDouble();
        String error = acc.validateWithdraw(amount);
        if (error != null) {
            System.out.println(error);
        } else {
            acc.withdraw(amount);
            System.out.println("Novo saldo: " + acc.getBalance());
        }

        sc.close();
    }
}
