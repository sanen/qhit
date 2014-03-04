package com.centrain.hibernate.model.twelfth.four;

import java.io.Serializable;
/*
 * 实体映射之 一对一 单双向映射 
 */
public class People implements Serializable {

	/**
	 * 实体映射 一对一
	 */
	private static final long serialVersionUID = -7289388350332627691L;
	private long id;
	private String name;
	private Room room;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	

	

	
}
