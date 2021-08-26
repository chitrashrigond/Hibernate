package com.xworkz.soap.dao;


import org.hibernate.Transaction;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.hybernet.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO{

	@Override
	public int save(SoapDTO entity) {
		Configuration cn = new Configuration();
		cn.configure();
		cn.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = cn.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		int pk = (int) session.save(entity);
		tran.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

	@Override
	public void delete(SoapDTO entity) {
		Configuration cn = new Configuration();
		cn.configure();
		cn.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = cn.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		session.delete(entity);
		tran.commit();
		System.out.println("****"+session);
		session.close();
		factory.close();
		return;
	}

	/*@Override
	public List<SoapDTO> read(SoapDTO dto) {
		Configuration cn = new Configuration();
		cn.configure();
		cn.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = cn.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		List<SoapDTO> pk = (List<SoapDTO>) session.
	
		System.out.println(pk);
		session.close();
		factory.close();
		return null;
	}*/

}

