package com.asssignment1.day17springboottask;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DataController17 {
	
	
	@Autowired
	StudentRepository stuRepo;
	
	@PostMapping("/student")
	
public String addData()
	{
//		System.out.println(obj.getId());
//		System.out.println(obj.getName());
//		System.out.println(obj.getScore1());
//		System.out.println(obj.getScore2());
//		System.out.println(obj.getScore3());
		
		Student obj=new Student(3,"deepika",34,56,78);
//		obj.Id=1;
//		obj.name="deepika";
//		obj.score1=88;
//		obj.score2=77;
//		obj.score3=99;
		
		stuRepo.save(obj);
		return "successs";
			}


	
	

}
