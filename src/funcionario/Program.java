package funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String name = sc.next();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Salário: ");
        double salary = sc.nextDouble();

        Funcionario_ funcionario = new Funcionario_(name, idade, salary);

        System.out.println(funcionario);

        System.out.println("How many percent do you increase your salary? ");
        double percentage = sc.nextInt();

        funcionario.increaseSalary(percentage);

        System.out.println("Update salary " +funcionario);

        sc.close();
    }
}
