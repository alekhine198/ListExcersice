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

    public void addContact(){
        myContacts.add()
    }


}
