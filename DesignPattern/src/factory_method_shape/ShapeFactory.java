package factory_method_shape;

public class ShapeFactory {
    public Shape getShape(String type){
        if ("circle".equals(type)){
            return new Circle();
        } else if ("square".equals(type)){
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
