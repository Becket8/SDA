package pl.sda.poznan.phone1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public  boolean addNewContact(Contact contact) {
        if (myContacts.indexOf(contact) >= 0) {
            log.info("Contact already exists");
            return false;
        }
        return true;
    }
}


