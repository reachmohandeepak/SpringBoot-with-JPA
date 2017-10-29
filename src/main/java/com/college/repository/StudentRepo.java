package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.model.StudentDetails;

public interface StudentRepo extends JpaRepository<StudentDetails, Long>{
	
}
