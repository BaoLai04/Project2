package com.javaweb.Service.BuildingServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.Models.BuildingDTO;
import com.javaweb.Models.BuildingEntity;
import com.javaweb.Repository.BuildingRepositoryImpl.BuildingRepositoryIml;
import com.javaweb.Service.BuildingSerivce;

@Service
public class BuildingServiceImpl implements BuildingSerivce {

	@Autowired
	private BuildingRepositoryIml buildingRepositoryIml;
	@Override
	public List<BuildingDTO> findAll(String name, Long districtId) {
		List<BuildingEntity> buildings  = buildingRepositoryIml.findAll(name, districtId);
		List<BuildingDTO> result = new ArrayList<>();
		for(BuildingEntity building : buildings) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO.setName(building.getName());
			buildingDTO.setNumberOfBaseMent(building.getNumberOfBaseMentl());
			buildingDTO.setAddress(building.getStreet() + ", " + building.getWard());
			result.add(buildingDTO);
		}
		return result;
	}

}
