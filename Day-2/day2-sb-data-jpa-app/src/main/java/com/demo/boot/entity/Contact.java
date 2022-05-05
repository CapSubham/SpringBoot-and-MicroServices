package com.demo.boot.entity;

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
	private String conatactNumber;

	public Contact() {
	}

	public Contact(Integer contactId, String contactName, String conatactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.conatactNumber = conatactNumber;
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

	public String getConatactNumber() {
		return conatactNumber;
	}

	public void setConatactNumber(String conatactNumber) {
		this.conatactNumber = conatactNumber;
	}

	@Override
	public String toString() {
		String formattedContact = String.format("%3d | %-10s | %10s", contactId, contactName, conatactNumber);
		return formattedContact;
	}

}
