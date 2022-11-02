package com.invokingtask.day19springboottask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services1
{
	
	@Autowired
	Service2 service;

}
