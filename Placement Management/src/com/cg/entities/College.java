package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College 
{
	
	@Id
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_id")
	private User collegeAdmin;
	private String collegeName;
	private String location;
	
	//getters and setters method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}		

}
