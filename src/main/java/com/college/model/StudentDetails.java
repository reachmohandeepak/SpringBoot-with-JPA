package com.college.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "student_details")
@EntityListeners(AuditingEntityListener.class)
public class StudentDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;

	@Column(name = "student_name", nullable = false)
	private String studendName;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone_no", nullable = false)
	private Long phone;

	@OneToOne(cascade = CascadeType.ALL)
	private DepartmentDetails departmentDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private HostelDetails hostelId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private List<CourseDetails> courseId;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudendName() {
		return studendName;
	}

	public void setStudendName(String studendName) {
		this.studendName = studendName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public DepartmentDetails getDepartmentDetails() {
		return departmentDetails;
	}

	public void setDepartmentDetails(DepartmentDetails departmentDetails) {
		this.departmentDetails = departmentDetails;
	}

	public HostelDetails getHostelId() {
		return hostelId;
	}

	public void setHostelId(HostelDetails hostelId) {
		this.hostelId = hostelId;
	}

	public List<CourseDetails> getCourseId() {
		return courseId;
	}

	public void setCourseId(List<CourseDetails> courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studendName=" + studendName + ", address=" + address
				+ ", phone=" + phone + ", departmentDetails=" + departmentDetails + ", hostelId=" + hostelId
				+ ", courseId=" + courseId + "]";
	}

}
