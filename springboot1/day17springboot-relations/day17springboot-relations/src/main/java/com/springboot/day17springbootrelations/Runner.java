package com.springboot.day17springbootrelations;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Runner {
	@Id
	@Column(name="runnerid")
	int RunnerId;
	@Column(name="runnername")
	String RunnerName;
	
   @ManyToOne(targetEntity = City.class)
   City city;
	
	public Runner() {
		// TODO Auto-generated constructor stub
	}
	
	public Runner(int r,String n,City y) {
		RunnerId=r;
		RunnerName=n;
		city=y;
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
	public void setCityId(City city)
	{
		System.out.println(city.getCityId());
		this.city=city;
	}
	
}
