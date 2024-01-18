package com.shivaraj.schoolboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivaraj.schoolboard.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	

}
