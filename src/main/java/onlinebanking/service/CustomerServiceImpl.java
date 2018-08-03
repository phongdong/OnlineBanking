package onlinebanking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import onlinebanking.customer.Customer;
import onlinebanking.dao.CustomerDao;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao;
	
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDao.getCustomers();
		return customers;
	}

	public Customer getCustomer(long id) {
		Customer customer = customerDao.getCustomer(id);
		return customer;
	}

	public int deleteCustomer(long id) {
		return customerDao.deleteCustomer(id);
	}

	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	public int createCustomer(Customer customer) {
		return customerDao.createCustomer(customer);
	}
	
}
