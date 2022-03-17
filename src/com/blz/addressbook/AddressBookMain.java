package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter \n1 -> Add Contact \n2 -> Edit Existing Contact \3 -> Delete contact " +
                    "\n4 -> quit");
            switch (scanner.nextInt()) {
                case 1:
                    addressBook.addContacts();
                    break;
                case 2:
                    addressBook.edit();
                    break;
                case 3:
                    addressBook.delete();
                    break;
                case 4:
                    System.out.println("Exiting fro AddressBook");
                    quit = true;
                    break;
                default:
                    System.out.println("Enter valid Number");

            }
        }
    }
}
