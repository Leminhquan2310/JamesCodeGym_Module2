import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Current triangle: " + triangle);

        Scanner scString = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = scString.nextLine();
        System.out.print("Is filled (true/false)?: ");
        boolean isfilled = scanner.nextBoolean();

        triangle = new Triangle(color, isfilled, side1, side2, side3);
        System.out.println("Current triangle: " + triangle);
    }
}