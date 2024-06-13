package set_exercicio_fixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando os 3 cursos no SET
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        //perguntando quantos estudantes fazer o curso a
        System.out.print("How many students for course A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }
        //perguntando quantos estudantes fazer o curso b
        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }
        //perguntando quantos estudantes fazer o curso c
        System.out.print("How many students for course C: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }
        //fazendo a junção dos estudantes
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
