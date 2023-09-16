package tasksDZ.task1;

import java.util.List;

public class UseTargetName implements INameCounter {

    @Override
    public int count(List<String> words, String target) {
        int result = 0;
        for (String word : words) {
            if (word.equals(target)) {
                result++;
            }
        }
        System.out.println("Name: " + target + "\nThe number of repetitions: " + result);
        return result;
    }

}
