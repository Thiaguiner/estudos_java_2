package Predicate.application;

import Predicate.entities.Product;
import Predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> pred = p -> p.getPrice() >= 100;

        //list.removeIf(new ProductPredicate()); utilizando a implementação da interface
        // list.removeIf(Product::staticProductPredicate); utilizando metodo estatico
        //list.removeIf(Product::nonStaticProductPredicate);//utilizando metodo padrao, nao estatico
        //list.removeIf(pred); utilizando expressao lambda declarada esse Predicate de cima
        list.removeIf(p -> p.getPrice() >=100);//utilizando a expressao lambda declarada inline

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
