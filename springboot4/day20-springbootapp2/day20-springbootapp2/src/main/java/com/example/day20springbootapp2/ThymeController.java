package com.example.day20springbootapp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ThymeController {
	
	@GetMapping("/otherservice")
	public String callOtherService() {
		
		RestTemplate resttemp=new RestTemplate();
		String data=(String)resttemp.getForEntity("http:localhost:8080/city",String.class).getBody();
		return data;
	}
	
	

}
