package ChallengeArray;

import java.util.ArrayList;

/**
 * Created by angel alekhine on 11/29/2016.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t0 - to print list of contacts.");
        System.out.println("\t1 - to add a new contact");
        System.out.println("\t2 - to update a contact");
        System.out.println("\t3 - to remove a contact");
        System.out.println("\t4 - to quit");
    }

    public boolean addContact(Contacts contact){
        if (findContact(contact.getContactsName())>= 0){
            System.out.println("Contact is already on the list.");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundContact = findContact(oldContact);
        if (foundContact < 0){
            System.out.println("Contact was not found");
            return false;
        }
        this.myContacts.set(foundContact, newContact);
        System.out.println(oldContact.getContactsName() + " was replaced for " + newContact.getContactsName());
        return true;
    }

    public String queryContact(Contacts contactName){
        if (findContact(contactName) >= 0){
            return contactName.getContactsName();
        }
        return null;
    }

    public boolean removeContact(Contacts contactName){
        int foundContact = findContact(contactName);
        if (foundContact < 0){
            System.out.println("Contact " + contactName.getContactsName()+ " was not found");
            return false;
        }
        this.myContacts.remove(foundContact);
        System.out.println("Contact " + contactName.getContactsName() + " was removed");
        return true;
    }

    private int findContact(Contacts contact) {
        return myContacts.indexOf(contact);
    }
    private int findContact(String contactName) {
        for (int i = 0; i<this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getContactsName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }




}
