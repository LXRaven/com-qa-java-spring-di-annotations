package com.qa.java.spring.di.annotations.beans;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
	private int id;
	private int customerId;
	private double orderValue;
	private String orderDate;

	public void init() {
		System.out.println("Initializing Order");
	}
	
	public void destroy() {
		System.out.println("Destroying Order");
	}
	

}
