import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Element is array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.printf("\n%-20s%s", "Element is array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
