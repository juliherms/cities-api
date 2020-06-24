package com.cities.citiesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cities.citiesapi.entity.City;
import com.cities.citiesapi.repository.CityRepository;

/**
 * Class responsible to maintain City
 * @author j.a.vasconcelos
 *
 */
@Service
public class CityService {
	
	@Autowired
	private CityRepository repo;
	
	public Page<City> findAll(final Pageable page) {
		return repo.findAll(page);
	}

}
