package facade_excercise;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList = new RandomList();
    private ListFilter listFilter = new ListFilter();
    private ListPrinter listPrinter = new ListPrinter();

    public RandomListFacade() {
    }

    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> numbers = randomList.generateList(size, min, max);

        List<Integer> filteredNumbers = listFilter.filterOdd(numbers);

        listPrinter.printList(filteredNumbers);
    }
}
