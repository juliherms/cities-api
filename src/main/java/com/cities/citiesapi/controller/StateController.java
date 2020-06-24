package com.cities.citiesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.entity.State;
import com.cities.citiesapi.service.StateService;

/**
* End point countries
* 
* @author j.a.vasconcelos
*
*/
@RestController
@RequestMapping("staties")
public class StateController {

	@Autowired
	private StateService service;
	
	/**
	 * List all states
	 * 
	 * @param page
	 * @return
	 */
	@GetMapping
	public Page<State> states(final Pageable page) {
		return service.findAll(page);
	}
}