package com.bridgelabz;
import org.json.JSONObject;
import java.util.Objects;
import java.util.Scanner;

public class Contact implements Comparable {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private int phoneNumber;
    private String email;

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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact() {
    }

    public Contact(String firstName, String lastName, String address, String city, String state, int zipCode, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    void getPersonDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name :");
        firstName = scan.next();
        System.out.println("Enter last name :");
        lastName = scan.next();
        System.out.println("Enter address : ");
        address = scan.next();
        System.out.println("Enter city : ");
        city = scan.next();
        System.out.println("Enter state : ");
        state = scan.next();
        System.out.println("Enter zipcode : ");
        zipCode = scan.nextInt();
        System.out.println("Enter phone number : ");
        phoneNumber = scan.nextInt();
        System.out.println("Enter email : ");
        email = scan.next();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }


    @Override
    public int compareTo(Object o) {
        Contact contact = (Contact) o;
        int compareResult = this.city.compareTo(contact.city);
        return compareResult;
    }
    JSONObject getContactJSON() {
        JSONObject jsonPerson = new JSONObject();
        jsonPerson.put("firstName", firstName);
        jsonPerson.put("lastName", lastName);
        jsonPerson.put("email", email);
        jsonPerson.put("address", address);
        jsonPerson.put("city", city);
        jsonPerson.put("state", state);
        jsonPerson.put("zip", zipCode);
        jsonPerson.put("phoneNumber", phoneNumber);

        JSONObject jsonPersonObject = new JSONObject();
        jsonPersonObject.put("person", jsonPerson);
        return jsonPersonObject;
    }
    String[] getContactStrings() {
        return new String[] {firstName, lastName, email, address, city, state, zipCode + "", phoneNumber + ""};
    }

}
