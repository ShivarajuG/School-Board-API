package com.shivaraj.schoolboard.util;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResponseStructure<T> {
	
	
	private int status;
	private String message;
	private T data;
	

}
