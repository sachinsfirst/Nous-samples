package com.nous.sample.dao;

import org.springframework.data.repository.CrudRepository;

import com.nous.sample.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
