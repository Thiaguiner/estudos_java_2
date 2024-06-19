package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 10);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);//criar uma stream a partir da lista/coleção
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");//criar uma stream com stream.of
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);//funçao de iteracao
        System.out.println(Arrays.toString(st3.limit(10).toArray()));




    }
}
