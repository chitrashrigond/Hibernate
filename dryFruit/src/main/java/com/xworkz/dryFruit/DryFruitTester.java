package com.xworkz.dryFruit;

import com.xworkz.dryFruit.dao.DryFruitDAO;
import com.xworkz.dryFruit.dao.DryFruitDAOImpl;
import com.xworkz.dryFruit.dto.DryFruitDTO;

public class DryFruitTester {
   public static void main(String[] args){
	   
	   DryFruitDTO dto=new DryFruitDTO(4,"CashewNut",97,true,"low in sugar and rich in fiber heart-healthy fats and plant protein","White");
	   DryFruitDAO dao=new DryFruitDAOImpl();
	   dao.save(dto);
   }
}
