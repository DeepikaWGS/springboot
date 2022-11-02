package com.example.day18SpringBootThymeLeaf;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThymeController {

	
	@GetMapping("/thyme")
	public String showpage(Model model)
	{
		String word="WORLDLINE";
		model.addAttribute("key",word);
		return "test";
	}

	
}
