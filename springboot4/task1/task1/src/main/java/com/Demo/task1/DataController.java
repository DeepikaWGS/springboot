package com.Demo.task1;


import org.springframework.web.bind.annotation.RestController;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class DataController {
	
	@PostMapping("/create")
	public String putData(City data)
	{
		System.out.println("the data" + data.CityName + "" + data.CityPinCode);
		return "success";
		
	}
	
//	@GetMapping("/create")
//	public String getString()
//	{
//		
//		return "success";	
//				
//	
//	}
	
	@PutMapping("/update/{id}")
	public String  updateData(@PathVariable String id)
	{
	System.out.println(id);
	return "suceed";
	}
	
	@GetMapping("/update")
	public String someMethod() {
		return "some method";
	}
	
	

}
