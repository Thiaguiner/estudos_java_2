package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        //hashset é o mais rapido, sendo que a ordem nao importa
        //treeset ele ordena
        //LinkedHashset
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

       // set.remove("TV");

        //set.removeIf(x -> x.charAt(0) == 'T');
        set.removeIf(x -> x.length() >= 3);

       // System.out.println(set.contains("Notebook")); verifica se realmente existe o item

        for (String s : set) {
            System.out.println(s);
        }
    }
}
