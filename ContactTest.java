package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("1", "Matthew", "Taylor", "1234567890", "my address");
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("Matthew"));
		assertTrue(contact.getLastName().equals("Taylor"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("my address"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Matthew", "Taylor", "1234567890", "my address");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "MatthewIsTheBest", "Taylor", "1234567890", "my address");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "TaylorIsTheBest", "1234567890", "my address");
		});
	}
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "Taylor", "12345678901", "my address");
		});
	}
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "Taylor", "123456789", "my address");
		});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "Taylor", "1234567890", "my address 01234567890123456789");
		});
	}
	
	@Test
	void testContactIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Matthew", "Taylor", "1234567890", "my address");
		});
	}
	
	@Test
	void testFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Taylor", "1234567890", "my address");
		});
	}
	
	@Test
	void testLastNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", null, "1234567890", "my address");
		});
	}
	@Test
	void testPhoneNumberNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "Taylor", null, "my address");
		});
	}
	@Test
	void testAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Matthew", "Taylor", "1234567890", null);
		});
	}

}
