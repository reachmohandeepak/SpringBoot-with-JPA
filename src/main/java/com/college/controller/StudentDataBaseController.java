package com.college.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.CourseDetails;
import com.college.model.StudentDetails;
import com.college.repository.StudentRepo;

@RestController
public class StudentDataBaseController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/saveNewStudentDetails")
    public StudentDetails createNote(@Valid @RequestBody StudentDetails studentDetails) {
		
		StudentDetails sd = new StudentDetails();
		sd.setStudentId(studentDetails.getStudentId());
		sd.setAddress(studentDetails.getAddress());
		sd.setPhone(studentDetails.getPhone());
		sd.setStudendName(studentDetails.getStudendName());
		sd.setHostelId(studentDetails.getHostelId());
		sd.setDepartmentDetails(studentDetails.getDepartmentDetails());
		List<CourseDetails> courseList = new ArrayList<>();
		for(CourseDetails getData : studentDetails.getCourseId()){
			CourseDetails cd = new CourseDetails();
			cd.setCourseName(getData.getCourseName());
			courseList.add(cd);
		}
		sd.setCourseId(courseList);
		
		/**
		 *  studentRepo.save(sd) will execute below sql commands.
		 */
		//insert into dept_details (dept_name) values (?)
		//insert into hostel_details (hostel_name) values (?)
		//insert into student_details (address, department_details_dept_id, hostel_id_room_id, phone_no, student_name) values (?, ?, ?, ?, ?)
		//insert into course_details (course_name) values (?)
		//insert into course_details (course_name) values (?)
		//insert into course_details (course_name) values (?)
		//insert into course_details (course_name) values (?)
		//update course_details set student_id=? where course_id=?
		//update course_details set student_id=? where course_id=?
		//update course_details set student_id=? where course_id=?
		//update course_details set student_id=? where course_id=?
		
        return studentRepo.save(sd);
    }
	@GetMapping("/getAllStudentDetails")
    public List<StudentDetails> getAllStudentDetails() {
		return studentRepo.findAll();
	}
}
