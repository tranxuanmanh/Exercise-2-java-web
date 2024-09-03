package org.example.thuchanh2_demo.service.impl;

import org.example.thuchanh2_demo.Entity.BuildingEntity;
import org.example.thuchanh2_demo.Model.BuildingDTO;
import org.example.thuchanh2_demo.repository.BuildingRepository;
import org.example.thuchanh2_demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuildingServiceImpl implements BuildingService {
    private BuildingRepository buildingRepository;
    @Autowired
    public BuildingServiceImpl(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }
    @Override
    public List<BuildingDTO> findAllName(String name,Integer floorarea) {
       List<BuildingEntity> buildings= buildingRepository.listBuilding(name,floorarea);
        List<BuildingDTO> result=new ArrayList<BuildingDTO>();
        for(BuildingEntity s:buildings){
            BuildingDTO buildingRespond=new BuildingDTO();
            buildingRespond.setName(s.getName());
            buildingRespond.setAddress(s.getStreet()+","+s.getWard());
            buildingRespond.setNumberOfBasement(s.getNumberOfBasement());
            result.add(buildingRespond);
        }
        return result;
    }
}
