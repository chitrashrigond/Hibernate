package com.xworkz.Entity.util;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
private static SessionFactory factory;
public static SessionFactory getFactory(){
	if(factory!=null && factory.isClosed()){
		throw new IllegalStateException("Closed Session Factory");
				
	}
	return factory;
}
static{
	
	try{
		System.out.println("SF Started");
		Configuration cn=new Configuration().configure();
		factory=cn.buildSessionFactory();
		System.out.println("SF Complete");
	}
		catch (HibernateException e) {
System.out.println("Error in static block");
e.printStackTrace();
		}

}
}
