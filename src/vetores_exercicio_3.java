import java.util.Scanner;

public class vetores_exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto numeros voce vai digitar? ");
        int N = sc.nextInt();
        double[] vect = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double maiorValor = vect[0];
        double posicaoMaior =0;

        for (int i =1;i<N;i++){
            if (vect[i] > maiorValor){
                maiorValor = vect[i];
                posicaoMaior = i;
            }
        }
        System.out.println("Maior valor é: " + maiorValor);
        System.out.println("Posição do maior valor é: " + posicaoMaior);

    sc.close();
    }

}
