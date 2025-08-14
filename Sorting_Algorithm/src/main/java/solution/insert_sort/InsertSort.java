package solution.insert_sort;

import java.util.Arrays;

public class InsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertSort (int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }
}
