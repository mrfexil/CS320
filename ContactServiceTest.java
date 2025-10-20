package test;

import contact.Contact;
import contact.ContactService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    @AfterEach
    void tearDown() {
        if (service != null) {
            ContactService.clearContacts();
        }
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(1, service.getContactCount());
        assertNotNull(service.getContact("123"));
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.deleteContact("123");
        assertEquals(0, service.getContactCount());
        assertNull(service.getContact("123"));
    }

    @Test
    void testUpdateContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateContact("123", "Jane", "Smith", "0987654321", "456 Oak St");
        Contact updated = service.getContact("123");
        assertEquals("Jane", updated.getFirstName());
        assertEquals("Smith", updated.getLastName());
        assertEquals("0987654321", updated.getPhone());
        assertEquals("456 Oak St", updated.getAddress());
    }

    @Test
    void testGetContactCount() {
        assertEquals(0, service.getContactCount());
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(1, service.getContactCount());
    }

    @Test
    void testGetContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(contact, service.getContact("123"));
        assertNull(service.getContact("456"));
    }

    @Test
    void testClearContacts() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(1, service.getContactCount());
        ContactService.clearContacts();
        assertEquals(0, service.getContactCount());
    }
}