package com.shivaraj.schoolboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class School {

	@Id
	private int schoolId;
	private String schoolName;
	private long contactNo;
	private String emailId;
	private String Address;
}
