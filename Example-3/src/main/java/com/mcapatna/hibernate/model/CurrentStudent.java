package com.mcapatna.hibernate.model;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 16 Aug 2016
 */
public class CurrentStudent extends Student {

	private double feebal;
	private String timing;
	private String branch;

	public double getFeebal() {
		return feebal;
	}

	public CurrentStudent() {
		super();
	}

	public CurrentStudent(double feebal, String timing, String branch) {
		super();
		this.feebal = feebal;
		this.timing = timing;
		this.branch = branch;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
