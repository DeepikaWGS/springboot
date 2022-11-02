package com.invokingtask.day19springbootmultipleapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SourceController 
{
	@GetMapping("/otherservice")
	
	public String CallOtherService()
	{
		RestTemplate template=new RestTemplate();
		String data=(String)template.getForEntity("http://localhost:8081/thyme", String.class).getBody();
	    return data;
	}
	

}
