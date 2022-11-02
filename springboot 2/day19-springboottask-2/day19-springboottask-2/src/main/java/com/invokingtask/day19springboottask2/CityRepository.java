package com.invokingtask.day19springboottask2;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CityRepository extends JpaRepository<City,Integer>{
   
	List<City> findByCityName(String city);



}