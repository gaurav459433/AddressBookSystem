package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    public void addressBookOperationWork(ArrayList<Contact> contactArrayList) {
        AddressBook book = new AddressBook();
        int flag = 1;

        while (flag == 1) {
            System.out.println("1. ADD CONTACT \n2. EDIT CONTACT \n3. DISPLAY CONTACT \n4. DELETE CONTACT \n5. EXIT ");
            System.out.println("Enter the Operation Number");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    book.editContact();
                    break;
                case 3:
                    book.showContact();
                    break;
                case 4:
                    book.deleteContact();
                    break;
                case 5:
                    flag = 0;
                    System.out.println("Exited Successfully");
                    break;
                default:
                    System.out.println("Wrong Operation Number");
                    break;
            }

        }
    }

    public void addContact() {
        Contact contact = new Contact();
        if (duplicateCheck() == true) {
            System.out.println("This Contact Is Already Exist: ");
        } else {
            System.out.println("Enter First Name: ");
            contact.setFirstName(sc.next());
            System.out.println("Enter Last Name: ");
            contact.setLastName(sc.next());
            System.out.println("Enter Address Name: ");
            contact.setAddress(sc.next());
            System.out.println("Enter City Name: ");
            contact.setCity(sc.next());
            System.out.println("Enter State Name: ");
            contact.setState(sc.next());
            System.out.println("Enter Email: ");
            contact.setEmail(sc.next());
            System.out.println("Enter Zip Code: ");
            contact.setZip(sc.nextInt());
            System.out.println("Enter Mobile Number: ");
            contact.setPhoneNumber(sc.nextLong());

            contactArrayList.add(contact);
        }
    }

    public boolean duplicateCheck() {
        if (contactArrayList == null) {
            return false;
        }
        if (!contactArrayList.isEmpty()) {
            System.out.println("Enter First Name to check: ");
            String name = sc.next();
            for (int j = 0; j < contactArrayList.size(); j++) {
                if (name.equals(contactArrayList.get(j).getFirstName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void showContact() {
        for (int i = 0; i < contactArrayList.size(); i++) {
            Contact contact = contactArrayList.get(i);
            System.out.println(contact.toString());
        }
    }

    public void editContact() {
        System.out.println("Enter First Name To Edit:");
        String name = sc.next();
        for (Contact contact : contactArrayList) {
            if (contact.getFirstName().equals(name)) {
                System.out.println("Enter First Name: ");
                contact.setFirstName(sc.next());
                System.out.println("Enter Last Name: ");
                contact.setLastName(sc.next());
                System.out.println("Enter Address Name: ");
                contact.setAddress(sc.next());
                System.out.println("Enter City Name: ");
                contact.setCity(sc.next());
                System.out.println("Enter State Name: ");
                contact.setState(sc.next());
                System.out.println("Enter Email: ");
                contact.setEmail(sc.next());
                System.out.println("Enter Zip Code: ");
                contact.setZip(sc.nextInt());
                System.out.println("Enter Mobile Number: ");
                contact.setPhoneNumber(sc.nextLong());
            } else {
                System.out.println("Contact Doesn't Exist:");
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter First Name To Delete:");
        String name = sc.next();
        for (Contact contact : contactArrayList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                contactArrayList.remove(contact);
                System.out.println("!!Deleted!!");
                break;
            } else {
                System.out.println("Doesn't exist.");
            }

        }
    }
}
