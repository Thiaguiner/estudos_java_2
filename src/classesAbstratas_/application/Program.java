package classesAbstratas_.application;

import classesAbstratas_.entities.Account;
import classesAbstratas_.entities.BusinessAccount;
import classesAbstratas_.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 1000.0, 500.0));
        list.add(new SavingsAccount(1003, "Maria", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));

        //soma de todas as contas usando list
        double sum = 0;
        for(Account acc : list){
            sum += acc.getBalance();
        }
        System.out.println("Total balance: " + sum);

        //fazendo deposito e depois somando mais 10 a cada conta e depois mostrando o saldo
        for (Account acc : list){
            acc.deposit(10);
        }
        for (Account acc : list){
            System.out.println("Updated balance for account: " + acc.getBalance());
        }
    }
}
