package com.invokingtask.day19springboottask2;



import javax.persistence.CascadeType;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;



@Entity
@Table(name="city_table")
public class City {
	@Id
	@Column(name="CityId")
	int cityId;
	@Column(name="CityName")
	String cityName;
	@Column(name="Region")
	
	String CityRegion;
   
	@OneToMany(cascade=CascadeType.ALL)

	List<Runner>runners;

	
	public City()
	{
		
		
	}
	
	
	public City(int a, String b, String c, List<Runner> r1) {
		
		cityId=a;
		cityName=b;
		CityRegion=c;
		runners=r1;
		
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
	 public List<Runner> getRunners() {
         return runners;
     }



    public void setRunners(List<Runner> runners) {
         this.runners = runners;
     }

}
