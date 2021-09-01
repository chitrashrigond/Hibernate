
package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class cameraTester{
	
	public static void main(String [] args){
		CameraEntity cn=new CameraEntity(3,"Sony","Sony a7","Digital",23,"black",150000,true,1200,3);
		CameraDAO dao=new CameraDAOImpl();
		
		//dao.save(cn);
		//CameraEntity ce=dao.readById(2);
		//System.out.println(ce);
		
		//dao.deleteById(3);
		
		dao.updateBrandById(1, "Canon EOS 6D");
		System.out.println(dao);
		
		
	}
}