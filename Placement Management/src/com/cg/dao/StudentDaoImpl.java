package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class StudentDaoImpl implements StudentDao
{
	private EntityManager em;

	public StudentDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	
	@Override
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
		
	}

	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int std_id) {
		Student student=em.find(Student.class, std_id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicketNo(int hallTicketNo) {
		Student student=em.find(Student.class, hallTicketNo);
		return student;
	}
	
	@Override
	public boolean deleteStudent(int std_id) {
		em.remove(std_id);
		return false;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
