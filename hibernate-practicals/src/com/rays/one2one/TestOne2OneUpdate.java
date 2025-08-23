package com.rays.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOne2OneUpdate {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = (Employee) session.get(Employee.class, 1);

		if (emp != null) {
			emp.setName("Amit");

			Address empAddress = emp.getEmpAddress();
			empAddress.setStreet("street2");
			empAddress.setCity("Indore");
		} else {
			System.out.println("Employee not found!");
		}

		tx.commit();
		session.close();
		sf.close();

	}
}
