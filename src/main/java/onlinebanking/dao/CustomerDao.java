package onlinebanking.dao;

import java.util.List;

import onlinebanking.customer.Customer;

public interface CustomerDao {
	public List<Customer> getCustomers();
	
	public Customer getCustomer(long id);
	
	public int deleteCustomer(long id);
	
	public int updateCustomer(Customer customer);
	
	public int createCustomer(Customer customer);
}

