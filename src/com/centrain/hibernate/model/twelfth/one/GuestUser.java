package com.centrain.hibernate.model.twelfth.one;

import java.io.Serializable;
/*
 * ºÃ≥–”≥…‰ ◊”¿‡
 */
public class GuestUser extends User implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -997161328788302256L;
	
	private String otherOfGuest;

	public String getOtherOfGuest() {
		return otherOfGuest;
	}

	public void setOtherOfGuest(String otherOfGuest) {
		this.otherOfGuest = otherOfGuest;
	}
	
	
}
