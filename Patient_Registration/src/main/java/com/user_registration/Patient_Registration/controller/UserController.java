package com.user_registration.Patient_Registration.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user_registration.Patient_Registration.model.user;
import com.user_registration.Patient_Registration.repository.UserRepository;


@Controller //Controllers handle incoming web requests and map them to methods in the class.
public class UserController {
	
	
	@Autowired  // This annotation is used for dependency injection. In this case,
	//it tells Spring to automatically inject an instance of the UserRepository class into the userRepository field. 
	//This allows the controller to interact with the user data stored in the database.
	UserRepository userRepository;
	
	@GetMapping("/registration")//Map the get request for /registration to the getRegPage method
	public String getRegPage(@ModelAttribute("user") user user) {
		return "register";
	}
	
	@PostMapping("/registration")
	//his annotation maps the HTTP POST request for the /registration URL to the saveUser method. 
	//This method is likely called when the user submits the registration form.
	public String saveUser(@ModelAttribute("user") user user, Model model) {
		userRepository.save(user);
		model.addAttribute("message", "Submitted Successfully");
		return "register";
	}
	
	@GetMapping("/users")
	public String usersPage(Model model) {
		List<user> listOfUsers = userRepository.findAll();
		model.addAttribute("user", listOfUsers);
		return "user";
	}
}