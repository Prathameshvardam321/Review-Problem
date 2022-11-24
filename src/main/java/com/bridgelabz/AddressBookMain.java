package com.bridgelabz;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class AddressBookMain  {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        AddressBook addressBook;
        int ch;
        do {
            System.out.println("1.Add AddressBook\t2.Display all addressBooks\t3.Search by city 4\t4.Search by state\t5.Add contact in AddressBook\t6.SortByNames\t7.count by names\t8.Display contact \t9.File read and write into text\t10.File read and write into Json\t11.File read and write into CSV ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter address book name to add : ");
                    String name = scanner.next();
                    if (addressBookHashMap.containsKey(name)) {
                        System.out.println("AddressBook already exists.");
                    } else {
                        addressBookHashMap.put(name, new AddressBook());
                    }
                    break;
                case 2:
                    System.out.println(addressBookHashMap.keySet());
                    break;
                case 3:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName)) {
                        System.out.println("Enter city name : ");
                        String cityName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName);
                        addressBook.viewPersonByCity(cityName);
                    } else {
                        System.out.println("AddressBook not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        System.out.println("Enter state name : ");
                        String stateName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.viewPersonByCity(stateName);


                    } else {
                        System.out.println("AddressBook not found.");
                    }
                case 5:
                    System.out.println("Enter addressBook name to add contact : ");
                    String searchName1 = scanner.next();
                    if (addressBookHashMap.containsKey(searchName1)) {
                        addressBook = addressBookHashMap.get(searchName1);
                        addressBook.addContact();
                    } else {
                        System.out.println("AddressBook not exists.");
                    }
                    break;

                case 6:
                    System.out.println("Enter AddressBook name : ");
                    addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.sortContactByCityName();
                    } else {
                        System.out.println("AddressBook not found.");
                    }
                    break;
                case 7:
                    System.out.println("Enter AddressBook name : ");
                    addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        addressBook = addressBookHashMap.get(addBookName1);
                        long count = addressBook.getCount();
                        System.out.println(count);
                    }
                    break;
                case 8:
                    System.out.println("Enter AddressBook name : ");
                    addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.displayContact();

                    }
                    break;

                case 9:
                    String file = "C:\\Users\\prath\\OneDrive\\Desktop\\java programs\\WorkShopFinal\\src\\main\\java\\com\\bridgelabz\\addressBook.txt";
                    System.out.println("Enter AddressBook name to read  : ");
                    addBookName1 = scanner.next();
                    addressBook = addressBookHashMap.get(addBookName1);
                    addressBook.readFiles(addressBookHashMap, file);
                    break;

            }
        } while (ch != 0);

    }
}
