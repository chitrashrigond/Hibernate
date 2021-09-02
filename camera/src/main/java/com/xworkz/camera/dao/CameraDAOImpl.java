package com.xworkz.camera.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.util.SFUtil;

import com.xworkz.camera.entity.CameraEntity;

public class CameraDAOImpl implements CameraDAO {
	SessionFactory fact = SFUtil.getFactory();

	public int save(CameraEntity entity) {
		try (Session session = fact.openSession();) {
			Transaction txn = session.beginTransaction();
			int pk = (Integer) session.save(entity);
			txn.commit();
			return pk;
		}
	}

	@Override
	public CameraEntity readById(int pk) {
		try (Session session = fact.openSession()) {
			CameraEntity be = session.get(CameraEntity.class, pk);
			return be;
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = fact.openSession()) {

			Transaction txn = session.beginTransaction();
			CameraEntity b = session.load(CameraEntity.class, id);
			session.delete(b);
			txn.commit();
			System.out.println("************" + b);

		}
	}

	@Override
	public void updateBrandById(int id, String brand) {
		try (Session session = fact.openSession();) {
			Transaction txn = session.beginTransaction();
			CameraEntity camera = session.get(CameraEntity.class, id);
			camera.setBrand(brand);
			session.update(camera);
			System.out.println(camera);
			txn.commit();

		}
	}

	@Override
	public void saveList(List<CameraEntity> entity) {
		try (Session session = fact.openSession();) {
			Transaction txn = session.beginTransaction();

			for (CameraEntity entity1 : entity) {
				session.save(entity1);
				session.flush();
				
			}

			txn.commit();

		}

	}

	@Override
	public void deleteList(List<CameraEntity> ids) {
		try (Session session = fact.openSession();) {
			Transaction txn = session.beginTransaction();
			Iterator<CameraEntity> itList = ids.iterator();
		    while(itList.hasNext()) {
		        CameraEntity emp = itList.next();
		        session.delete(emp);
		        session.flush();
		    }
			

			txn.commit();
	}
	

}
}