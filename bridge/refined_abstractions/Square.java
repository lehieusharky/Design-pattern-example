package bridge.refined_abstractions;

import bridge.abstraction.Shape;
import bridge.implementation.Color;

public class Square extends Shape {

    public Square(Color color) {
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw square with " + super.color.getColor());
    }

}
