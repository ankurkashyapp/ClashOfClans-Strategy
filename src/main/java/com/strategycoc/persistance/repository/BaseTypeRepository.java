package com.strategycoc.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.strategycoc.persistance.entity.BaseType;

public interface BaseTypeRepository extends JpaRepository<BaseType,Integer > {

	public List<BaseType> findAll();
}
