package Consumer;

import Consumer.util.PriceUpdate;
import Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        //como que eu faço para percorrer a lista e aumentar o preço em 10%

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        //list.forEach(new PriceUpdate());implementação da interface
        // list.forEach(Product::staticPriceUpdate);implementando o metodo estatico
        //list.forEach(Product::nonStaticPriceUpdate);implementando o metodo nao estatico
        //list.forEach(cons);implementando a declaracao de labda como vista acima com o Consumer<Product>
        list.forEach(p -> p.setPrice(p.getPrice()*1.1));//declarando a lambda inline


        list.forEach(System.out::println);

    }
}
