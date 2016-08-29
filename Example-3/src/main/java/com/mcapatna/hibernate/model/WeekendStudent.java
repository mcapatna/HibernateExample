package com.mcapatna.hibernate.model;

/**
 * 
 * @author Power House
 *
 */
public class WeekendStudent extends Student {
	private String wcompany;
	private String ecemail;
	private double wctc;

	public String getWcompany() {
		return wcompany;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public String getEcemail() {
		return ecemail;
	}

	public void setEcemail(String ecemail) {
		this.ecemail = ecemail;
	}

	public double getWctc() {
		return wctc;
	}

	public void setWctc(double wctc) {
		this.wctc = wctc;
	}

}
