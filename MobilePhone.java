package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }
            int position = findContact(oldContact);
            this.myContacts.set(position, newContact);
            System.out.println("Contact " + oldContact.getName() + " has been updated. New contact is " + newContact.getName());
            return true;

        }


    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.myContacts.remove(position);
            System.out.println("Position "+ contact.getName()+ " was deleted");
            return true;
        }
        System.out.println(contact.getName()+" was not found");
            return false;
        }



    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
            return null;
        }


    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1)+"."+ myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

}

