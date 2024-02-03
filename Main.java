import bridge.concrete_implementations.BlueColor;
import bridge.concrete_implementations.GreenColor;
import bridge.concrete_implementations.RedColor;
import bridge.refined_abstractions.Circle;
import bridge.refined_abstractions.Square;

public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedColor());

        redCircle.draw();

        Circle greenCircle = new Circle(new GreenColor());

        greenCircle.draw();

        Square blueSquare = new Square(new BlueColor());

        blueSquare.draw();
    }
}
