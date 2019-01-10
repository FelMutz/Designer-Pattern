package designers.decorator;

import designers.decorator.decorators.RedShapeDecorator;
import designers.decorator.domain.Circle;
import designers.decorator.domain.Rectangle;
import designers.decorator.interfaces.Shape;

public class TestDecorator {
    public static void testDecorator(){

        System.out.println("Test Decorator");
        System.out.println();

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
