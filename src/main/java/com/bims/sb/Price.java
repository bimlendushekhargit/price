package com.bims.sb;

public class Price {

	private String remark;
	private int cost;

	public Price(String remark, int cost) {
		super();
		this.remark = remark;
		this.cost = cost;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
