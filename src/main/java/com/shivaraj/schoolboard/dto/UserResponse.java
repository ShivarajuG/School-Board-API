package com.shivaraj.schoolboard.dto;

import com.shivaraj.schoolboard.enums.UserRole;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
	
	
	private int userId;
	private String userName;
	private String Email;
	private String firstName;
	private String lastname;
	private long contactNo;
	private UserRole userRole;

}
