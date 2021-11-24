package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.Address;
import com.example.demo.controller.Users;

@SpringBootApplication
public class SBrestweb2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SBrestweb2Application.class, args);
	     Users obj=context.getBean(Users.class);
	     obj.setUserid(121);
	     obj.setUsername("Kishore");
	     Address ob=context.getBean(Address.class);
	     ob.setHno(21);
	     ob.setCity("Erode");
	     ob.setColony("Anna Nagar");
	     obj.displayInfo();
	     
	}

}
