package com.xworkz.Entity.dao;

import javax.persistence.Entity;

import org.dom4j.bean.BeanAttribute;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Entity.BirdEntity;
import com.xworkz.Entity.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {



	public int save(BirdEntity entity) {

		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction txn = session.beginTransaction();
		int pk = (Integer) session.save(entity);
		txn.commit();
		System.out.println(pk);
		session.close();
		// fact.close();
		return pk;

	}

	public BirdEntity readById(int pk) {

		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		BirdEntity be = session.get(BirdEntity.class, pk);
		return be;

	}

	public void deleteById(int id) {

		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction txn = session.beginTransaction();
		BirdEntity b = session.load(BirdEntity.class, id);
		session.delete(b);
		txn.commit();
		System.out.println("************" + b);
		session.close();
		// fact.close();
	}

	public void updateNameById(int id, String name) {
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();

		Transaction txn = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		bird.setName(name);
		session.update(bird);
		System.out.println(bird);
		txn.commit();
		session.close();
		
		// System.out.println("************"+b);
		session.close();
	}

}
