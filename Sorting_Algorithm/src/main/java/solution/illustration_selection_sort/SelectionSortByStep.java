package solution.illustration_selection_sort;

public class SelectionSortByStep {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        selectionSort(list);


    }

    public static void selectionSort (double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;
            System.out.println("Set min value: " + list[min]);
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                    System.out.println("Set min value: " + list[min]);
                }
            }
            if (min != i) {
                System.out.println("Swap " + list[i] + " with " + list[min]);
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
            System.out.print("List after the  " + (i + 1) + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
