package com.springtask.day17springbootmutliservices;



import java.awt.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OriginatingServices {
	
	
	
	@GetMapping("/interservice")
	public String callOtherServices() {
		RestTemplate template=new RestTemplate();
		List temp=(List)template.getForEntity("http://localhost:8080/account", List.class);
		return "called";
		}

}
