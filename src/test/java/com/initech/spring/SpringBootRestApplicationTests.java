package com.initech.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.initech.service.CustomerService;
import com.initech.service.OrgService;

/**
 * @author Mahendra
 *
 */
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootRestApplicationTests {

	@Autowired
	private CustomerService custService;

	@Autowired
	private OrgService orgService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void whenCustomerRequested_thenRetrievedNameIsCorrect() {
		Mockito.when(custService.getCustomerName()).thenReturn("Mahen");
		String testName = orgService.getCustomerName();
		Assert.assertEquals("Mahen", testName);
	}
	@Test
	public void whenCustomerRequested_thenRetrievedEmailIsCorrect() {
		Mockito.when(custService.getCustomerEmail()).thenReturn("m***n@shiv.com");
		String testName = orgService.getCustomerName();
		Assert.assertEquals("m***n@shiv.com", testName);
	}

	@Test
	public void whenCustomerRequested_thenRetrievedPhoneIsCorrect() {
		Mockito.when(custService.getCustomerPhone()).thenReturn("111*******111");
		String testName = orgService.getCustomerName();
		Assert.assertEquals("111*******111", testName);
	}

}
