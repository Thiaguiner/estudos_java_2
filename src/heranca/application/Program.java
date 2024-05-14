package heranca.application;

import heranca.application.entities.Account;
import heranca.application.entities.BusinessAccount;
import heranca.application.entities.SavingsAccount;

import java.util.AbstractCollection;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1024, "Joao", 1000.0, 0.01);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
