package com.zensar.olxapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private int phone;
}
