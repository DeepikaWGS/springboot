package com.Demo.task1;


public class City {
	
	int CityPinCode;
	String CityName;
	
public City() 
{
	// TODO Auto-generated constructor stub
	this(625001,"Madurai");
}
public City(int CityPinCode , String CityName) {
	this.CityPinCode=CityPinCode;
	this.CityName=CityName;
}
public int getCityPinCode() 
{
	return CityPinCode;
}
public void setCityPinCode(int cityPinCode) 
{
	CityPinCode = cityPinCode;
	
}
public String getCityName() {
	return CityName;
}
public void setCityName(String cityName) {
	CityName = cityName;
}


}
