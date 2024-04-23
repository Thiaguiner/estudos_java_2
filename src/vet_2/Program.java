package vet_2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);//instanciando um novo produto// apontando para esse objeto
        }
        double soma = 0;
        for (int i=0;i<n;i++){
            soma += vect[i].getPrice();//tenho que pegar o getPrice pois eu so quero pegar o price
        }
        double media = soma /n;
        System.out.println("Media = " + media);

        sc.close();
    }
}
