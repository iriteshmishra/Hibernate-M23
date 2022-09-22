package com.cg.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee e=new Employee();
		e.setName("Ritesh");
		e.setSalary(35000);
		em.persist(e);
		
		//create an employee2
		Employee e1=new Employee();
		e1.setName("Rohan");
		e1.setSalary(25000);
		em.persist(e1);
		
		
		//create a Manager
		Manager m=new Manager();
		m.setName("Vikas");
		m.setSalary(55000);
		m.setDeptname("Information Technology");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		factory.close();
		
	}

}
