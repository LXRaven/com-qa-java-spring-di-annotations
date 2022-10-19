package com.qa.java.spring.di.annotations.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.java.spring.di.annotations.beans.Customer;
import com.qa.java.spring.di.annotations.beans.Order;
import com.qa.java.spring.di.annotations.config.BeanConfiguration;

public class Main {

	public static void main (String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[] {BeanConfiguration.class});
		
		Customer c1 = context.getBean("customerOne", Customer.class);
		
		System.out.println(c1);
		
		Customer c2 = context.getBean("customerTwo", Customer.class);
		
		System.out.println(c2);
		
		Order order3 = context.getBean("orderThree", Order.class);
		
		System.out.println(order3);
	}
}
