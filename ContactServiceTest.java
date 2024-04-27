package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {
	
	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0", "Matthew", "Taylor", "0123456789", "my address");
		contactService.addContact(contact);
		ArrayList<Contact> contactList = contactService.getContactList();
		assertEquals("Matthew", contactList.get(contactList.size() - 1).getFirstName());
		assertEquals("Taylor", contactList.get(contactList.size() - 1).getLastName());
		assertEquals("0123456789", contactList.get(contactList.size() - 1).getPhoneNumber());
		assertEquals("my address", contactList.get(contactList.size() - 1).getAddress());
		
	}
	
	@Test
	void testRemoveContact() {
		ContactService contactService = new ContactService();
		Contact contact0 = new Contact("0", "Matthew0", "Taylor", "0123456789", "my address");
		Contact contact1 = new Contact("1", "Matthew1", "Taylor", "0123456789", "my address");
		Contact contact2 = new Contact("2", "Matthew2", "Taylor", "0123456789", "my address");

		contactService.addContact(contact0);
		contactService.addContact(contact1);
		contactService.addContact(contact2);
		String contactId = "1";
		contactService.removeContact(contactId);
		assertNull(contactService.getContactList().stream().filter(contact -> contactId.equals(contact.getContactId())).findFirst().orElse(null));
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0", "Matthew0", "Taylor", "0123456789", "my address");
		contactService.addContact(contact);
		contactService.updateContactFirstName("0", "UMatthew");
		assertEquals("UMatthew", contactService.getContactList().get(0).getFirstName());
	}

	@Test
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0", "Matthew0", "Taylor", "0123456789", "my address");
		contactService.addContact(contact);
		contactService.updateContactLastName("0", "UTaylor");
		assertEquals("UTaylor", contactService.getContactList().get(0).getLastName());
	}
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0", "Matthew0", "Taylor", "0123456789", "my address");
		contactService.addContact(contact);
		contactService.updateContactPhoneNumber("0", "1123456789");
		assertEquals("1123456789", contactService.getContactList().get(0).getPhoneNumber());
	}
	@Test
	void testUpdateAddress() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0", "Matthew0", "Taylor", "0123456789", "my address");
		contactService.addContact(contact);
		contactService.updateContactAddress("0", "Uaddress");
		assertEquals("Uaddress", contactService.getContactList().get(0).getAddress());
	}
}
