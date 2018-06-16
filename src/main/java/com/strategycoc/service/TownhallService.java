package com.strategycoc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.strategycoc.persistance.entity.BaseDescription;
import com.strategycoc.persistance.entity.BaseType;
import com.strategycoc.persistance.entity.TownHall;
import com.strategycoc.persistance.repository.BaseDescriptionRepository;
import com.strategycoc.persistance.repository.BaseTypeRepository;
import com.strategycoc.persistance.repository.TownHallRepository;

@Service
@Transactional
public class TownhallService {
	public static final int PAGE_SIZE = 20;
	
	@Autowired
	private TownHallRepository townHallRepository;
	
	@Autowired
	private BaseTypeRepository baseTypeRepository;
	
	@Autowired
	private BaseDescriptionRepository baseDescriptionRepository;
	
	public List<TownHall> getAllTownhalls() {
		
		
		return townHallRepository.findAll();
	}
	
	public List<BaseType> getAllBaseTypes(){
		return baseTypeRepository.findAll();
		
	}
	
	public List<BaseDescription> getBaseDescriptions(int townhallId, int typeId, int pageNo) {
		return baseDescriptionRepository.findByTownHallIdAndTypeId(townhallId, typeId, getPageRequest(pageNo)).getContent();
	}
	
	private PageRequest getPageRequest(int pageNo) {
		return new PageRequest(pageNo-1, PAGE_SIZE);
	}
}
