package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Certificate;
import com.cg.entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDaoImpl();
	}
	
	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public boolean deleteStudent(int std_id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(std_id);
		dao.commitTransaction();
		return res;
	}

	@Override
	public Student searchStudentById(int std_id) {
		Student student=dao.searchStudentByHallTicketNo(std_id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicketNo(int hallTicketNo) {
		Student student=dao.searchStudentByHallTicketNo(hallTicketNo);
		return student;
	}

	@Override
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		boolean res1=((StudentServiceImpl) dao).addCertificate(certificate);
		dao.commitTransaction();
		return res1;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		boolean res2=((StudentServiceImpl) dao).updateCertificate(certificate);
		dao.commitTransaction();
		return res2;
	}

}