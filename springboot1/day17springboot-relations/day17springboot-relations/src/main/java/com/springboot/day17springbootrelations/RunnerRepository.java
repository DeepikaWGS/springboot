package com.springboot.day17springbootrelations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RunnerRepository extends JpaRepository<Runner , Integer>{

//	Runner findByRunnerName(String string);

}
