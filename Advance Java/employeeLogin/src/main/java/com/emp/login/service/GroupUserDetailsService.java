package com.emp.login.service;

import java.util.Optional;

import com.emp.login.entity.User;
import com.emp.login.repository.UserRespository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

@Service
public class GroupUserDetailsService implements  UserDetailsService{

	@Autowired
	private UserRespository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=repository.findByUserName(username);
		
		return user.map(GroupUserDetails::new).orElseThrow(()->new UsernameNotFoundException(username+"Doesn't Exist"));
	}
}
