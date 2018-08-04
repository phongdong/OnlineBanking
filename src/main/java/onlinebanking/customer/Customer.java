package onlinebanking.customer;

import onlinebanking.account.Account;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private List<Account> accounts;
	
	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new ArrayList<Account>();
	}
	
	public Customer(long id, String firstName, String lastName, List<Account> accounts) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new ArrayList<Account>();
	}
	
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Customer Id:- " + getId());
		str.append("\nFirst Name:- " + getFirstName());
		str.append("\nLast Name:- " + getLastName());
		str.append("\nAccounts:- " + getAccounts().toString());

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
