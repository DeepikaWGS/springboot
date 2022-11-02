package com.demo.Day14SpringBoot;

import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class WebProject {
    
    @GetMapping("/hello")
    public List<User>getData()
    {
        User ref = new User();
        List<User> data = ref.getInformation();
        return data;
        //return "Success";
    }
    



}