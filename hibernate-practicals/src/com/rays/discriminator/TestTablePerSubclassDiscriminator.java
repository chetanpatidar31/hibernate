package com.rays.discriminator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTablePerSubclassDiscriminator {

	public static void main(String[] args) {

		CreditCardPayment ccp = new CreditCardPayment();
		ccp.setAmount(5500);
		ccp.setPaymentType("debit card");
		ccp.setCcType("VISA");

		Cash c = new Cash();
		c.setAmount(14500);
		c.setPaymentType("cash");

		Cheque ch = new Cheque();
		ch.setAmount(9500);
		ch.setPaymentType("cheque");
		ch.setBankName("HDFC");
		ch.setChqNumber("HDFC145");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(ccp);
		session.save(c);
		session.save(ch);

		tx.commit();
		session.close();
		sf.close();
	}

}
