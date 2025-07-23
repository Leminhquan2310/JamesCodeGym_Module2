public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(8.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(6.0, "blue", 10.0);
        System.out.println(cylinder);
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}
