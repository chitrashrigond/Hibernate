package com.xworkz.mobile.dao;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileDAO {
int save(MobileEntity entity);
void fetchAll();

String fetchNameById();

int updatePriceById();
int findPriceByName();
}
