package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    static ArrayList<AddressBook> books = new ArrayList<AddressBook>();

    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    String bookName;

    void addContact() {
        Contact contact = new Contact();
        contact.addContactInfo();
        boolean duplicateContact = contactArrayList.stream().anyMatch(x -> x.getFirstName().equals(contact.getFirstName()));
        if (duplicateContact == true) {
            System.out.println("It is a duplicate contact: ");
            return;
        } else {
            contactArrayList.add(contact);
            System.out.println("Contact added successfully: ");
        }

    }

    void deletePerson(String name) {
        if (contactArrayList.size() == 0) {
            System.out.println("Address book is empty.Please Add First");
        } else {
            int m = 0;
            for (int i = contactArrayList.size() - 1; i >= 0; --i) {
                if (contactArrayList.get(i).getFirstName().contains(name)) {
                    contactArrayList.remove(i);
                    System.out.println("Contact deleted successfully");
                    m += 1;
                    break;
                }
            }
            if (m == 0) {
                System.out.println("No contact with the given name exist");
            }
        }

    }

    void editPerson(String name) {
        if (contactArrayList.size() == 0) {
            System.out.println("Addressbook is empty.Please add First");
        } else {
            int m = 0;
            for (int i = contactArrayList.size() - 1; i >= 0; --i) {
                if (contactArrayList.get(i).getFirstName().contains(name)) {
                    contactArrayList.get(i).addContactInfo();
                    System.out.println("Contact Updated successfully");
                    m += 1;
                    break;
                }
            }
            if (m == 0) {
                System.out.println("No contact with the given name exist");
            }
        }

    }

    void addBook(String name, AddressBook book) {
        book.bookName = name;
        this.books.add(book);
        System.out.println("Book " + name + " added successfully");

    }

    void addInfo(Contact value) {
        System.out.println("First Name :");
        value.setFirstName(sc.next());
        System.out.println("Last Name :");
        value.setLastName(sc.next());
        System.out.println("Enter the address :");
        value.setAddress(sc.next());
        System.out.println("Enter city : ");
        value.setCity(sc.next());
        System.out.println("Enter state : ");
        value.setState(sc.next());
        System.out.println("Enter Email : ");
        value.setEmail(sc.next());
        System.out.println("Enter Phone Number : ");
        value.setPhoneNumber(sc.nextInt());
        System.out.println("Enter zip : ");
        value.setZip(sc.nextInt());
    }

    void showPersons(String placeName) {
        if (books.size() == 0) {
            System.out.println("Booklist is empty");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            List<Contact> matchedContact = books.get(i).contactArrayList.stream()
                    .filter(x -> x.getCity().equals(placeName) || x.getState().equals(placeName)).collect(Collectors.toList());
            matchedContact.stream().forEach(x -> System.out.println(x.getFirstName()));

        }
    }

    void operations(ArrayList<AddressBook> books, int i) {
        Scanner input = new Scanner(System.in);
        int condition1 = 0;/// This is for checking the contact name exist or not
        int condition = 0; /// This is condition for running while loop
        while (condition == 0) {
            System.out.println("Do you want to add/edit/delete contact (0/1/2) :Press 3 to go back to main menu");
            int response = input.nextInt();
            switch (response) {
                case 0:
                    Contact contact = new Contact();
                    contact.addContactInfo();
                    boolean duplicateContact = books.get(i).contactArrayList.stream()
                            .anyMatch(x -> x.getFirstName().equals(contact.getFirstName()));
                    if (duplicateContact == true) {
                        System.out.println("It is a duplicate contact.");
                        return;
                    } else {
                        books.get(i).contactArrayList.add(contact);
                        System.out.println("Contact added successfully");
                    }
                    break;
                case 1:
                    if (books.get(i).contactArrayList.size() == 0) {
                        System.out.println("Addressbook is empty");
                    } else {
                        System.out.println("Enter the first name of person you want to edit :");
                        Scanner scan1 = new Scanner(System.in);
                        String name1 = scan1.nextLine();
                        for (Contact value : books.get(i).contactArrayList) {
                            if (value.getFirstName().equals(name1)) {
                                addInfo(value);
                                System.out.println("Contact updated successfully");
                                condition1 = 1;
                                break;
                            }

                            if (condition1 == 0) {
                                System.out.println("Contact doesn't exist with the given name " + name1);
                            }

                        }
                    }
                    break;
                case 2:
                    if (books.get(i).contactArrayList.size() == 0) {
                        System.out.println("Addressbook is empty");
                    } else {
                        System.out.println("Enter the first name of person you want to delete :");
                        Scanner scan2 = new Scanner(System.in);
                        String name2 = scan2.nextLine();
                        for (Contact value : books.get(i).contactArrayList) {
                            if (value.getFirstName().equals(name2)) {
                                books.get(i).contactArrayList.remove(value);
                                System.out.println("Contact deleted successfully");
                                condition1 = 1;
                                break;
                            }
                        }
                        if (condition1 == 0) {
                            System.out.println("Contact doesn't exist with the given name " + name2);
                        }
                    }
                    break;
                case 3:
                    condition = 1;
                    break;
                default:
                    System.out.println("Enter valid command");
                    break;
            }
        }
    }

    int checkBook(String name) {
        int result = 0;
        if (this.books.size() == 0) {
            System.out.println("Booklist was empty. " + name + " is created.");

        } else {
            int track = 0;
            for (int i = books.size() - 1; i >= 0; --i) {
                if (books.get(i).bookName.contains(name)) {

                    System.out.println("Book exist please go ahead");
                    operations(books, i);
                    track = 1;
                    result = 1;
                    break;

                }
            }
            if (track == 0) {
                System.out.println("Book doesn't exist with the given name. " + name + " is created");

            }

        }
        return result;
    }

}
