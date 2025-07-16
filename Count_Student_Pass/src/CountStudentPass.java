import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        array = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = scanner.nextInt();
            if(array[i] >= 5 && count <= 10) count++;
        }

        System.out.print("List of mask: ");
        System.out.println(Arrays.toString(array));
        System.out.print("The number of students passing the exam is " + count);
    }
}
