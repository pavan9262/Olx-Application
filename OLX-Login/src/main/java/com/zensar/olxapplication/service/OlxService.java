package com.zensar.olxapplication.service;

import java.util.List;

import com.zensar.olxapplication.entity.User;

public interface OlxService {

	List<User> getAllUsers(String username, String password);

	User registerUser(User user);

	boolean logoutUser(long id, String username, String password);

	String loginUser(User user);
}