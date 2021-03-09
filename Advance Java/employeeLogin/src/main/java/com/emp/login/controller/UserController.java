package com.emp.login.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.security.core.userdetails.User;
import com.emp.login.entity.User;
import com.emp.login.repository.UserRespository;
import com.emp.login.common.UserConstant;

@RestController
@RequestMapping("/user")
public class UserController {	

	@Autowired
	private UserRespository repository;

	@Autowired
    private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/join")
	public String registerUser(@RequestBody User user) {
		user.setRoles(UserConstant.DEFAULT_ROLE);
		String encryptedPass=passwordEncoder.encode(user.getPassword());
		user.setPassword(encryptedPass);
		repository.save(user);
		return "Hello " + user.getUserName() + " you have successfully registered";

	}
	
	//If logged in as Admin -> ADMIN or Manager
	//If logged in as Manager ->  Manager
	
	@GetMapping("/access/{userId}/{userRole}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MANAGER')")
	public String giveAccessToUser(@PathVariable int userId,@PathVariable String userRole,Principal principal) {
		User user = repository.findById(userId).get();
		repository.findById(userId).get();
		List<String> activeRole=getRolesByLoggedInUser(principal);
		
		if (activeRole.contains(userRole)) {
			String newRole="";
			 newRole=user.getRoles()+","+userRole;
			user.setRoles(newRole);
		}
		repository.save(user);
		return "Hi "+user.getUserName()+" new role assign to you by "+principal.getName();
	}
	
	@GetMapping
    @Secured("ROLE_ADMIN")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<User> loadUsers() {
        return repository.findAll();
    }

    @GetMapping("/test")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String testUserAccess() {
        return "user can only access this !";
    }
	private List<String> getRolesByLoggedInUser(Principal principal){
		String roles=getLoggedInUser(principal).getRoles();
		List<String> assignRoles=Arrays.stream(roles.split(",")).collect(Collectors.toList());
		if (assignRoles.contains("ROLE_ADMIN")) {
			return Arrays.stream(UserConstant.ADMIN_ACCESS).collect(Collectors.toList());
		} 
		if (assignRoles.contains("ROLE_MANAGER")) {
			return Arrays.stream(UserConstant.MANAGER_ACCESS).collect(Collectors.toList());
		}return Collections.emptyList();
	}
	
	
	private User getLoggedInUser(Principal principal) {
	
		return repository.findByUserName(principal.getName()).get();
	}
	
}
