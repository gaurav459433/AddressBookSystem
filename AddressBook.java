package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();


    public void addContact() {
        Contact contact = new Contact();
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
