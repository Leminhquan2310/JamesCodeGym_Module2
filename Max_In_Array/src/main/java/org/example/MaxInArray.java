package org.example;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int index = 0;

        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);
    }
}
