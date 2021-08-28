package com.xworkz.Entity.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Entity.BirdEntity;

public class BirdDAOImpl implements BirdDAO{
	


	public int save(BirdEntity entity) {
		
			Configuration config=new Configuration();
			config.configure();
			config.addAnnotatedClass(BirdEntity.class);
			SessionFactory fact = config.buildSessionFactory();
			Session session = fact.openSession();
			Transaction txn = session.beginTransaction();
			int pk = (Integer) session.save(entity);
			txn.commit();
			System.out.println(pk);
			session.close();
			fact.close();
			return pk;
		
	}
	

	public BirdEntity readById(int pk) {
		Configuration config = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = config.buildSessionFactory();
		Session session = fact.openSession();
		BirdEntity be = session.get(BirdEntity.class, pk);
		return be;
	
}

}
