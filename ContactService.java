package main;

import java.util.ArrayList;


public class ContactService {

	private ArrayList<Contact> contactList = new ArrayList<Contact>();

	
	public Boolean addContact(Contact contact) {
		Boolean didAdd = false;
		if (contactList.size()==0) {
			contactList.add(contact);
			didAdd = true;
		}
		else {
			for (Contact c:contactList) {
				if (contact.getContactId().equalsIgnoreCase(c.getContactId())) {
					return didAdd;
				}
			}
			contactList.add(contact);
			didAdd = true;
		}
		return didAdd;
	}
	
	public void removeContact(String contactId) {
		//remove any contact that has the given contactId.
		//contactList.removeIf(contact -> contact.getContactId() == contactId);
		for (int i = 0; i < contactList.size(); i ++) {
			if (contactList.get(i).getContactId().equals(contactId)) {
				contactList.remove(i);
			}
		}
		
	}
	//update first name of a contact by contactId.
	public void updateContactFirstName(String contactId, String firstName) {
		for(Contact contact: contactList) {
			if (contact.getContactId().equals(contactId)) {
				contact.setFirstName(firstName);
			}
		}
	}
	//update last name of a contact by contactId.
	public void updateContactLastName(String contactId, String lastName) {
		for(Contact contact: contactList) {
			if (contact.getContactId().equals(contactId)) {
				contact.setLastName(lastName);
			}
		}
	}
	//update phone number of a contact by contactId.
	public void updateContactPhoneNumber(String contactId, String phoneNumber) {
		for(Contact contact: contactList) {
			if (contact.getContactId().equals(contactId)) {
				contact.setPhoneNumber(phoneNumber);
			}
		}
	}
	//update address of a contact by contactId.
	public void updateContactAddress(String contactId, String address) {
		for(Contact contact: contactList) {
			if (contact.getContactId().equals(contactId)) {
				contact.setAddress(address);
			}
		}
	}
	
	public ArrayList<Contact> getContactList() {
		return contactList;
	}
	
	
}
