package com.startegycoc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {
	
	@RequestMapping("get_app")
	public String getAppName() {
		return "ClashOfClans-Strategy";
	}

}
