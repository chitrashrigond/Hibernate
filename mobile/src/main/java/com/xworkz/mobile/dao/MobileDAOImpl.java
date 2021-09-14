package com.xworkz.mobile.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.camera.util.SFUtil;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileDAOImpl implements MobileDAO {
	// List<MobileEntity> list=new ArrayList<MobileEntity>();
	SessionFactory fact = SFUtil.getFactory();

	public int save(MobileEntity entity) {
		try (Session session = fact.openSession();) {
			Transaction txn = session.beginTransaction();
			int pk = (Integer) session.save(entity);
			txn.commit();
			return 0;
		}

	}

	@Override
	public void fetchAll() {
		try (Session session = fact.openSession()) {
			Query query = session.createQuery("from MobileEntity");
			List mob = query.list();
			System.out.println(mob);
		}

	}

	@Override
	public String fetchNameById() {
		try (Session session = fact.openSession()) {
			Query query = session.createQuery("select name from MobileEntity where id='1'");
			Object obj = query.uniqueResult();
			System.out.println(obj);
			if (obj != null) {
				String name = (String) obj;
				return name;
			}
		}
		return null;
	}

	@Override
	public int updatePriceById() {
		try (Session session = fact.openSession()) {
			Query query = session
					.createQuery("update MobileEntity mobile set mobile.price='45000' where mobile.id='4'");
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();

		}
		return 0;
	}

	@Override
	public int findPriceByName() {
		try (Session session = fact.openSession()) {
				Query query = session.getNamedQuery("GET_price_BY_name").setParameter("name", "Sony");
				List<MobileEntity> mobiles = query.getResultList();
				mobiles.stream().forEach(e -> System.out.println(e.getPrice()));
				
		}
		return 1;

	}
}
