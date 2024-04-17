import java.util.Scanner;
public class problema_exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50;
        if (minutos > 100){
            conta += (minutos-100)* 2;
        }
        System.out.println("Valor da conta = " + conta);
    }
}
