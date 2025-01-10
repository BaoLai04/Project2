package com.javaweb.Service;

import java.util.List;

import com.javaweb.Models.BuildingDTO;

public interface BuildingSerivce {
	List<BuildingDTO> findAll(String name, Long districtId);
}
