package application_2;

import Rectangle.Retangle;

import java.util.Scanner;

public class Program_Retangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width and height");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        System.out.println();

        System.out.println("AREA = " + retangle.area());
        System.out.println("PERIMETER = " + retangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());


        sc.close();
    }
}
