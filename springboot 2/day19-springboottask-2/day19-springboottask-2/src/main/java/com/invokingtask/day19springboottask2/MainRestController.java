package com.invokingtask.day19springboottask2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;






@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MainRestController {
    
    @Autowired
    Service2 service;
    
    @GetMapping("new")
    public ResponseEntity<City> connectToAngular(){
    	return new ResponseEntity<City>(cityrepo.findById(2).get(),HttpStatus.OK);
    }

      @PostMapping("city1")
        public City addCity(City city) {
            return service.saveCity(city);
        }





      @PostMapping("/addCities")
        public List<City> addCities(List<City> city) {
            return service.saveCities(city);
        }
      

@GetMapping("city2")
        public List<City> findAllCity() {
            return service.getCity();
        }

 @GetMapping("/city/{id}")
        public City findCityId(@PathVariable int cityId) {
            return service.getByCityId(cityId);
        }

@GetMapping("/city/{name}")
        public List<City> findByCityName(@PathVariable String name) {
            return service.getCityName(name);
        }



@PutMapping("/update")
        public City updateCity(@RequestBody City city) {
            return service.update(city);
        }

@DeleteMapping("/delete/{id}")
        public String deleteCity(@PathVariable int cityId) {
            return service.delete(cityId);
        }
        
        
        
        @PostMapping("runner1")
        public Runner get(Runner runner)
        {
            return service.show(runner);
        }
        
        @PostMapping("runner2")
        public List<Runner> show(Runner runner)
        {
            return service.getRunner(runner);
        }
        
        @PutMapping("/update/runner")
        public Runner updateRunner(@RequestBody Runner runner)
        {
            return service.update(runner);
        }
        
        @DeleteMapping("/deleterun/{id}")
        public String deleteRunner(@PathVariable int runnerId)
        {
            return service.delete1(runnerId);
        }
            
}