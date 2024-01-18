package com.shivaraj.schoolboard.service;

import org.springframework.http.ResponseEntity;

import com.shivaraj.schoolboard.dto.UserRequest;
import com.shivaraj.schoolboard.dto.UserResponse;
import com.shivaraj.schoolboard.util.ResponseStructure;



public interface userService {

	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(UserRequest userRequest) ;
		


}
