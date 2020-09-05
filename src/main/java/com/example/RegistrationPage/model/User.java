package com.example.RegistrationPage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private Long phonenumber;
	private String firstname;
	private String lastname;
	private String email;
	private String profession;
	private String married;

	public User() {
	}

	public User(long phonenumber, String firstname, String lastname, String email, String profession, String married) {
		super();
		this.phonenumber = phonenumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.profession = profession;
		this.married = married;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [phonenumber=" + phonenumber + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", profession=" + profession + ", married=" + married + "]";
	}

	

}
