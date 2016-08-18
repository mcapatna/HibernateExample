package com.mcapatna.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcapatna.hibernate.util.HibernateUtil;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 4 Aug 2016
 */
public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		SessionFactory factory =null;
		Session session=null;
		try {
			factory= HibernateUtil.getSessionFactory();
			session= factory.openSession();
			transaction = session.beginTransaction();
			GameOfThroneGreatHouses houses = new GameOfThroneGreatHouses("stark", "winter is coming", "NA", "North",
					"Black hair and grey eyes");
			session.save(houses);
			transaction.commit();
			
			System.out.println("--Record is inserted--");
		} catch (Exception e) {
			if(transaction!=null)
				transaction.rollback();
			e.printStackTrace();
		}
		finally {
			if(session!=null)
			session.close();
			if(factory!=null)
			factory.close();
		}
	}
}
