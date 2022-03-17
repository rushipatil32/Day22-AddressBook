package com.blz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Map<String, AddressBook> addressBook = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int EXIT = 6;

        int choice = 0;
        while (choice != EXIT) {
            System.out.println(
                    "1 : Add AddressBook\n2 : Add Contact\n3 : Edit Contact\n4 : Delete Contact\n5 : Display Contact\n"
                            + EXIT + " : to exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addAddressBook();
                    break;

                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();

                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    displayContact();
                    break;

            }

        }

    }


    // method to edit contact

    private static void editContact() {
        System.out.println("Enter the name of address book to  edit");

        String bookName = sc.nextLine();
        AddressBook adBook = addressBook.get(bookName);
        if (adBook != null) {
            addressBook.get(bookName).editPerson();
        } else {
            System.out.println("AddressBook doesn't exist");
        }

    }


    // method to add new addressBook

    private static void addAddressBook() {
        System.out.println("Enter the name of new address book");

        String bookName = sc.nextLine();

        AddressBook book = addressBook.get(bookName);
        if (book != null) {
            System.out.println("AddressBook with this name exists");
        } else {

            AddressBook adBook = new AddressBook(bookName);
            addressBook.put(bookName, adBook);
        }

    }


    // method to delete contact

    private static void deleteContact() {
        System.out.println("Enter the name of address book to delete contact");

        String bookName = sc.nextLine();
        AddressBook adBook = addressBook.get(bookName);
        if (adBook != null) {
            addressBook.get(bookName).deletePerson();
        } else {
            System.out.println("AddressBook doesn't exist");
        }

    }


    // method to display contacts of addressBook

    private static void displayContact() {
        System.out.println("Enter the name of address book to display");
        String bookName = sc.nextLine();
        AddressBook adBook = addressBook.get(bookName);

        if (adBook != null) {
            adBook.print();
        } else {
            System.out.println("Book name not found");
        }

    }


    // method to add a new contact to addressBook

    private static void addContact() {
        System.out.println("Enter the name of Address book to add the contact");
        String adBook = sc.nextLine();
        AddressBook Book = addressBook.get(adBook);
        if (Book == null) {
            System.out.println("No book found");

        } else {
            addressBook.get(adBook).addContact();
        }
    }
}