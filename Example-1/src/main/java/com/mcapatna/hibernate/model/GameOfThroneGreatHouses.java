package com.mcapatna.hibernate.model;

/**
 * 
 * @author mcapatna,The Powerouse
 * @since 4 Aug 2016
 */
public class GameOfThroneGreatHouses {
	private int houseId;
	private String name;
	private String motto;
	private String commonSaying;
	private String region;
	private String generalMark;

	public GameOfThroneGreatHouses(String name, String motto, String commonSaying, String region, String generalMark) {
		super();
		this.name = name;
		this.motto = motto;
		this.commonSaying = commonSaying;
		this.region = region;
		this.generalMark = generalMark;
	}

	public GameOfThroneGreatHouses() {
		super();
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getCommonSaying() {
		return commonSaying;
	}

	public void setCommonSaying(String commonSaying) {
		this.commonSaying = commonSaying;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getGeneralMark() {
		return generalMark;
	}

	public void setGeneralMark(String generalMark) {
		this.generalMark = generalMark;
	}

}
