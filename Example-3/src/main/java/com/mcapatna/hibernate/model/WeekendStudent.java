package com.mcapatna.hibernate.model;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class WeekendStudent extends CurrentStudent {
	private String wcompany;
	private String wcemail;
	private double wctc;

	public WeekendStudent(String wcompany, String wcemail, double wctc) {
		super();
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}

	public WeekendStudent() {
		super();
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
