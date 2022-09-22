package com.cg.singleinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee
{
	private static final long serialVersionUID = 1L;
	private String deptname;
	
	//getter and setter method
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}