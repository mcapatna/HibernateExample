package com.mcapatna.hibernate.model;

/**
 * 
 * @author Power House
 *
 */
public class WeekdayStudent extends Student {
	private String qualification;
	private String percentage;
	private int yoe;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

}
