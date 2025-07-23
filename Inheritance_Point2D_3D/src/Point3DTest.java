import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3, 4, 5);
        System.out.println(point3D);

        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
        System.out.println("Get array: " + Arrays.toString(point3D.getXYZ()));
    }
}
