package com.xworkz.camera.dao;


import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {
int save(CameraEntity entity);
public CameraEntity readById(int pk);
void updateBrandById(int id,String brand);
void deleteById(int id);
}
