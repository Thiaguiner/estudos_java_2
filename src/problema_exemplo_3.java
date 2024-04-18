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

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p -x.a) * (p - x.b) * (p - x.c));//area do x

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p -y.a) * (p - y.b) * (p - y.c));//area do y

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
