package adapter_example;

import com.codegym.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> listNumbers = numbers.stream().toList();
        int max = collectionUtils.findMax(listNumbers);
        return max;
    }
}
