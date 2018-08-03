package onlinebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import onlinebanking.customer.Customer;
import onlinebanking.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Customer>> customers() {
		HttpHeaders headers = new HttpHeaders();
		List<Customer> customers = customerService.getCustomers();
		if (customers == null) {
			return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		}
		headers.add("Number Of Records Found", String.valueOf(customers.size()));
		
		return new ResponseEntity<List<Customer>>(customers, headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "customer/{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCustomers(@PathVariable("id") long id, @RequestParam() String str) {
		Customer customer = customerService.getCustomer(id);
		if (customer == null) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") long id) {
		HttpHeaders headers = new HttpHeaders();
		Customer customer = customerService.getCustomer(id);
		if (customer == null) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		customerService.deleteCustomer(id);
		headers.add("Customer Deleted - ", String.valueOf(id));
		return new ResponseEntity<Customer>(customer, headers, HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Customer> createCustomers(@RequestBody Customer customer) {
		HttpHeaders headers = new HttpHeaders();
		if (customer == null) {
			return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
		customerService.createCustomer(customer);
		headers.add("Customer Created", String.valueOf(customer.getId()));
		return new ResponseEntity<Customer>(customer, headers, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
		HttpHeaders headers = new HttpHeaders();
		Customer isExist = customerService.getCustomer(id);
		if (isExist == null) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		} else if (customer == null) {
			return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
		customerService.updateCustomer(customer);
		headers.add("Customer Updated - ", String.valueOf(id));
		return new ResponseEntity<Customer>(customer, headers, HttpStatus.OK);
	}
}









