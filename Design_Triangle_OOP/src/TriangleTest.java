public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        triangle = new Triangle("blue", true, 4, 6, 5);
        System.out.println(triangle);

        System.out.println("Get Area of triangle: " + triangle.getArea());
        System.out.println("Get Perimeter of triangle: " + triangle.getPerimeter());
    }
}
