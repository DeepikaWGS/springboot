package com.springboot.day17springbootrelations;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FitService {



   @Autowired
    CityRepository cityRepo;
    
    public String addCity(City obj) {
        cityRepo.save(obj);
        return "city";
    }



   @Autowired
    RunnerRepository runnerRepo;
    
    public String addRunner(Runner obj1) {
        runnerRepo.save(obj1);
        return "runner";
    }
    
    public String getFewColumn()
    {
        List<Objects[]> data = cityRepo.selectFewColumn();
        return "test";
    }



   



}

//	 public String getFewColumn()
//	    {
//	        List<Objects[]> data = cityrepo.selectFewColumn();
//	        return "test";
//	    }


