package addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        AddressBook book = new AddressBook();
        book.addContact();
        book.showContact();
    }
}
