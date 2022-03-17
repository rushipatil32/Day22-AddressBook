package com.blz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();
        addressBook.addContacts();
        addressBook.display();
    }
}
