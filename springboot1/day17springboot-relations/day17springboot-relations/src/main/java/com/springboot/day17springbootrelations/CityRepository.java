package com.springboot.day17springbootrelations;



import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
@Repository
public interface CityRepository extends JpaRepository<City,Integer>
{

//	List<Object[]> selectFewColumn();
	@Query(value="select cityId,cityName from City")

public List<Objects[]>selectFewColumn();

}
