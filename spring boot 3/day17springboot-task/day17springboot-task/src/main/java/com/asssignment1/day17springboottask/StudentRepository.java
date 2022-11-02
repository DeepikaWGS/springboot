package com.asssignment1.day17springboottask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository< Student , Integer>{
	
	

}
