package metodosAbstratos;

import metodosAbstratos.entities.Circle;
import metodosAbstratos.entities.Rectangle;
import metodosAbstratos.entities.Shape;
import metodosAbstratos.entities_enum.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(sc.next());

            //se for rectangle ele vai fazer um pergunta diferente se for Circle
            if (ch == 'r') {
                System.out.print("Widht: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape Areas: ");
        for (Shape shape : list) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}
