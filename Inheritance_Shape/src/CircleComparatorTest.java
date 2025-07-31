import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle( "indigo", false,3.5);

        System.out.println("Pre-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        CircleComparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);

        System.out.println("After-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
