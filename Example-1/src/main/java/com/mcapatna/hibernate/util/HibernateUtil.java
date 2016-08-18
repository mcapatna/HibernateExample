package com.mcapatna.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 4 Aug 2016
 */
public class HibernateUtil {
	static SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
			sessionFactory = configuration.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
