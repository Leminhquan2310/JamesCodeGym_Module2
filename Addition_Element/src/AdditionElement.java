import java.util.Scanner;

public class AdditionElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number insert: ");
        int value = scanner.nextInt();
        System.out.print("Enter index insert: ");
        int index = scanner.nextInt();
        insertElement(array, index, value);
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
    }

    public static void insertElement(int[] arr, int index, int element) {
        for (int i = arr.length - 1; i >= index; i--) {
            if (i == index){
                arr[i] = element;
            } else {
                arr[i] = arr[i - 1];
            }
        }
    }
}
