package com.ajinkya.rest.webservices.springbootrestfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "David", new Date()));
		users.add(new User(2, "Wayne", new Date()));
		users.add(new User(3, "Romelu", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public Optional<User> findOne(Integer id) {
		return users.stream().filter(user -> user.getId() == id).findFirst();
	}
	
	public User deleteById(Integer id) {
		Optional<User> user = findOne(id);
		if (user.isPresent()) {
			users.remove(user.get());
			return user.get();
		}
		return null;
	}
}
