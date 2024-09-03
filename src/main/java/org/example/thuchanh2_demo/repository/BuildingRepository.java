package org.example.thuchanh2_demo.repository;


import org.example.thuchanh2_demo.Entity.BuildingEntity;

import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> listBuilding(String name,Integer floorarea);
}
