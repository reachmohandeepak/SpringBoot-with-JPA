package com.college.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "dept_details")
@EntityListeners(AuditingEntityListener.class)
public class DepartmentDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "dept_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptId;

	@Column(name = "dept_name", nullable = false)
	private String deptName;

	@OneToOne
	@PrimaryKeyJoinColumn
	private StudentDetails studentDetails;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentDetails [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
