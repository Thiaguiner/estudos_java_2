package manipulando_pastas;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);//pegando todas as pastas
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);//imprimindo as pastas
        }
        File[] files = path.listFiles(File::isFile);//pegando os arquivos
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);//imprimindo os arquivos
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();//criando uma subpasta
        System.out.println("DIRECTORY CREATED SUCESSFULLY: " + sucess);

        sc.close();
    }
}
