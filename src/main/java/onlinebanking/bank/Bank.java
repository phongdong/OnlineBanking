package onlinebanking.bank;

import java.util.ArrayList;
import java.util.List;

import onlinebanking.customer.Customer;

public class Bank {
	private List<Customer> customers = new ArrayList<Customer>();
	
	public void addNewCustomer(Customer c) {
		customers.add(c);
	}
	
	public Customer getCustomer(Long id) {
		for (int i = 0; i < this.customers.size(); i++) {
			if (this.customers.get(i).getId() == id)
				return this.customers.get(i);
		}
		return null;
	}
}
