package com.centrain.hibernate.model.twelfth.one;

import java.io.Serializable;
/*
 * ºÃ≥–”≥…‰ ◊”¿‡
 */
public class PowerUser extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3788799869160603900L;
	private int level;
	private String otherOfPower;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getOtherOfPower() {
		return otherOfPower;
	}
	public void setOtherOfPower(String otherOfPower) {
		this.otherOfPower = otherOfPower;
	}
	
	
}
