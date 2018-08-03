package onlinebanking.customer;

import onlinebanking.Account.Account;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		account = new Account(0, 0);
	}
	
	public Customer(long id, String firstName, String lastName, double checkingAmount, double savingAmount) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		account = new Account(checkingAmount, savingAmount);
	}
	
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Customer Id:- " + getId());
		str.append("\nFirst Name:- " + getFirstName());
		str.append("\nLast Name:- " + getLastName());
		str.append("\nChecking Account:- " + getAccount().getCheckingAmount());
		str.append("\nSaving Account:- " + getAccount().getSavingAmount());
		
		return str.toString();
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
