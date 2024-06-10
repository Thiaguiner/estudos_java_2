package generics_coringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {


        //List<Objects> myObjs = new ArrayList<>(); assim da erro

        List<?> myObjs = new ArrayList<>();//usando o tipo coringa
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5,2,10);//declarando numeros
        printList(myInts);

        List<String> myStrs = Arrays.asList("maria", "alex", "bob");//declarando strings
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj :list){//imprime qlqr tipo de lista, pois está com o coringa(?)
            System.out.println(obj);
        }
    }
}
