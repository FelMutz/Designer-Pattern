package designers.decorator.domain;

import designers.decorator.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}