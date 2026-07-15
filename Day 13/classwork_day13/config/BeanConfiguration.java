package com.coforge.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Customer;
import com.coforge.model.DeliveryAddress;

@Configuration
public class BeanConfiguration {
	
	@Bean(name = "customer1")
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setCustomerid(101);
		customer.setCustomername("Pranay");
		customer.setEmails(Arrays.asList("pranay@gmail.com","pranay1@gmail.com"));
		customer.setDeliveryaddress(Arrays.asList(getDeliveryAddress(),getDeliveryAddress()));
		return customer;
	}
	@Bean(name = "deliveryAddress2")
	public DeliveryAddress getDeliveryAddress() {
		DeliveryAddress deliveryAddress1 = new DeliveryAddress();
		deliveryAddress1.setCity("Hyderabad");
		deliveryAddress1.setState("Telangana");
		return deliveryAddress1;
	}

}
