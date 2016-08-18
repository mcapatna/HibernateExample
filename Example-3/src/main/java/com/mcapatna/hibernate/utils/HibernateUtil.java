package com.mcapatna.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class HibernateUtil {
	static SessionFactory factory;
	static {
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure();
			factory = configuration.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getFactory() {
		return factory;
	}

}
