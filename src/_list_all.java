

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _list_all {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");//adiciona o elemento na lista na posição que voce quer

        System.out.println(list.size());//para ver o tamanho da lista

//        list.remove("Anna");//remove o elemento

        for(String names : list){
            System.out.println(names);
        }
        System.out.println("-------------");
        list.removeIf(nomes -> nomes.charAt(0) == 'M');//removeu todos que começavam com o M
        for(String names : list){
            System.out.println(names);
        }

        System.out.println("--------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));//encontra o nome na posição

        System.out.println("------------------");

        //lista com apenas nomes começados com A
        List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'A').collect(Collectors.toList());
        for(String names : result){
            System.out.println(names);
        }
        System.out.println("-------------------");

        //primeiro nome que aparece com a letra A, se n tiver nenhum aparece null
        String name = list.stream().filter(nomes -> nomes.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
