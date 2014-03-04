package com.centrain.hibernate.center.thirteenth.lock;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class ExportDB {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg13.xml") ;
		
		SchemaExport export = new SchemaExport(cfg) ;
		
		export.create(true, true) ;
	}
}
