package com.shivaraj.schoolboard.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.shivaraj.schoolboard.dto.UserRequest;
import com.shivaraj.schoolboard.dto.UserResponse;
import com.shivaraj.schoolboard.entity.User;
import com.shivaraj.schoolboard.repository.UserRepository;
import com.shivaraj.schoolboard.service.userService;
import com.shivaraj.schoolboard.util.ResponseStructure;


@Service
public class UserServiceimpl implements userService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(UserRequest userRequest) {
		User user = userRepository.save(mapToUser(userRequest));
		ResponseStructure<UserResponse> responseStructure  = new ResponseStructure<UserResponse>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("User Saves successfully");
		responseStructure.setData(mapToUserResponse(user));
		return new ResponseEntity<ResponseStructure<UserResponse>> (responseStructure, HttpStatus.CREATED);
	} 
	

	private User mapToUser(UserRequest userRequest) {
		return User.builder()
				.userName(userRequest.getUserName())
				.password(userRequest.getPassword())
				.lastName(userRequest.getLastname())
				.email(userRequest.getEmail())
				.contact(userRequest.getContactNo())
				.firstname(userRequest.getFirstName())
				.userRole(userRequest.getUserRole())
				.build();
	}
	
	private UserResponse mapToUserResponse(User user) {
		return UserResponse.builder()
				.userId(user.getUserId())
				.userName(user.getUserName())
				.Email(user.getEmail())
				.firstName(user.getFirstname())
				.lastname(user.getLastName())
				.contactNo(user.getContact())
				.userRole(user.getUserRole())
				.build();
	}


	
	
}
