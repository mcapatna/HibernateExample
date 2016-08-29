package com.mcapatna.hibernate.model;

/**
 * 
 * @author Power House
 *
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

}
