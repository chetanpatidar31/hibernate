package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserDTO {
	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Nitin");
		dto.setLastName("Patidar");
		dto.setLoginId("nitin@gmail.com");
		dto.setPassword("Pass@123");
		dto.setDob(new Date());
		dto.setAddress("Neemach");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}
}
