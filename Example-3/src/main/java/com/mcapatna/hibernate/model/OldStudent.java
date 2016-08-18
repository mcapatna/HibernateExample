package com.mcapatna.hibernate.model;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class OldStudent extends Student {
	private String ocompany;
	private String ocemail;
	private double octc;

	public String getOcompany() {
		return ocompany;
	}

	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}

	public String getOcemail() {
		return ocemail;
	}

	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}

	public double getOctc() {
		return octc;
	}

	public void setOctc(double octc) {
		this.octc = octc;
	}

	public OldStudent(String ocompany, String ocemail, double octc) {
		super();
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}

	public OldStudent() {
		super();
	}

}
