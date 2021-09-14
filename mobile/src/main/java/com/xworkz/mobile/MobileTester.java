package com.xworkz.mobile;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileEntity entity = new MobileEntity(4, "Samsung", 6.5, 30000);
		MobileDAO dao = new MobileDAOImpl();
		// dao.save(entity);
	/*	dao.fetchAll();
		dao.fetchNameById();
		dao.updatePriceById();*/
		dao.findPriceByName();
		
	}

}
