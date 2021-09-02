
package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class cameraTester {

	public static void main(String[] args) {
		 CameraEntity cn=new CameraEntity(8,"Fujifilm","FujifilmX100","Digital",23,"black",150000,true,1200,3);
		CameraDAO dao = new CameraDAOImpl();

		// dao.save(cn);
		// CameraEntity ce=dao.readById(2);
		// System.out.println(ce);

		// dao.deleteById(3);

		dao.updateBrandById(1, "Canon EOS 6D");

		List<CameraEntity> lentity = new ArrayList<CameraEntity>();
		lentity.add(cn);
		dao.saveList(lentity);
		dao.deleteList(lentity);
	
	}
}