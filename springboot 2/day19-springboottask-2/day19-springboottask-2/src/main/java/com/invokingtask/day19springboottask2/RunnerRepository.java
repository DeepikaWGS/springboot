package com.invokingtask.day19springboottask2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;






@Repository
public interface RunnerRepository extends JpaRepository<Runner,Integer> 
{
    List<Runner> findByRunnerName(String runner);



}