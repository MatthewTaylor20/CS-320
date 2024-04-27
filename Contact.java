package main;

public class Contact {
	//the contactId is not updatable due to the lack of a setter method
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	//constructor with contactId, firstName, lastName, phoneNumber, and address arguments
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address){
		//it is assumed that the responsibility of ensuring the uniqueness of the contactId lies with the ContactService class. 
		//contactId must not be null and must be no longer than 10 characters
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		//firstName must not be null and must be no longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		//lastName must not be null and must be no longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		//phoneNumber must not be null and must be 10 characters in length
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		//address must not be null and must be no longer than 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}
	
	//getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
}
