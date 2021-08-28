package com.xworkz.dryFruit.dao;
import org.hibernate.Configuration;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryFruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO{

	public int save(DryFruitDTO dto) {
	Configuration cnfg=new Configuration();
	cnfg.configure();
	cnfg.addAnnotatedClass(DryFruitDTO.class);
	SessionFactory sf=cnfg.buildSessionFactory();
	Session sn=sf.openSession();
	Transaction trn=sn.beginTransaction();
	int df= (Integer) sn.save(dto);
	trn.commit();
	sn.close();
	sf.close();
		return df;
	}

}
