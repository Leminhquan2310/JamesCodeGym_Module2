import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.printf("Min in array: %d", min);
    }
}
