package com.rays.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTablePerClass {

	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.setAmount(2000);
		ccp.setCcType("IMPS");
		ccp.setPaymentType("VISA");
		
		Cheque ch = new Cheque();
		ch.setAmount(6000);
		ch.setPaymentType("Deposit");
		ch.setBankName("BOI");
		ch.setChqNumber("BOI109");
		
		Cash c = new Cash();
		c.setAmount(8000);
		c.setPaymentType("Cash");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(ccp);
		session.save(ch);
		session.save(c);

		tx.commit();
		session.close();
		sf.close();
		
	}
}
