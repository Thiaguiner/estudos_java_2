package predicate_ex;

import predicate_ex.entities.Product;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Thiago", 20));
        list.add(new Product("Thomaz", 22));
        list.add(new Product("Ana", 19));
        list.add(new Product("Paulo", 22));
        list.add(new Product("Tabata", 40));
        list.add(new Product("Joao", 30));

        //usando a expressao lambda na forma
        //Predicate<Product> pred = product -> product.getName().charAt(0) == 'T';
        //List<Product> filteredList = list.stream().filter(pred).collect(Collectors.toList());

//usando a expressao lambda inline na propria declaração
// List<Product> filteredList =list.stream().filter(product -> product.getName().charAt(0) == 'A').collect(Collectors.toList());

        //usando o metodo static criado no Product
        List<Product> filteredList = list.stream().filter(Product::staticMethod).collect(Collectors.toList());

        filteredList.forEach(System.out::println);//imprimindo
    }
}
