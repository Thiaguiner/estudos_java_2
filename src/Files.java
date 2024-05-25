import java.io.File;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Name: " + path.getName());//vai buscar o nome do arquivo e despreza o caminho
        System.out.println("Parent: " + path.getParent()); // despreza o nome e busca o caminho
        System.out.println("GetPath: " + path.getPath()); // pega todo o caminho

        sc.close();
    }
}
