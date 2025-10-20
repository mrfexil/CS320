package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private static Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact c = contacts.get(contactId);
        if (c != null) {
            c.setFirstName(firstName);
            c.setLastName(lastName);
            c.setPhone(phone);
            c.setAddress(address);
        }
    }

    public int getContactCount() {
        return contacts.size();
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }

    public static void clearContacts() {
        contacts.clear();
    }
}