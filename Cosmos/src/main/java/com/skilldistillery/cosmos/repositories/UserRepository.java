package com.skilldistillery.cosmos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.cosmos.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String keyword);
}