package ex_vet_pensionato;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];//criação do vetor

        System.out.println("How many rooms will be rented? ");
        int N = sc.nextInt();//leu a quantidade

        for (int i = 1; i <= N; i++) {//perguntas sobre o quarto
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            //rooms(vetor), na posição roomNumber vai receber o name e email
            rooms[roomNumber] = new Rent(name, email);//leu os dados atribuindo ao vetor
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i =0;i<10;i++){
            if (rooms[i] != null){
                System.out.println(i + ": " +rooms[i]);
            }
        }


        sc.close();
    }
}
