package com.ajinkya.jpa.basics.springbootjpademo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajinkya.jpa.basics.springbootjpademo.entities.User;
import com.ajinkya.jpa.basics.springbootjpademo.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		log.info("New user is created: "+ userRepository.save(user));
		
		Optional<User> userWithId1 = userRepository.findById((long) 1);
		log.info("User is retrieved: "+userWithId1);
		
		List<User> usersList = userRepository.findAll();
		log.info("All Users: "+usersList);
	}

}
