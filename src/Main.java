import tasksDZ.phonеBook.*;
import tasksDZ.phonеBook.IRecord;
import tasksDZ.task1.IClassForInitializer;
import tasksDZ.task1.UseTargetName;
import tasksDZ.task2.ArrayToListConverter;
import tasksDZ.task3.InputData;
import tasksDZ.task3.UniqueNumberFinder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        TasksDZ

//        Task1 :
        UseTargetName useTargetName = new UseTargetName();
        List<String> name = IClassForInitializer.initializer();
        String target = "Rick Sanchez";
        int result = useTargetName.count(name, target);
        System.out.println();

//        Task2 :

        String[] wordArray = {"Apple", "Banana", "Cherry", "Kivi"};
        ArrayToListConverter listConverter = new ArrayToListConverter();
        List<String> wordList = listConverter.toList(wordArray);
        System.out.println("Array: " + Arrays.toString(wordArray));
        System.out.println("List: " + wordList);
        System.out.println();

//        Task3 :
        InputData inputData = new InputData();
        List<Integer> inputList = inputData.getInputList();
        UniqueNumberFinder uniqueNumberFinder = new UniqueNumberFinder();
        List<Integer> uniqueNumber = uniqueNumberFinder.findUnique(inputList);
        System.out.println("Original list: " + inputList);
        System.out.println("Uniqe Numbers: " + uniqueNumber);
        System.out.println();

//      Phone Book Tasks
        IPhonеBook phonBook = new PhonеBookImplem();
        PhonDirectory phonDirectory = new PhonDirectory(phonBook);

        IRecord IRecord1 = new RecordImplem("Liza", "44444444444");
        IRecord IRecord2 = new RecordImplem("Liza", "8888888888888");
        IRecord IRecord3 = new RecordImplem("Liza", "44444444444");
        IRecord IRecord4 = new RecordImplem("Alisa", "44444444444");

        phonDirectory.addToPhonBook(IRecord1);
        phonDirectory.addToPhonBook(IRecord2);
        phonDirectory.addToPhonBook(IRecord3);
        phonDirectory.addToPhonBook(IRecord4);

        IRecord foundIRecord = phonBook.findRecordByName("Liza");
        if (foundIRecord != null) {
            System.out.println("Name: " + foundIRecord.getName()
                    + "Phone" + foundIRecord.getPhone());
        } else {
            System.out.println("not found");
        }
        List<IRecord> foundIRecords = phonBook.findAllRecordsByName("Liza");
        if (!foundIRecords.isEmpty()) {
            System.out.println("Found for " + foundIRecords.get(0).getName());
            for (IRecord IRecord : foundIRecords) {
                System.out.println("Name list: " + IRecord.getName() +
                        " Phone list: " + IRecord.getPhone());
            }
        } else {
            System.out.println("not found list");
        }
    }
}

