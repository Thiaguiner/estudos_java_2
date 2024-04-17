import java.util.Scanner;
public class exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a temperatura em Celsius");
        double C = sc.nextDouble();
        double F = 9 * C / 5 + 32;
        System.out.println("Equivalente em fahrenheit: " +  F);

        System.out.println("Deseja repetir(s/n) ");
        char resp = sc.next().charAt(0);
        while (resp == 's'){
            System.out.println("Digite a temperatura em Celsius");
             C = sc.nextDouble();
             F = 9 * C / 5 + 32;
            System.out.println("Equivalente em fahrenheit: " +  F);
            System.out.println("Deseja repetir(s/n) ");
            resp = sc.next().charAt(0);
        }

        sc.close();
    }
}
