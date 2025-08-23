package com.rays.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneOneDelete {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Employee emp = (Employee) session.get(Employee.class, 1);

		session.delete(emp);

		tx.commit();

		session.close();

		sf.close();
	}
}
