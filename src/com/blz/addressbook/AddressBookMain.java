package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter \n1 -> Add Contact \n2 -> Edit Existing Contact ");
        switch (scanner.nextInt()) {
            case 1:
                addressBook.addContacts();
                break;
            case 2:
                addressBook.edit();
                break;
            default:
                System.out.println("Enter valid Number");

        }
    }
}
