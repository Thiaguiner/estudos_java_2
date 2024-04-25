import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < N; i++) {
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for (int i =0;i<N;i++){
            for (int j = 0; j<N;j++){
                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("Negative numbers: " + cont);


        sc.close();
    }
}
