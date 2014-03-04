package com.centrain.hibernate.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


//自动生成表
public class ExportDB {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure() ;
		 
		SchemaExport export = new SchemaExport(cfg) ;
		
		export.create(true, true) ;
	}  
	
//	public static void test(){
//		
//		Configuration cfgConfiguration=new Configuration().configure();
//		SchemaExport export=new SchemaExport(cfgConfiguration);
//		export.create(true, true);
//		
//	}
}
