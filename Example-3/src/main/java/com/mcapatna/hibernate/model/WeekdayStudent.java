package com.mcapatna.hibernate.model;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class WeekdayStudent extends CurrentStudent {
	private String qualification;
	private String percentage;
	private String yoe;
	public WeekdayStudent(String qualification, String percentage, String yoe) {
		super();
		this.qualification = qualification;
		this.percentage = percentage;
		this.yoe = yoe;
	}
	public WeekdayStudent() {
		super();
	}
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
	public String getYoe() {
		return yoe;
	}
	public void setYoe(String yoe) {
		this.yoe = yoe;
	}
	
}
