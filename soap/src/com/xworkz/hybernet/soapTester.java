package com.xworkz.hybernet;

import com.xworkz.hybernet.soap.constant.Type;
import com.xworkz.hybernet.soap.dto.SoapDTO;
import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dao.SoapDAOImpl;

public class soapTester {

	public static void main(String[] args) {
	SoapDTO dto=new SoapDTO(1,"kareenaKapur",Type.BABY,true,true,50);

	SoapDAO dao=new SoapDAOImpl();
	dao.save(dto);
	}

}
