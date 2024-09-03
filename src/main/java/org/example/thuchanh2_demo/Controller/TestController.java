package org.example.thuchanh2_demo.Controller;

import org.example.thuchanh2_demo.Model.BuildingDTO;
import org.example.thuchanh2_demo.Entity.BuildingEntity;
import org.example.thuchanh2_demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private BuildingService buildingService;
    @Autowired
    public TestController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping("/all")
    public List<BuildingDTO> getAllBuilding(@RequestParam(name="name",required = false) String name,
                                            @RequestParam(name="floorarea",required = false) Integer floorarea,
                                            @RequestParam(name="typeCode",required = false ) List<String> typeCode
                                            ){

        List<BuildingDTO> builds=buildingService.findAllName(name,floorarea);
        return builds;

        }

    @GetMapping("/manh")
    public String listNumber(){
        return "Hello manh";
    }


}
