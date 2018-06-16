package com.strategycoc;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strategycoc.persistance.repository.TownHallRepository;

@Service
@Transactional
@RestController
public class StrategyController {
	
	@Autowired
	private TownHallRepository townHallRepository;
	@RequestMapping("get_app")
	public String getAppName() {
		return townHallRepository.findAll().get(0).getTownhallName();
	}

}
