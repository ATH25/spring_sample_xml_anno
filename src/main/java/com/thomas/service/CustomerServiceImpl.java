package com.thomas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomas.model.Customer;
import com.thomas.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl() {
		
	}

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are calling constructor injection::: CustomerServiceImpl.CustomerServiceImpl");
		this.customerRepository = customerRepository;
	}


	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are calling setter injection: CustomerServiceImpl.setCustomerRepository");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.thomas.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	


}
