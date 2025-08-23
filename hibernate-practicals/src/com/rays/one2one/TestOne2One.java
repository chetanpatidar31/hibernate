package com.rays.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOne2One {
	
	public static void main(String[] args) {
		
		Address empAddress = new Address();
		
		empAddress.setId(1);
		empAddress.setStreet("street1");
		empAddress.setCity("Indore");
		
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("Aastik");
		emp.setEmpAddress(empAddress);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		
		tx.commit();
		
		session.close();
	}
}
