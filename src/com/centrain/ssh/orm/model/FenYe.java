package com.centrain.ssh.orm.model;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class FenYe implements Serializable {

	private int pageid;
	private int pagesize;
	@SuppressWarnings("unchecked")
	private List<?> list=new ArrayList();
	 
	public int getPageid() {
		return pageid;
	}
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public java.util.List<?> getList() {
		return list;
	} 
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
