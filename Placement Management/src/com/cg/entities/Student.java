package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	
	@Id
	private int std_id;
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="college_id")
	private College college;
	
	private int roll;
	private String qualification;
	private String course;
	private int year;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cert_id")
	private Certificate certificate;
	private int hallTicketNo;

	//setters and getters method for all the values which are private
	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}
