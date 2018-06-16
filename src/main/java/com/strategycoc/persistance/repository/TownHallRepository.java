package com.strategycoc.persistance.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.strategycoc.persistance.entity.TownHall;

public interface TownHallRepository extends JpaRepository<TownHall, Integer>{
	
	public List<TownHall> findAll();
	
    
}
