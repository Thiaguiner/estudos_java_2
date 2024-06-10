package wildcard;

import wildcard.entities.Circle;
import wildcard.entities.Rectangle;
import wildcard.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3, 2));
        myShapes.add(new Circle(2));

        System.out.println("Total area: " + totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2));
        myCircles.add(new Circle(3));

        System.out.println("total circle = " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {//coringa delimitado ? extends Shape
        double sum = 0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
