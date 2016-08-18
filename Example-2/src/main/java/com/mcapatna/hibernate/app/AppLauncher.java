package com.mcapatna.hibernate.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcapatna.hibernate.model.Student;
import com.mcapatna.hibernate.util.HibernateUtil;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 15 Aug 2016
 */
public class AppLauncher {
	public static void main(String[] args) {
		try {

			SessionFactory sessionFactory = HibernateUtil.getFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			String qualification = "BE";
			String[] courses = { "Java", "Struts", "EJB", "Hibernate", "web-services", "JSF" };
			List<String> emails = new ArrayList<>();
			emails.add("admin@mcapatna.com");
			emails.add("powerhouse@mcapatna.com");
			List<Integer> marks = new ArrayList<>();
			marks.add(12);
			marks.add(13);
			marks.add(14);
			Set<Long> phones = new HashSet<>();
			phones.add(13456L);
			phones.add(56789L);
			Map<String, Long> refs = new HashMap<>();
			refs.put("test", 90L);
			refs.put("demo", 99L);
			String sname = "mcaptna";
			String dob = "12-Apr-1990";
			Student student = new Student(qualification, courses, emails, marks, phones, refs, sname, dob);
			session.save(student);
			transaction.commit();

			session.close();
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
