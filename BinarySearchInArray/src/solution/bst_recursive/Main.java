package solution.bst_recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào số thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Nhập số cần tìm: ");
        int value = scanner.nextInt();
        int indexValue = binarySearch(array, 0, array.length - 1, value);
        System.out.println("Số cần tìm nằm ở vị trí index = " + indexValue);
        System.out.println("array[" + indexValue + "] = " + array[indexValue]);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = left + (right - left) / 2;
        if (array[middle] == value) return middle;
        else if (value > array[middle]) left = middle + 1;
        else right = middle - 1;
        return  binarySearch(array, left, right, value);
    }
}
