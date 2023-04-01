package addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    public void addContact() {
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

    }

    public void showContact() {
        System.out.println(contact.toString());
    }

    public void editContact() {
        System.out.println("Enter First Name To Edit:");
        String name = sc.next();
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
