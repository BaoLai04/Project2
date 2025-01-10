package com.javaweb.Models;

public class BuildingEntity {
	private String name;
	private Integer numberOfBaseMentl;
	private String street;
	private String ward;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfBaseMentl() {
		return numberOfBaseMentl;
	}
	public void setNumberOfBaseMentl(Integer numberOfBaseMentl) {
		this.numberOfBaseMentl = numberOfBaseMentl;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	
}
