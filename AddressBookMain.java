package addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String, ArrayList<Contact>> hashMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        AddressBookMain mainObject = new AddressBookMain();
        AddressBook addressBook = new AddressBook();
        int flag = 1;

        while (flag == 1) {
            System.out.println("Select a choice : \n1. ADD NEW ADDRESS BOOK \n2. ADD CONTACT IN NEW ADDRESS BOOK \n3. EXIT FROM ADDRESS BOOK ");
            System.out.println("Enter the Operation Number: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    mainObject.addAddressBook();
                    break;
                case 2:
                    System.out.println("Enter Unique Name Of Your New Address Book:");
                    String uniqueName = scan.next();
                    if (mainObject.hashMap.containsKey(uniqueName))
                        addressBook.addressBookOperationWork(mainObject.hashMap.get(uniqueName));
                    else
                        System.out.println("This Name Of Address Book Is Not Avilable");
                    break;
                case 3:
                    flag = 0;
                    System.out.println("Exited Successfully");
                    break;
                default:
                    System.out.println("Enter a valid Operation Number: ");
                    break;
            }

        }

    }

    public void addAddressBook() {
        System.out.println("For Adding New Address Book: ");
        ArrayList<Contact> contactPersonArrayList = new ArrayList<>();
        System.out.println("Enter Unique Name To Create Your New Address Book: ");
        String uniqueName = scan.next();
        if (!hashMap.containsKey(uniqueName))
            hashMap.put(uniqueName, contactPersonArrayList);
        else
            System.out.println("Entered Unique Name Is Already Exist: ");
    }
}
