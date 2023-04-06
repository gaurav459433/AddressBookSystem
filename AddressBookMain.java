package addressbook;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        while (true) {
            AddressBook addressBook = new AddressBook();
            System.out.println(
                    "Enter The Name of Book You Want To  Access or Add  or Type 'search' to Search Persons Or Enter 'exit' to Exit");
            String bookName = scan.nextLine();
            if (bookName.equals("exit")) {
                System.out.println("The program is closed");
                break;
            } else if (bookName.equals("search")) {
                System.out.println("Enter the name of city or state you want to search :");
                String placeName = scan.nextLine();
                addressBook.showPersons(placeName);
                continue;
            }
            int result = addressBook.checkBook(bookName);  // (It can return 0 or 1)It will return 1 if book exist and breakdown loop
            int condition = 0;  // It will keep check on the addressbook created or not
            while (true) {
                if (result == 1) {
                    break;
                }
                System.out
                        .println("Do you want to add/edit/delete the contact (1/2/0) :Press 4 to Go back to main menu");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();

                if (input == 1) {

                    addressBook.addContact();

                } else if (input == 2) {
                    System.out.println("Enter the first name of person you to edit: ");
                    String name = scan.nextLine();
                    addressBook.editPerson(name);

                } else if (input == 3) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Enter the first name of the person you want to delete : ");
                    String name = scan2.nextLine();
                    addressBook.deletePerson(name);
                } else if (input == 3) {
                    addressBook.addBook(bookName, addressBook);
                    break;
                } else {
                    System.out.println("Enter the valid command: ");
                }
            }
        }
    }
}
