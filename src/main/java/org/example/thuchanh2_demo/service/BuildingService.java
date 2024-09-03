package org.example.thuchanh2_demo.service;

import org.example.thuchanh2_demo.Entity.BuildingEntity;
import org.example.thuchanh2_demo.Model.BuildingDTO;

import java.util.List;

public interface BuildingService {
    List<BuildingDTO> findAllName(String name,Integer floorarea);
}
