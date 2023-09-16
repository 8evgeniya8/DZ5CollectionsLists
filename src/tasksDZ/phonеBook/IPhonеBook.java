package tasksDZ.phonеBook;

import java.util.List;

public interface IPhonеBook {
    void addRecord(IRecord IRecord);

    IRecord findRecordByName(String name);

    List<IRecord> findAllRecordsByName(String name);
}
