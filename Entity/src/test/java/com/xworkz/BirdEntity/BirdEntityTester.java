package com.xworkz.BirdEntity;

import com.xworkz.Entity.BirdEntity;
import com.xworkz.Entity.dao.BirdDAO;
import com.xworkz.Entity.dao.BirdDAOImpl;

public class BirdEntityTester {

	public static void main(String[] args) {
		BirdEntity entity=new BirdEntity(4,"Parrot","green",false,2,false,true,"psittaciformes",40,true);
		
		System.out.println("entity");
		
		BirdDAO bdao = new BirdDAOImpl();
	   bdao.save(entity);
		
		BirdEntity be = bdao.readById(2);
		System.out.println(be);
		 bdao.deleteById(1);
		
		bdao.updateNameById(4, "Dove");
		System.out.println("**********"+bdao);
  
	}
	

}
