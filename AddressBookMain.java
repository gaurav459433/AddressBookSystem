package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        Scanner scan = new Scanner(System.in);
        AddressBook book = new AddressBook();
        int option;

        do {
            System.out.println("1. ADD CONTACT \n2. EDIT CONTACT \n3. DISPLAY CONTACT ");
            System.out.println("Enter the Operation Number");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    book.editContact();
                    break;
                case 3:
                    book.showContact();
                    break;
                default:
                    System.out.println("Wrong Operation Number");
                    break;
            }

        }while (option < 4);
    }
}
