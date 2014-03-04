package com.centrain.hibernate.model.twelfth.oneone;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class ExportDB {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg6.xml") ;
		
		SchemaExport export = new SchemaExport(cfg) ;
		
		export.create(true, true) ;
	}
}
