package com.javaweb.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.Models.BuildingDTO;
import com.javaweb.Service.BuildingServiceImpl.BuildingServiceImpl;

@RestController
public class BuildingAPI {
	@Autowired
	BuildingServiceImpl buildingServiceImpl;
	@GetMapping("/test")
	public List<BuildingDTO> getBuilding(@RequestParam(value = "name", required = false) String name_Building,
									     @RequestParam(value = "districtId", required = false) Long districtId) {
		List<BuildingDTO> result = buildingServiceImpl.findAll(name_Building, districtId);
		return result;
	}
}
