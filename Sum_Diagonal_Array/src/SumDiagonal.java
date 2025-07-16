import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = scanner.nextInt();

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element at position (row = %d, column = %d): ", i + 1, j + 1);
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println(" ");
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum diagonal of array: " + sum);
    }
}
