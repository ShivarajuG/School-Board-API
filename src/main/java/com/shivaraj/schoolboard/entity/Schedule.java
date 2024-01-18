package com.shivaraj.schoolboard.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Schedule {
	
	
	@Id
	private int scheduleId;
	private LocalTime opensAt;
	private LocalTime closesAt;
	private LocalTime classHoursPerDay;
	private LocalTime classHoursLength;
	private LocalTime breakTime;
	private LocalTime breakLength;
	private LocalTime lunchTime;
	private LocalTime lunchLength;
	
	

}
