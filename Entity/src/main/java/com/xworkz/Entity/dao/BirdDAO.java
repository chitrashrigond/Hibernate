package com.xworkz.Entity.dao;

import com.xworkz.Entity.BirdEntity;

public interface BirdDAO {
//int save(BirdEntity entity);
public BirdEntity readById(int pk);
void updateNameById(int id,String name);
void deleteById(int id);
}
