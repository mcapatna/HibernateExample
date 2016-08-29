package com.mcapatna.hibernate.model;

/**
 * 
 * @author Power House
 *
 */
public class CurrentStudent extends Student {
	private double feebal;
	private String timing;
	private String branch;

	public double getFeebal() {
		return feebal;
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
