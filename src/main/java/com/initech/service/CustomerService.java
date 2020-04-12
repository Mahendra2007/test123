package com.initech.service;

import org.springframework.stereotype.Service;

/**
 * @author Mahendra
 *
 */
@Service
public class CustomerService {
   public String getCustomerName() {
      return "Mahen";
   } 
   public String getCustomerEmail() {	      
	      String strCustEmail="mahen@shiv.com";
	      strCustEmail= strCustEmail.replaceAll("(?<=.{1}).(?=[^@]+@)", "*");
	      return strCustEmail;
	   } 
   public String getCustomerPhone() {
	      String strCustPhone="111222111";
	      strCustPhone=strCustPhone.replaceAll("\\b(\\d{3})\\d+(\\d)", "$1*******$1");
	      return strCustPhone;
	   } 
}
