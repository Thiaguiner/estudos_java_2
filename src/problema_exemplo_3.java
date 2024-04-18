import entities.Triangle;

import java.util.Scanner;

public class problema_exemplo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("digite as medidas do triangulo x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y");//lendo as medidas do y
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A maior area: X ");
        }else{
            System.out.println("A maior area: Y");
        }

        sc.close();
    }
}
