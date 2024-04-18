import java.util.Scanner;

public class problema_exemplo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;//lendo as medidas do x
        System.out.println("digite as medidas do triangulo x");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y");//lendo as medidas do y
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p - xC));//area do x

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p - yC));//area do y

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
