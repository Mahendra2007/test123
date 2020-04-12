package com.initech.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.initech.service.CustomerService;

/**
 * @author Mahendra
 *
 */
@Profile("test")
@Configuration
public class CustServiceTestConfiguration {
   @Bean
   @Primary
   public CustomerService custService() {
      return Mockito.mock(CustomerService.class);
   }
}