import java.util.Arrays;
import java.util.Scanner;

public class MaxColumnTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size main array: ");
        int sizeMain = scanner.nextInt();

        System.out.print("Enter size element array: ");
        int sizeElement = scanner.nextInt();

        int[][] array = new int[sizeMain][sizeElement];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter element %d in array %d: ", j + 1, i + 1);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(array));


        System.out.printf("Enter the column want to sum (1-%d): ", sizeElement);
        int column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum += array[i][column - 1];
        }
        System.out.printf("Sum of column %d: %d", column, sum);
    }
}
