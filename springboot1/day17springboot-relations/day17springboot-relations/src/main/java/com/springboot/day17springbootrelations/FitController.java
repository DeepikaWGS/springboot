package com.springboot.day17springbootrelations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitController {
	
	@Autowired
	FitService fitserve;
	
	@PostMapping("/city")
	
	public String cityAddition(City city) throws Exception  {
		
		if(city.getCityName().equals("nothing"))
		{
			throw new Exception();
		}
		System.out.println(city.getCityName());
		String value=fitserve.addCity(city);
		return value;
		
	}
	
	
//	@PostMapping("/runner")
//	public String runnerAddition(Runner runner)	
//	{
//		String value=fitserve.addRunner(runner);
//		return value;
//	}
//	
//	@GetMapping("/few")
//	public String fewColumns() 
//	{
//		 String value = fitserve.getFewColumn();
//		return "test";
//	}

}
