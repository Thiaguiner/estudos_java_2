package stream_ex;

import stream_ex.entities.Product;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = sc.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {//tenta ler o arquivo

            List<Product> list = new ArrayList<>();//instanciei uma lista de produtos

            String line = br.readLine();//leio uma linha
            while (line != null) {//enquanto ela for diferente de nula ela continua lendo
                String[] fields = line.split(",");//slipt para recortar a linha em 2, nome e preco
                list.add(new Product(fields[0].trim(), Double.parseDouble(fields[1].trim())));//fields na[0]nome,1=preco
                line = br.readLine();
            }

            double avg = list.stream()//fazendo a media
                    .map(p -> p.getPrice())//pegando o preco
                    .reduce(0.0,/*reduce =>
                     ela permite fazer o somatorio dos precos*/
                            (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + avg);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //nomes dos produtos do preço abaixo da media em ordem decrescente
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)/*filtrando todo preco abaixo da media*/
                    .map(p -> p.getName())//pegando os nomes filtrados
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);//imprimindo com o consumer<>(forEach)


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
