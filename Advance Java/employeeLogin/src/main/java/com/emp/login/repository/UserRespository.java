package com.emp.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emp.login.entity.User;

public interface UserRespository extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String username);
}
