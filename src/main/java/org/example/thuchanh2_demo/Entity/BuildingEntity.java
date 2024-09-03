package org.example.thuchanh2_demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingEntity {
    private String name;
    private Integer numberOfBasement;
    private String ward;
    private String street;
}
