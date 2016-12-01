package ChallengeArray;

/**
 * Created by angel alekhine on 11/29/2016.
 */
public class Contacts {

    private String contactsName;
    private int contactNumber;

    public Contacts(String contactsName, int contactNumber) {
        this.contactsName = contactsName;
        this.contactNumber = contactNumber;
    }

    public String getContactsName() {
        return contactsName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public static Contacts createContact(String name, int contactNumber){
        return new Contacts(name, contactNumber);
    }
}
