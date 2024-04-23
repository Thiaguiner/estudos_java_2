import java.util.Scanner;

public class vetor_exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] vect = new double[N];

        for(int i =0;i< N;i++){
            vect[i] = sc.nextDouble();
        }
        for (int i =0;i<10;i++){
            if (vect[i] < 0){
                System.out.println("NUMEROS NEGATIVOS: " + vect[i]);
            }
        }

        sc.close();
    }
}
