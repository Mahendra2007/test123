package com.initech.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mahendra
 *
 */
@SpringBootApplication (scanBasePackages={"com.initech.service", "com.initech.spring", "com.initech.config"})
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
