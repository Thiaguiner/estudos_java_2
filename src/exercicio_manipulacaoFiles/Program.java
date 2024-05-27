package exercicio_manipulacaoFiles;

import exercicio_manipulacaoFiles.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent(); // vai até o caminho desprezando o nome do arquivo

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); // criamos uma pasta out vazia

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // criamos o arquivo summary, o arquivo de saida

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                // pegandos os itens -> nome, price and quantity
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1].trim());
                int quantity = Integer.parseInt(fields[2].trim());

                list.add(new Product(name, price, quantity)); // lista de produtos lida

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + item.total());
                    bw.newLine();
                }
                System.out.println(targetFileStr + " CREATED");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}
