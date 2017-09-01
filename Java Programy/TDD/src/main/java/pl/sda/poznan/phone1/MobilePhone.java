package pl.sda.poznan.phone1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.indexOf(contact) >= 0) {
            log.info("Contact already exists");
            return false;
        }
        return true;
    }

    private boolean hasContact(Contact contact) {
        return myContacts.indexOf(contact) >= 0;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (hasContact(oldContact)) {
            int indexOfOldContact = myContacts.indexOf(oldContact);
            myContacts.add(indexOfOldContact, newContact);
            return true;
        }
        log.info("Nie dodano kontaktu");
        return false;

    }

    public Contact findContact(String name) {
        for (Contact c : myContacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public  void showAllContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getNumber());
        }
    }
    public Contact queryContact(String name) {
        Contact position = findContact(name);
        if (position != null) {
            return this.myContacts.get();
        }

        return null;
    }
}

