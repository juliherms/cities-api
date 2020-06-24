package com.cities.citiesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.entity.City;
import com.cities.citiesapi.service.CityService;

/**
 * Endpoint cities
 * 
 * @author j.a.vasconcelos
 *
 */
@RestController
@RequestMapping("cities")
public class CityController {

	@Autowired
	private CityService service;
	
	/**
	 * List all cities
	 * @param page
	 * @return
	 */
	@GetMapping
	public Page<City> cities(final Pageable page) {
		return service.findAll(page);
	}

}
