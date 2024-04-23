import java.util.Scanner;

public class vetores_exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int N = sc.nextInt();
        double[] vect = new double[N];


        for (int i = 0; i < N; i++) {
            System.out.println("Digite um numero");
            vect[i] = sc.nextDouble();

        }

        double soma = 0;
        for (int i =0;i<N;i++){
            soma += vect[i];
        }

        double media = soma /N;

        System.out.print("valores: ");

        for (int i =0;i<N;i++){
            System.out.printf("%.1f  ", vect[i]);
        }
        System.out.println();


        System.out.println("Soma = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
