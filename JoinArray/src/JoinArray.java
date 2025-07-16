import java.util.Arrays;
import java.util.Scanner;

public class JoinArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1, array2;
        int size1, size2;
        do {
            System.out.print("Enter size array 1: ");
            size1 = scanner.nextInt();

            System.out.print("Enter size array 2: ");
            size2 = scanner.nextInt();

            if (size1 > 20 || size2 > 20) {
                System.out.println("Size must be great than 20");
            }
        } while (size1 > 20 || size2 > 20);

        array1 = new int[size1];
        System.out.println("Enter element of array 1");
        enterElement(array1);
        array2 = new int[size2];
        System.out.println("Enter element of array 2");
        enterElement(array2);

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < Math.max(size1, size2); i++) {
            if(i < size1){
                array3[i] = array1[i];
            }

            if(size1 + i < array3.length){
                array3[size1 + i] = array2[i];
            }
        }

        System.out.print("Array 3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(" " + array3[i] + " ");
        }
    }

    public static void enterElement (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }
    }
}
