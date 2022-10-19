package com.qa.java.spring.di.annotations.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Component
@Lazy
@Scope("singleton")
public class Customer {
	private int id;
	private String name;
	private String email;
	private String contactNo;
	
	private List<Order> ordersList;
	
	public void init() {
		System.out.println("Initializing Customer");
	}
	
	public void destroy() {
		System.out.println("Destroying Customer");
	}
	
}
