package net.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.java.remotedevice.Device;

@Entity
@Table(name = "Employee")
public class Employee implements Device {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "birth_year")
	private int birthYear;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_number")
	private long phoneNumber;

	@Column(name = "social_security")
	private long socialSecurity;

	@Column(name = "account_number")
	private long accountNumber;

	public Employee() {
		super();
	}

	public Employee(long id, String firstName, String lastName, int birthYear, String emailId, long phoneNumber,
			long socialSecurity, long accountNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.socialSecurity = socialSecurity;
		this.accountNumber = accountNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(long socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void create() {
//		Employee employee = new Employee(id, firstName, lastName, birthYear, emailId, phoneNumber, socialSecurity,
//				accountNumber);

		System.out.println("Employee Created!");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

		System.out.println("Employee read!");
	}

	@Override
	public void readAll() {
		// TODO Auto-generated method stub

		System.out.println("All employees read!");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("Employee updated!");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

		System.out.println("Employee deleted!");
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

		System.out.println("All employees deleted!");
	}

}
