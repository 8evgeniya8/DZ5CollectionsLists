package tasksDZ.phonеBook;

public class PhoneIRecord implements IRecord {
    private String name;
    private String phone;

    public PhoneIRecord(String name, String phone) {
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
