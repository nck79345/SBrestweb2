package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Users {

		private int userid;
		private String username;
		@Autowired
		private Address Address;
		
		public Address getAddress() {
			return Address;
		}
		public void setAddress(Address address) {
			Address = address;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
	   }
	    public void displayInfo()
	    {
	    	System.out.println("userid :"+userid);
		     System.out.println("username :"+username);
		     System.out.println(Address.toString());
	    }

}




