package com.javaweb.Repository;

import java.util.List;

import com.javaweb.Models.BuildingEntity;

public interface BuildingRepository {
	List<BuildingEntity> findAll(String name, Long distictId);
}
