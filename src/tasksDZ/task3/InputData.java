package tasksDZ.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputData {
    private List<Integer> inputList;

    public InputData() {
        inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(4);
        inputList.add(3);
        inputList.add(5);
        inputList.add(6);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);
        Collections.sort(inputList);
    }

    public List<Integer> getInputList() {
        return inputList;
    }
}
