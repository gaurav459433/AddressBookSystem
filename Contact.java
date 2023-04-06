package addressbook;

import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public void addContactInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name :");
        this.firstName = scan.next();
        System.out.println("Last Name :");
        this.lastName = scan.next();
        System.out.println("Enter the address :");
        this.address = scan.next();
        System.out.println("Enter city : ");
        this.city = scan.next();
        System.out.println("Enter state : ");
        this.state = scan.next();
        System.out.println("Enter Email : ");
        this.email = scan.next();
        System.out.println("Enter Phone Number : ");
        this.phoneNumber = scan.nextInt();
        System.out.println("Enter zip : ");
        this.zip = scan.nextInt();
    }
}
