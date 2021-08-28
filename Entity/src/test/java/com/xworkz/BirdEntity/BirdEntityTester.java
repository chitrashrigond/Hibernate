package com.xworkz.BirdEntity;

import com.xworkz.Entity.BirdEntity;
import com.xworkz.Entity.dao.BirdDAO;
import com.xworkz.Entity.dao.BirdDAOImpl;

public class BirdEntityTester {

	public static void main(String[] args) {
		BirdEntity entity=new BirdEntity(1,"peacock","blue",true,2,true,true,"abc",10,true);
		
		System.out.println("entity");
		
		BirdDAO bdao = new BirdDAOImpl();
	     bdao.save(entity);
		
		BirdEntity be = bdao.readById(1);
		System.out.println(be);

	}
	

}
