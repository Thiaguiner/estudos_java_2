package generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {

    private List<Type> list = new ArrayList<>();

    public void addValue(Type value) {
        list.add(value);
    }

    //operação para ver qual o primeiro valor
    public Type first() {
        if (list.isEmpty()) {//programação defensiva para ver se a lista está vazia
            throw new IllegalStateException("List is empty");//
        }
        return list.get(0);//retorna o primeiro
    }

    //imprimir a lista
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {//se a lista n estiver vazia
            System.out.print(list.get(0));//imprime por fora o primeiro elemento
        }
        for (int i = 1; i < list.size(); i++) {//e dps para o 2 elemento em diante, imprime o resto
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
