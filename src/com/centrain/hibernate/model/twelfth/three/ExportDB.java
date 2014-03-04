package com.centrain.hibernate.model.twelfth.three;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


//自动检索并创建对应与实体 的类
public class ExportDB {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg3.xml") ;
		
		SchemaExport export = new SchemaExport(cfg) ;
		
		export.create(true, true) ;
	}
}
