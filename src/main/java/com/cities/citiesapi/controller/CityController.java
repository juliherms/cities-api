package com.cities.citiesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.entity.City;
import com.cities.citiesapi.service.CityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Endpoint cities
 * 
 * @author j.a.vasconcelos
 *
 */
@RestController
@RequestMapping("cities")
@Api(tags="/cities", value="Grupo de API's para manipulação de cidades")
public class CityController {

	@Autowired
	private CityService service;

	/**
	 * List all cities
	 * 
	 * @param page
	 * @return
	 */
	@GetMapping
	@ApiOperation(value = "API responsável por retornar a lista de cidades de forma paginada.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Retorno da lista de cidades", response = City.class) })
	public Page<City> cities(final Pageable page) {
		return service.findAll(page);
	}

	/**
	 * Get city by name
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/{name}")
	@ApiOperation(value = "API responsável por retornar uma cidade por nome informado.")
	public City findByName(@PathVariable("name") String name) {

		return service.findByName(name);
	}

	/**
	 * Get cities by uf id
	 * 
	 * @param uf
	 * @return
	 */
	@ApiOperation(value = "API responsável por retornar uma lista de cidade por estado informado.")
	public List<City> findByUf(@PathVariable("uf") Integer uf) {

		return service.findByUf(uf);
	}
}
