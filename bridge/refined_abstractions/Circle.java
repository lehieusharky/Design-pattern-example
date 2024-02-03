package bridge.refined_abstractions;

import bridge.abstraction.Shape;
import bridge.implementation.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with " + super.color.getColor());
    }

}
