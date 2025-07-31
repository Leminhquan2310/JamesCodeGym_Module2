import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(5, 10), new Square(10)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if(shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println("============");
        }
    }
}