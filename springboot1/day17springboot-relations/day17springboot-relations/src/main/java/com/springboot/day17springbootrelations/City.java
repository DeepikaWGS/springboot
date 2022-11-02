package com.springboot.day17springbootrelations;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="City")
public class City {
	@Id
	@Column(name="CityId")
	int cityId;
	@Column(name="Cityname")
	String cityName;
	@Column(name="region")
	String CityRegion;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}
	
	public City(int a, String b, String c, List r1) {
		
		cityId=a;
		cityName=b;
		CityRegion=c;
		
		
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityRegion() {
		return CityRegion;
	}

	public void setCityRegion(String cityRegion) {
		CityRegion = cityRegion;
	}
	

}
