package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.expression.spel.ast.OpOr;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user = new User(); user.setName("Ankita  Shinde");
		 * user.setCity("Bramhnawada"); user.setStatus("I am housewife"); User user1 =
		 * userRepository.save(user);
		 * 
		 * System.out.println(user1);
		 */

		/*
		 * // CREATE object of User11
		 * 
		 * User user11=new User(); user11.setName("Uttam"); user11.setCity("City1");
		 * user11.setStatus("Python Programmer"); userRepository.save(user11);
		 * System.out.println(user11);
		 * 
		 * 
		 * 
		 * // Create object of User2
		 * 
		 * 
		 * User user2 = new User(); user2.setName("Ankit"); user2.setCity("City2");
		 * user2.setStatus("Java Programmer"); userRepository.save(user2);
		 * System.out.println(user2);
		 * 
		 * 
		 * // saving single user // User resultUser = userRepository.save(user2);
		 * 
		 * List<User> users=List.of(user11, user2); // save multiple objects
		 * Iterable<User> result =userRepository.saveAll(users); result.forEach(user->{
		 * 
		 * System.out.println(user); }); System.out.println("done");
		 */
		/* ****************/

		/*
		 * // UPDATE the user of id 4
		 * 
		 * Optional<User>optional=userRepository.findById(4); User user=optional.get();
		 * user.setName("Prakhar Ranjan"); User result=userRepository.save(user);
		 * System.out.println(result);
		 */

		// How to RETRIEVE (get) the data?
		// findById(id) -return the optional Containing your data

		/*
		 * Iterable<User> itr =userRepository.findAll(); Iterator<User>
		 * iterator=itr.iterator();
		 * 
		 * while (iterator.hasNext()) { User user = iterator.next();
		 * System.out.println(user);
		 * 
		 * }
		 * 
		 * itr.forEach(user->{System.out.println(user);});
		 */

		// DELETE the user element
		//for single
		/*
		 * userRepository.deleteById(4); System.out.println("deleted"); //for Multiple
		 * records Iterable<User> allusers = userRepository.findAll();
		 * allusers.forEach(user->System.out.println(user));
		 * userRepository.deleteAll(allusers);
		 */
		//USING repository methods.
		
		/*
		 * List<User> users=userRepository.findByName("Ankit");
		 * users.forEach(e->System.out.println(e));
		 */
		
		/*
		 * List<User> users = userRepository.findByNameAndCity("Ankit", "City2");
		 * 
		 * users.forEach(e->System.out.println(e));
		 */
		
		//RETRIEVAL
	//Using written SQL query
		
		List<User> allUsers=userRepository.getAllUser();
		allUsers.forEach(e->{
			System.out.println(e);
		});
		System.out.println("______________________________________________");
		List<User> getUserByName=userRepository.getUserByName("Ankit");
		
		getUserByName.forEach(e->{
			System.out.println(e);
		});
		System.out.println("______________________________________");
		userRepository.getUsers().forEach(e->System.out.println(e));
		
		System.out.println("*******************************************");
		//Getting user by ID
		List<User> getUserByID=userRepository.getUserById(2);
		getUserByID.forEach(u->{
			System.out.println(u);
		});
	}

}
