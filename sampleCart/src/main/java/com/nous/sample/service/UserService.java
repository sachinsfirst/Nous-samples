package com.nous.sample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nous.sample.dao.UserRepository;
import com.nous.sample.model.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User("user1@gmail.com", "user1"));
		users.add(new User("user2@gmail.com", "user2"));
	}

	public void saveInitialBatch() {
		userRepository.saveAll(users);
	}

}
