package function;

import function.entities.Product;

import function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // metodo usando static
        //List<String> names =  list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // sem static
        //List<String> names =  list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //com expressao lambda
        //Function<Product, String> func = product -> product.getName().toUpperCase();
        //List<String> names =  list.stream().map(func).collect(Collectors.toList());

        //expressão lambda inline
        List<String> names =  list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());


       names.forEach(System.out::println);


    }
}
