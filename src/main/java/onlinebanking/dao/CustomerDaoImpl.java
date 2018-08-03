package onlinebanking.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import onlinebanking.customer.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	private JdbcTemplate jdbcTemplate;

	public List<Customer> getCustomers() {
		List<Customer> customers = null;
		try {
			customers = jdbcTemplate.query("SELECT * FROM Customer", 
					new BeanPropertyRowMapper<Customer>(Customer.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return customers;
	}

	public Customer getCustomer(long id) {
		Customer customer = null;
		try {
			customer = jdbcTemplate.queryForObject("SELECT * FROM Customer WHERE id = ?",  
					new Object[] {id}, new BeanPropertyRowMapper<Customer>(Customer.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return customer;
	}

	public int deleteCustomer(long id) {
		int count = jdbcTemplate.update("DELETE FROM Customer WHERE id = ?", new Object[] {id});
		return count;
	}

	public int updateCustomer(Customer customer) {
		int count = jdbcTemplate.update(
				"UPDATE Customer set firstName = ? , lastName = ? , where id = ?", new Object[] 
						{customer.getFirstName(), customer.getLastName(), customer.getId()});
		return count;
	}

	public int createCustomer(Customer customer) {
		int count = jdbcTemplate.update("INSERT INTO Customer(id,firstName,lastName) VALUES(?,?,?)", new Object[] 
				{customer.getId(), customer.getFirstName(), customer.getLastName()});
		return count;
	}

}
