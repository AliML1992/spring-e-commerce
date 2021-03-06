package com.bookstore.domain.security;

import com.bookstore.domain.User;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Role {

	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;


	public Role() {
	}

	public Role(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
