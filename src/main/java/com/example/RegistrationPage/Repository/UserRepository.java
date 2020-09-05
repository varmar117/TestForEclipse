package com.example.RegistrationPage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationPage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findBymarried(String married);

}
