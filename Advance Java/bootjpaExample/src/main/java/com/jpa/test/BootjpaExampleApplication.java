package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import com.jpa.test.entities.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootjpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(BootjpaExampleApplication.class, args);

		UserRepository userRepository = (UserRepository) con.getBean(UserRepository.class);

		// User user = new User();

//		user.setName("Aditya");
//		user.setCity("Nagpur");
//		user.setStatus("Developer");
//		
//		User user1 = userRepository.save(user);

		// System.out.println(user1);

//		User u1 = new User();
//
//		u1.setName("Shende");
//		u1.setCity("NG");
//		u1.setStatus("Developer");
//
//		User u2 = new User();
//
//		u2.setName("As");
//		u2.setCity("NP");
//		u2.setStatus("Developer");
//		
//		User resultUser=userRepository.save(u2);
//
//		System.out.println(resultUser);

//		Optional<User> r=userRepository.findById(4);
//		
//		User user=r.get();
//		
//		user.setName("Ram");
//		
//		userRepository.save(user);
//		
//		System.out.println(user);

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> itrr=itr.iterator();
//		
//		while(itrr.hasNext()) {
//			User user = itrr.next();
//			System.out.println(user);

//		itr.forEach(new Consumer<User>() {
//			
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});
//
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

//		userRepository.deleteById(4);
//		System.out.println("Deleted!!!");

//		List<User> user=userRepository.findByName("Shende");
//		System.out.println(user);

		List<User> allUser = userRepository.getAllUser();

		allUser.forEach(e -> {
			System.out.println(e);
		});

		List<User> allUser1 = userRepository.getUserByName("As");

		allUser1.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("---------------------");

		userRepository.getUsers().forEach(e -> System.out.println(e));

	}
}
