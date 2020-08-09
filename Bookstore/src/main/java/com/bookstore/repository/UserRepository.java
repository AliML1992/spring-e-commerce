package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);
}
