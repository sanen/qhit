package com.centrain.hibernate.center.thirteenth.cache.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class DBExport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg132.xml") ;
		SchemaExport export = new SchemaExport(config) ;
		export.create(true, true) ;
	}

}
