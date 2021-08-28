package com.xworkz.Entity.dao;

import com.xworkz.Entity.BirdEntity;

public interface BirdDAO {
int save(BirdEntity entity);
public BirdEntity readById(int pk);
}
