package com.day16.demo16;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class DataController {
	@Autowired
	AccountRepository actRepo;
	


	   
@GetMapping("/account")

public List<Account>finders(){
	
//	System.out.println("Finder method called");
	
	return actRepo.findAll();
}

@GetMapping("/account/{id}")

public List<Account>finders(@PathVariable int id){
	
	System.out.println("Finder method called");
	
	return actRepo.findById(id);
}



@PostMapping("/addingaccount")

public String addData(@RequestBody Account account)
{
	
//	Account obj=new Account();
//	System.out.println(obj.getId());
//	System.out.println(obj.getName());
//	System.out.println(obj.getBalance());

	

//	obj.Id=1;
//	obj.name="deepika";
//	obj.score1=88;
//	obj.score2=77;
//	obj.score3=99;
	
	actRepo.save(account);
	return "added";
		}
}


