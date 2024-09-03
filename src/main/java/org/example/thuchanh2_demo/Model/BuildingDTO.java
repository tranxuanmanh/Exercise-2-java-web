package org.example.thuchanh2_demo.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingDTO {
    private String name;
    private Integer numberOfBasement;
   private String address;


}
