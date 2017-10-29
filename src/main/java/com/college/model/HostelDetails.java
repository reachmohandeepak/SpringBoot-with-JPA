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
@Table(name = "hostel_details")
@EntityListeners(AuditingEntityListener.class)
public class HostelDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roomNo;

	@Column(name = "hostel_name", nullable = false)
	private String hostelName;

	@OneToOne
	@PrimaryKeyJoinColumn
	private StudentDetails studentDetails;

	public Long getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(Long roomNo) {
		this.roomNo = roomNo;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	@Override
	public String toString() {
		return "HostelDetails [roomNo=" + roomNo + ", hostelName=" + hostelName + "]";
	}

}
