package tasksDZ.phonеBook;

public class PhonDirectory {
    private IPhonеBook phoneBook;

    public PhonDirectory(IPhonеBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addToPhonBook(IRecord IRecord) {
        phoneBook.addRecord(IRecord);
    }
}
