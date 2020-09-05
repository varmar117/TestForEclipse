package com.example.RegistrationPage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.RegistrationPage.RegistrationPageApplication;
import com.example.RegistrationPage.Repository.UserRepository;
import com.example.RegistrationPage.model.User;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(RegistrationPageApplication.class);
	@Autowired
	UserRepository repository;

	@RequestMapping(value = "/")
	public String homeController() {
		log.info("controller home page executed");
		log.info("checking the code");
		return "registration";
	}

	@PostMapping(value = "/register")
	public User saveUser(User user) {
		log.info("data inserted successfully");
		return repository.save(user);
	}
	
	@GetMapping(value="/getuser")
	public User retriveUser(Long phonenumber) {
		return repository.getOne(phonenumber);
	}

}
