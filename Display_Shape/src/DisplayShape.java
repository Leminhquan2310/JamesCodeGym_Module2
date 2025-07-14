import java.util.Scanner;

public class DisplayShape {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawSquareTriangle();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
            }
        } while (choice != 4);
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
    }

    public static void drawRectangle() {
        System.out.print("Enter the length rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width rectangle: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            System.out.println("* ".repeat(length));
        }
    }

    public static void drawSquareTriangle() {
        System.out.println("The corner is top? (Yes/No): ");
        boolean isTop = scannerString.nextLine().equalsIgnoreCase("yes");
        System.out.println("The corner is Right? (Yes/No): ");
        boolean isRight = scannerString.nextLine().equalsIgnoreCase("yes");
        int init = isTop ? 5 : 1;
        boolean condition = true;

        while (condition) {
            if (isRight) {
                System.out.print(" ".repeat((5 - init) * 2));
                System.out.println("* ".repeat(init));
            } else {
                System.out.println("* ".repeat(init));

            }
            if (isTop) {
                init--;
                condition = init >= 1;
            } else {
                init++;
                condition = init <= 5;
            }
        }
    }

    public static void drawIsoscelesTriangle() {
        for (int i = 1, j = 3 ; i <= 7; i+= 2, j--) {
            System.out.print(" ".repeat(j));
            System.out.println("*".repeat(i));
        }
    }
}
