package application_exercicio_conta_bancaria;

public class Account {
    private int number;//numero  da conta
    private String holder;//nome
    private double balance;//dinheiro na conta


    public Account(int number, String holder) {//contrutor
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {//contrutor
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }
//getters e setters
    public int getNumber() {
        return number;
    }//so tem get pois o numero da conta nao pode ser alterado

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
//o balance so tem get pois o saldo so pode ser alterado por meio de saque ou deposito
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5;
    }
    public String toString(){
        return "Account "
                + number
                +", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
