package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.CertificateService;
import com.cg.service.CertificateServiceImpl;
import com.cg.service.CollegeService;
import com.cg.service.CollegeServiceImpl;
import com.cg.service.PlacementService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;
import com.cg.service.UserService;
import com.cg.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		
		student.setStd_id(11);
		student.setName("Ritesh");
		student.setRoll(666);
		student.setQualification("BSC");
		student.setCourse("CS");
		student.setYear(2022);
		student.setHallTicketNo(66666);

		Certificate certificate=new Certificate();
		CertificateService s=new CertificateServiceImpl();
		certificate.setCert_id(6666);
		certificate.setYear(2022);
		
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		
		College c=new College();
		CollegeService cs=new CollegeServiceImpl();
		c.setId(12);
		c.setCollegeName("TNS");
		c.setLocation("Mumbai");
		
		
		Placement p=new Placement();
		PlacementService ps=new PlacementServiceImpl();
		p.setId(121);
		p.setName("Vishal");
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BSC");
		p.setYear(2022);
		
		User u=new User();
		UserService us=new UserServiceImpl();
		u.setId(666);
		u.setName("Rohan");
		u.setType("CS");
		u.setPassword("Rohan@123");
		
		Admin a=new Admin();
		a.setId(666);
		a.setName("Rohan");
		a.setPassword("Rohan@123");
		
		
			
		
		//adding a data
		service.addStudent(student);
		s.addCertificate(certificate);
		ps.addPlacement(p);
		cs.addCollege(c);
		us.addNewUser(u);
		
		
		System.out.println("Data is updated");
		
		//Retrieving a data
		service.searchStudentById(11);
		System.out.println("Id is:- "+student.getStd_id());
		System.out.println("Course is:- "+student.getCourse());
		System.out.println("Name is:- "+student.getName());
		System.out.println("Qualification is:- "+student.getQualification());
		System.out.println("Hall Ticket No is:- "+student.getHallTicketNo());
		System.out.println("Passout Year is:- "+student.getYear());
		
	}

}
