package com.zensar.olxapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxapplication.entity.User;

@Service
public class OlxServiceImpl implements OlxService {

	static List<User> users = new ArrayList<User>();
	static {
		users.add(new User(1L, "Anand", "kulakarni", "anand", "anand123", "anand@gamil.com", 12345));
	}

	@Override
	public List<User> getAllUsers(String username, String password) {
		if (username.equals("anand") && password.equals("anand123")) {
			return users;
		}

		return null;

	}

	@Override
	public User registerUser(User user) {
		users.add(user);
		return user;
	}

	@Override
	public boolean logoutUser(long id, String username, String password) {

		if (username.equals("anand") && password.equals("anand123")) {
			for (User user : users) {
				if (user.getId() == id) {
					users.remove(user);

					return true;
				}

			}

		}
		return false;
	}

	@Override
	public String loginUser(User user) {

		return user.getUserName() + "\n" + user.getPassword();
	}

}