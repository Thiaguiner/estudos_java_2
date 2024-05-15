package exercicio.polimorfismo;

import exercicio.polimorfismo.product.ImportedProduct;
import exercicio.polimorfismo.product.Product;
import exercicio.polimorfismo.product.UsedProduct;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Product " + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'c') {
                list.add(new Product(name, price));

            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Taxa de importação: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }


        sc.close();
    }
}
