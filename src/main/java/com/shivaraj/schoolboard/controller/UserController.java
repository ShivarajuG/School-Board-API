package com.shivaraj.schoolboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivaraj.schoolboard.dto.UserRequest;
import com.shivaraj.schoolboard.dto.UserResponse;
import com.shivaraj.schoolboard.service.userService;
import com.shivaraj.schoolboard.util.ResponseStructure;

import jakarta.validation.Valid;


@RequestMapping("/users")
@RestController
public class UserController {
	@Autowired
	private userService userService; 
	@PostMapping
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(@RequestBody @Valid UserRequest userRequest){
		
		return userService.saveUser(userRequest);
	}
	
	
	
	
	
}
