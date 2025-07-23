import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3, 5);
        System.out.println(point);
        System.out.println("Array of point: " + Arrays.toString(point.getXY()));
    }
}
