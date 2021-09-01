package com.xworkz.camera.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.util.SFUtil;

import com.xworkz.camera.entity.CameraEntity;

public class CameraDAOImpl implements CameraDAO {

	public int save(CameraEntity entity) {
		try (SessionFactory fact = SFUtil.getFactory()) {

			Session session = fact.openSession();
			Transaction txn = session.beginTransaction();
			int pk = (Integer) session.save(entity);
			txn.commit();
			session.close();

			return pk;
		}
	}

	@Override
	public CameraEntity readById(int pk) {
		try(SessionFactory sn=SFUtil.getFactory()){	
		Session session = sn.openSession();
		CameraEntity be = session.get(CameraEntity.class, pk);
		session.close();
		return be;
		}
	}

	@Override
	public void deleteById(int id) {
		try (SessionFactory fact = SFUtil.getFactory()) {

			Session session = fact.openSession();

			Transaction txn = session.beginTransaction();
			CameraEntity b = session.load(CameraEntity.class, id);
			session.delete(b);
			txn.commit();
			System.out.println("************" + b);
			session.close();
		}
	}

	@Override
	public void updateBrandById(int id, String brand) {
		try (SessionFactory fact = SFUtil.getFactory()) {

			Session session = fact.openSession();

			Transaction txn = session.beginTransaction();
			CameraEntity camera = session.get(CameraEntity.class, id);
			camera.setBrand(brand);
			session.update(camera);
			System.out.println(camera);
			session.close();
		}
	}

}
