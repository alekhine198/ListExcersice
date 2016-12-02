package ChallengeArray;

import java.util.ArrayList;


public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
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

    public Contacts queryContact(String contact){
        int position = findContact(contact);
        if (position >= 0){
            return this.myContacts.get(position);

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


    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " +
                                this.myContacts.get(i).getContactsName() + "->" +
                                this.myContacts.get(i).getContactNumber());
        }
    }
}
