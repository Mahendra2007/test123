package com.initech.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.initech.service.CustomerService;

/**
 * @author Mahendra
 *
 */
@Component
@RestController
public class CustomerController {

	@Autowired
	private Customer person;
			
	@Autowired
	private CustomerService custService;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping("/person/get")
	public Customer getPerson(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		person.setName(custService.getCustomerName());	
		person.setEmail(custService.getCustomerEmail());
		person.setPhone(custService.getCustomerPhone());
		return person;
	}	
}
