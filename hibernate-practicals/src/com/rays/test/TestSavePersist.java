package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestSavePersist {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setFirstName("Sanjana");
		dto.setLastName("Gangrade");
		dto.setLoginId("sanjana@gmail.com");
		dto.setPassword("Pass1234");
		dto.setDob(new Date());
		dto.setAddress("Khandwa");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		session.persist(dto);
		
		int i = (int) session.save(dto);

		System.out.println("i => " + i);

		tx.commit();

		session.close();

		sf.close();
	}
}
