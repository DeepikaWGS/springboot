package com.invokingtask.day19springboottask2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



@org.springframework.stereotype.Service
public class Service2 {
    
    @Autowired
    CityRepository cityRep;
    
    //create
    public City saveCity(City city)
    {
        return cityRep.save(city);
    }
    
    public List<City> saveCities(List<City> city)
    {
        return cityRep.saveAll(city);
    }
    
    //retrieve





  public List<City> getCity()
    {
        return cityRep.findAll();
        
    }
    public City getByCityId(int cityId)
    {
        return cityRep.findById(cityId).orElse(null);
        
    }
    public List<City> getCityName(String name)
    {
        return cityRep.findByCityName(name);
    }
    
    //Update
    
    public City update(City city)
    {
        City ref = cityRep.findById(city.getCityId()).orElse(city);
        ref.setCityName(city.getCityName());
        ref.setRunners(city.getRunners());
        return cityRep.save(ref);
    }
    
    //delete
    public String delete(int cityId)
    {
        cityRep.deleteById(cityId);
        return "cityremoved" +cityId;
    }
    
    @Autowired
    RunnerRepository runnerRep;
    
    //create
    public Runner show(Runner runner)
    {
        return runnerRep.save(runner);
    }
    //retrieve
    public List<Runner> getRunner(Runner runner)
    {
        return runnerRep.findAll();
    }
    
    //Update
    public Runner update(Runner runner)
    {
        Runner obj=runnerRep.findById(runner.getRunnerId()).orElse(runner);
        obj.setRunnerId(runner.getRunnerId());
        obj.setRunnerName(runner.getRunnerName());
        obj.setCityId(runner.getCityId());
        return runnerRep.save(obj);
    }
    
    //delete
    public String delete1(int runnerId)
    {
        runnerRep.deleteById(runnerId);
        return "Id removed";
    }
}