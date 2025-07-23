import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(4, 4);
        System.out.println(point2D);

        point2D.setXY(5, 5);
        System.out.println(point2D);

        float[] point2dTest = point2D.getXY();
        System.out.println(Arrays.toString(point2dTest));
    }
}
