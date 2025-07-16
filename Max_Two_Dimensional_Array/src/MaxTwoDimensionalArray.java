import java.util.Scanner;

public class MaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size main Array: ");
        int size = scanner.nextInt();
        System.out.print("Enter size element array of main array: ");
        int sizeElement = scanner.nextInt();
        int[][] array = new int[size][sizeElement];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter element %d in array %d: ", j + 1, i + 1);
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0], point1 = 0, point2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.printf("Max in main array is: %d. At position: [%d][%d]", max, point1, point2);
    }
}
