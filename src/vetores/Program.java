package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        double[] height = new double[N];//declarando o vetor

        for (int i = 0; i < N; i++) {
            height[i] = sc.nextDouble();//leitura das alturas
        }
        double soma =0;
        for (int i =0;i<N;i++){
            soma += height[i];//fazendo a soma das alturas
        }

        double media = soma /N;//media das alturas

        System.out.println("Media é de : " + media);

        sc.close();
    }
}
