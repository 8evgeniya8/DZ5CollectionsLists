package tasksDZ.phonеBook;

public class RecordImplem implements IRecord {
    private String name;
    private String phone;

    public RecordImplem(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }
}

