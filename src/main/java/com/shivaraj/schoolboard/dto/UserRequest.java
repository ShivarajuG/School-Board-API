package com.shivaraj.schoolboard.dto;

import com.shivaraj.schoolboard.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	
	private String userName;
	private String Email;
	private String password;
	private String firstName;
	private String lastname;
	private long contactNo;
	private UserRole userRole;

}
