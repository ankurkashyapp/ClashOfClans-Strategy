package com.strategycoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.strategycoc.persistance.entity.BaseType;
import com.strategycoc.persistance.entity.TownHall;
import com.strategycoc.service.TownhallService;


@RestController
@Scope("request")
public class StrategyController {
	
	@Autowired
	private TownhallService townhallService;
	
	
	@RequestMapping(value = "/townhalls/all", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@ResponseStatus(code = HttpStatus.OK)
	public List<TownHall> getTownHalls() {
		return townhallService.getAllTownhalls();
	}
	
	@RequestMapping(value = "/basetypes/all", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@ResponseStatus(code = HttpStatus.OK)
	public List<BaseType> getBaseTypes() {
		
		return townhallService.getAllBaseTypes();
	}

}
