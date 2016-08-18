package com.mcapatna.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcapatna.hibernate.model.Student;
import com.mcapatna.hibernate.utils.HibernateUtil;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class AppLauncher {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student =new Student("AA", "Blore", "Acive", 12.2);
		session.save(student);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
