package application;

import entities_2.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");//pedindo para o usuario colocar o nome, preço e quantidade do
        // produto

        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity is stock: ");
        product.quantity = sc.nextInt();
        System.out.println();

        System.out.println("Product data: " + product);//imprimindo o resultado

        //perguntando a quantidade de produtos para adicionar ao estoque
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");


        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);//imprimindo o update

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");//remove a quantidade no estoque
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);//final update


        sc.close();
    }
}
