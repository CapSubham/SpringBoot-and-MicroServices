package com.demo.sb.contacts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CONTACT_MASTER")
/*
 * @Getter
 * 
 * @Setter
 * 
 * @ToString
 */
@Data
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Override
	public String toString() {
		String formattedContact = String.format("%-3d | %-12s | %10s", contactId, contactName, contactNumber);
		return formattedContact;
	}
}
