package com.xworkz.camera.dao;


import java.util.List;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {

public CameraEntity readById(int pk);
void updateBrandById(int id,String brand);
void deleteById(int id);
void saveList(List<CameraEntity> entity);
void deleteList(List<CameraEntity> ids);
}
