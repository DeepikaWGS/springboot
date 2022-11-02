package com.demo.Day14SpringBoot;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class DataController {
	
	@GetMapping("/String")
	public String getString() {
	
		return "success";
	}
	


}
