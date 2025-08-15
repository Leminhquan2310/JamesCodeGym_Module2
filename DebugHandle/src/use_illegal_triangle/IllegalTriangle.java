package use_illegal_triangle;

public class IllegalTriangle {

    public static void main(String[] args) {
        try {
//            double x = 3, y = 4, z = 0;
            double x = 3, y = 4, z = 8;
            checkTriangle(x, y, z);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkTriangle (double x, double y, double z) throws IllegalTriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("Các cạnh phải > 0");
        };

        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }

        System.out.println("Triangle{" + "x=" + x + ", y=" + y + ", z=" + z + '}');
    }
}
