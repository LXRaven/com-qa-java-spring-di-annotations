package com.qa.java.spring.di.annotations.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.java.spring.di.annotations.beans.Customer;
import com.qa.java.spring.di.annotations.beans.Order;


	@Configuration
	
	@ComponentScan(basePackages = "com.qa.spring.di.annotations")
	public class BeanConfiguration {
	
		
		//orders
		
		@Bean(name="orderOne", initMethod="init", destroyMethod="destroy")
		@Scope("prototype")
		@Lazy
		public Order getOrderOne() {
			new Order();
			return Order.builder().id(1).customerId(123).orderValue(243.34).orderDate("03/12/2022").build();
		}
		
		@Bean(name="orderTwo", initMethod="init", destroyMethod="destroy")
		@Scope("prototype")
		@Lazy
		public Order getOrderTwo() {
			new Order();
			return Order.builder().id(2).customerId(234).orderValue(233.34).orderDate("05/07/2022").build();
		}
		
		@Bean(name="orderThree", initMethod="init", destroyMethod="destroy")
		@Scope("prototype")
		@Lazy
		public Order getOrderThree() {
			new Order();
			return Order.builder().id(3).customerId(234).orderValue(456.34).orderDate("07/05/2022").build();
		}
		
		@Bean(name="orderFour", initMethod="init", destroyMethod="destroy")
		@Scope("prototype")
		@Lazy
		public Order getOrderFour() {
			new Order();
			return Order.builder().id(4).customerId(123).orderValue(123.34).orderDate("05/07/2022").build();
		}
		
		
		//customers
		
		@Bean(name="customerOne",initMethod="init", destroyMethod="destroy")
		@Scope("singleton")
		@Lazy
		public Customer getCustomerOne() {
			return new Customer(123, "Customer One", "customer.one@mail.com", "0755849963", Arrays.asList(getOrderOne(), getOrderFour()));
		}
		
		@Bean(name="customerTwo",initMethod="init", destroyMethod="destroy")
		@Scope("singleton")
		@Lazy
		public Customer getCustomerTwo() {
			return new Customer(123, "Customer Two", "customer.two@mail.com", "0754689763", Arrays.asList(getOrderTwo(),getOrderThree()));
		}
}
