package com.invokingtask.day19springboottask2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Runner {
	@Id
	@Column(name="RunnerId")
	int RunnerId;
	@Column(name="RunnerName")
	String RunnerName;
	@Column(name="CityId")
	int cityId;
  
	@ManyToOne(targetEntity = City.class)
   City city;
	
	public Runner() {
		// TODO Auto-generated constructor stub
	}
	
	public Runner(int r,String n,int y) {
		RunnerId=r;
		RunnerName=n;
		cityId=y;
	}

	public int getRunnerId() {
		return RunnerId;
	}

	public void setRunnerId(int runnerId) {
		RunnerId = runnerId;
	}

	public String getRunnerName() {
		return RunnerName;
	}

	public void setRunnerName(String runnerName) {
		RunnerName = runnerName;
	}
	public City getCityId()
	{
		return city;
	}
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setCityId(City city)
	{
		System.out.println(city.getCityId());
		this.city=city;
	}
	
}
