package tasksDZ.phonеBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhonеBookImplem implements IPhonеBook {
    private List<IRecord> IRecords;

    public PhonеBookImplem() {
        this.IRecords = new ArrayList<>();
    }

    @Override
    public void addRecord(IRecord IRecord) {
        IRecords.add(IRecord);
    }

    @Override
    public IRecord findRecordByName(String name) {
        return IRecords.stream()
                .filter(record -> record.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<IRecord> findAllRecordsByName(String name) {
        return IRecords.stream()
                .filter(record -> record.getName().equals(name))
                .collect(Collectors.toList());
    }
}
