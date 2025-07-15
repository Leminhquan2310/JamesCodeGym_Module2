import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 5, 7, 8, 12, 55};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value remove: ");
        int value = scanner.nextInt();
        int indexDel = getIndexElement(array, value);
        if(indexDel != -1){
            delElement(array, indexDel);
            System.out.print("Array: ");
            for (int item : array){
                System.out.print(" " + item + " ");
            }
        } else {
            System.out.println("Does not have value remove in array!");
        }
    }

    public static int getIndexElement (int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
              return i;
            }
        }
        return -1;
    }

    public static void delElement(int[] arr, int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[i + 1] = 0;
        }
    }
}
