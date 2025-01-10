package com.javaweb.Repository.BuildingRepositoryImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.Models.BuildingEntity;
import com.javaweb.Repository.BuildingRepository;

@Repository
public class BuildingRepositoryIml implements BuildingRepository {
	private final String URL = "jdbc:mysql://localhost:3306/estatebasic";
	private final String UserName = "root";
	private final String PassWord = "Quocb@o0906";

	@Override
	public List<BuildingEntity> findAll(String name, Long districtId) {
		
		StringBuilder sql = new StringBuilder("SELECT * FROM building b WHERE 1=1 ");
		if(name != null && !name.equals("")) {
			sql.append("AND b.name LIKE '%" + name + "%' ");
		}
		if(districtId != null) {
			sql.append("AND b.districtid = " + districtId + " ");
		}
		List<BuildingEntity> buildings = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(URL, UserName, PassWord);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sql.toString()))
		{
			while(result.next()) {
				BuildingEntity building = new BuildingEntity();
				building.setName(result.getString("name"));
				building.setNumberOfBaseMentl(result.getInt("numberOfBaseMent"));
				building.setStreet(result.getString("street"));
				building.setWard(result.getString("ward"));
				buildings.add(building);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.print("Connection failed");
		}
		
		return buildings;
	}

}
