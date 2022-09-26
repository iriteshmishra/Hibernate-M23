package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface StudentService 
{

	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(int std_id);
	Student searchStudentByHallTicketNo(int hallTicketNo);
	boolean addCertificate(Certificate certificate);
	boolean updateCertificate(Certificate certificate);
	boolean deleteStudent(int std_id);
	

}
