package com.mcapatna.hibernate.model;

/**
 * 
 * @author Power House
 *
 */
public class WeekendStudent extends Student {
	private String wcompany;
	private String wcemail;
	private double wctc;

	public WeekendStudent(String sname, String city, String status, double totalfee, String wcompany, String ecemail,
			double wctc) {
		super(sname, city, status, totalfee);
		this.wcompany = wcompany;
		this.wcemail = ecemail;
		this.wctc = wctc;
	}

	public String getWcompany() {
		return wcompany;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public String getWcemail() {
		return wcemail;
	}

	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}

	public double getWctc() {
		return wctc;
	}

	public void setWctc(double wctc) {
		this.wctc = wctc;
	}

}
