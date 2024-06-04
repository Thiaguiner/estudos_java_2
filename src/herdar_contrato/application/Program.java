package herdar_contrato.application;

import herdar_contrato.model.entities.AbstractShape;
import herdar_contrato.model.entities.Circle;
import herdar_contrato.model.entities.Retangle;
import herdar_contrato.model.entities.Shape;
import herdar_contrato.model.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Circle area: " + s2.area());
    }
}
