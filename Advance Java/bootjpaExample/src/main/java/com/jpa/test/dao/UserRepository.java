package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	@Query("select u From User u")
	public List<User> getAllUser();

	@Query("select u From User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);

	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUsers();
}
