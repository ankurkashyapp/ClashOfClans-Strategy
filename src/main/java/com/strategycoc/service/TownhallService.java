package com.strategycoc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategycoc.persistance.entity.BaseType;
import com.strategycoc.persistance.entity.TownHall;
import com.strategycoc.persistance.repository.BaseTypeRepository;
import com.strategycoc.persistance.repository.TownHallRepository;

@Service
@Transactional
public class TownhallService {
	
	@Autowired
	private TownHallRepository townHallRepository;
	@Autowired
	private BaseTypeRepository baseTypeRepository;
	
	public List<TownHall> getAllTownhalls() {
		
		
		return townHallRepository.findAll();
	}
	
	public List<BaseType> getAllBaseTypes(){
		return baseTypeRepository.findAll();
		
	}
}
