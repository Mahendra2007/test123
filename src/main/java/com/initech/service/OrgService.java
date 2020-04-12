package com.initech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mahendra
 *
 */
@Service
public class OrgService {
   @Autowired
   CustomerService customerService;

   public OrgService(CustomerService customerService) {
      this.customerService = customerService;
   }
   public String getCustomerName() {
      return customerService.getCustomerName();
   }
}