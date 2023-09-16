package tasksDZ.task3;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberFinder {
    public List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqNambers = new ArrayList<>();
        for (Integer namber : numbers) {
            if (!uniqNambers.contains(namber)) {
                uniqNambers.add(namber);
            }
        }
        return uniqNambers;
    }
}
