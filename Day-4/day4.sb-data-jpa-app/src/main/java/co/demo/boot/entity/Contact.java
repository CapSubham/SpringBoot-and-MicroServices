package co.demo.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_MASTER")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	public Contact() {
	}

	public Contact(String contactName, String contactNumber) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	public Contact(Integer contactId, String contactName, String contactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		String formattedContact = String.format("%-3d | %-12s | %10s", contactId, contactName, contactNumber);
		return formattedContact;
	}

}
