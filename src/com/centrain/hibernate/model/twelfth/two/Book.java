package com.centrain.hibernate.model.twelfth.two;

import java.io.Serializable;
/**
 * ºÃ≥–”≥…‰ ∏∏¿‡ ¡∑œ∞
 */
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6767738250075450640L;
	
	private String id;
	private String author;
	private String title;
	private float price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
