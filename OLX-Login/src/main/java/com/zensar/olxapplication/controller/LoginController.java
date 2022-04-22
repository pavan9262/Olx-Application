package com.zensar.olxapplication.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.olxapplication.entity.User;
import com.zensar.olxapplication.service.OlxService;

@RestController
//@RequestMapping(value="/user", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class LoginController {
	@Autowired
	private OlxService olxService;

	// http://localhost:9090/user
// Getting all user details

	@GetMapping(value = "/user", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<User> getAllUsers(@RequestHeader("userName") String username,
			@RequestHeader("password") String password) {
		return olxService.getAllUsers(username, password);
	}

// http://localhost:9090/user
// Registers an user
	@PostMapping(value = "/user", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User registerUser = olxService.registerUser(user);
		if (registerUser == null) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	// http://localhost:9090/user/logout/id
// Deleting or logging out of specific user

	@DeleteMapping("user/logout/{userId}")
	public boolean logoutUser(@PathVariable("userId") long id, @RequestHeader("userName") String username,
			@RequestHeader("password") String password) {
		return olxService.logoutUser(id, username, password);
	}

// http://localhost:9090/user/authenticate
//Logins a user
	@PostMapping(value = "user/authenticate", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public String loginUser(@RequestBody User user) {
		return olxService.loginUser(user);
	}
}
