package com.strategycoc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strategycoc.persistance.repository.TownHallRepository;

@RestController
public class StrategyController {
	
	@RequestMapping("get_app")
	public String getAppName() {
		return "COC Strategy";
	}

}
