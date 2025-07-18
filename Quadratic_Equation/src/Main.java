import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter a: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if(delta > 0){
            System.out.println("The equation has 2 roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0){
            System.out.println("The equation has 1 root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}