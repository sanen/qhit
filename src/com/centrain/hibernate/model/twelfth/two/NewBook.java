package com.centrain.hibernate.model.twelfth.two;

import java.io.Serializable;
/*
 * ºÃ≥–”≥…‰ ◊”¿‡
 */
public class NewBook extends Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3710042317737936789L;
	private String borrowStatus;

	public String getBorrowStatus() {
		return borrowStatus;
	}

	public void setBorrowStatus(String borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	
	
}
