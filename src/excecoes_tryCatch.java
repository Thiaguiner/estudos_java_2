import java.util.InputMismatchException;
import java.util.Scanner;

public class excecoes_tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        method2();
        System.out.println("End of Program");
    }

    public static void method2() {
        System.out.println("Method 2 Start");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position Invalid");
            e.printStackTrace();//imprime o rastreamento do stack(erro), mas nao para o programa
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("Method 2 End");
    }
}


/*import java.util.InputMismatchException;
import java.util.Scanner;

public class excecoes_tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position Invalid");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("End of Program");
        sc.close();
    }
}
*/

