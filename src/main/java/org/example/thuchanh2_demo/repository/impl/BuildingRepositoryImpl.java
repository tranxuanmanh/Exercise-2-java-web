package org.example.thuchanh2_demo.repository.impl;

import org.example.thuchanh2_demo.Entity.BuildingEntity;
import org.example.thuchanh2_demo.repository.BuildingRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
    static final String Db_URL="jdbc:mysql://localhost:3306/28techp1";
    static final String USER="root";
    static final String PASS="";
    @Override
    public List<BuildingEntity> listBuilding(String name,Integer floorarea) {
        StringBuilder sql= new StringBuilder("SELECT * FROM building b WHERE 1=1 ");
        if(name!=null&&!name.isEmpty()){
            sql.append("AND b.name LIKE '%"+name+"%' ");
        }
        if(floorarea!=null&&floorarea>0){
            sql.append("AND b.floorarea = "+floorarea+" ");
        }
        List<BuildingEntity> result=new ArrayList<BuildingEntity>();
        try(
                Connection conn= DriverManager.getConnection(Db_URL,USER,PASS);
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql.toString());
                ) {
            while(rs.next()){
                BuildingEntity obj=new BuildingEntity();
                obj.setName(rs.getString("name"));
                obj.setWard(rs.getString("ward"));
                obj.setStreet(rs.getString(3));
//                obj.setNumberOfBasement(rs.getInt(7));
                obj.setNumberOfBasement(rs.getInt("numberofbasement"));
                result.add(obj);
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return result;
    }
}
