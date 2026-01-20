package com.day_12.digicontact;

import java.util.List;

public class DigiContactMain {

    public static void main(String[] args) {

        // 1️⃣ Create AddressBook
        AddressBook addressBook = new AddressBook();

        // 2️⃣ Create Address objects
        Address addr1 = new Address("Delhi", "Delhi", "110001");
        Address addr2 = new Address("Mumbai", "Maharashtra", "400001");
        Address addr3 = new Address("Bengaluru", "Karnataka", "560001");

        // 3️⃣ Create Contact objects
        Contact c1 = new Contact("Aman", "Sharma", 9876543210L, "aman@gmail.com", addr1);
        Contact c2 = new Contact("Riya", "Mehta", 9123456780L, "riya@gmail.com", addr2);
        Contact c3 = new Contact("Kunal", "Verma", 9988776655L, "kunal@gmail.com", addr3);
        Contact c4 = new Contact("Ankit", "Sharma", 9012345678L, "ankit@gmail.com", addr1);

        // 4️⃣ Add contacts
        addressBook.addNewContact(c1);
        addressBook.addNewContact(c2);
        addressBook.addNewContact(c3);
        addressBook.addNewContact(c4);

        // Duplicate check
        addressBook.addNewContact(
                new Contact("Aman", "Sharma", 9876543210L, "aman@gmail.com")
        );

        System.out.println("\n--- All Contacts (Sorted) ---");
        addressBook.displayContactsSorted();

        // 5️⃣ Edit contact
        System.out.println("\n--- Editing Contact ---");
        addressBook.editExistingContact("riya@gmail.com", "Riya", "Kapoor");
        addressBook.displayContactsSorted();

        // 6️⃣ Delete contact
        System.out.println("\n--- Deleting Contact ---");
        addressBook.deleteContact("kunal@gmail.com");
        addressBook.displayContactsSorted();

        // 7️⃣ Search by City
        System.out.println("\n--- Search by City: Delhi ---");
        List<Contact> delhiContacts = addressBook.searchByCity("Delhi");
        for (Contact c : delhiContacts) {
            System.out.println(c);
        }

        // 8️⃣ Search by State
        System.out.println("\n--- Search by State: Maharashtra ---");
        List<Contact> mhContacts = addressBook.searchByState("Maharashtra");
        for (Contact c : mhContacts) {
            System.out.println(c);
        }
    }
}
