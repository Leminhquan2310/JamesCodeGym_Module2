package factory_method_shape;

import factory_method.Animal;
import factory_method.AnimalFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("circle");
        s1.draw();
        Shape s2 = shapeFactory.getShape("square");
        s2.draw();
        Shape s3 = shapeFactory.getShape("rectangle");
        s3.draw();


    }
}
