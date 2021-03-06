package com.mcapatna.hibernate.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 15 Aug 2016
 */
public class Student {
	private int sid;
	private String qualification;
	private String[] courses;
	private List<String> emails;
	private List<Integer> marks;
	private Set<Long> phones;
	private Map<String, Long> refs;
	private String sname;
	private String dob;

	public Student() {
		super();
	}

	public Student(String qualification, String[] courses, List<String> emails, List<Integer> marks, Set<Long> phones,
			Map<String, Long> refs, String sname, String dob) {
		super();
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
		this.sname = sname;
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

}
