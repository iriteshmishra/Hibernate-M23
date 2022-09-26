package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	//abstract method by default
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(int std_id);
	Student searchStudentByHallTicketNo(int hallTicketNo);
	boolean deleteStudent(int std_id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}