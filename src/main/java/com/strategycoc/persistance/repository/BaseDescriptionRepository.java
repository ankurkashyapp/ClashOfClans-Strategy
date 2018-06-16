package com.strategycoc.persistance.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.strategycoc.persistance.entity.BaseDescription;

public interface BaseDescriptionRepository extends JpaRepository<BaseDescription, Integer>{
	
	Page<BaseDescription> findByTownHallIdAndTypeId(int townhallId, int typeId, Pageable pageable);
}
