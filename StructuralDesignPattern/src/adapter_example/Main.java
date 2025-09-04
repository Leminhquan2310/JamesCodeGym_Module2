package adapter_example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(7);
        numbers.add(89);
        numbers.add(23);

        CollectionOperations adapter = new CollectionUtilsAdapter();
        Client client = new Client(adapter);
        client.printMaxValue(numbers);
    }
}
