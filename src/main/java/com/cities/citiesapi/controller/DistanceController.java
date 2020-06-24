package com.cities.citiesapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.service.DistanceService;
import com.cities.citiesapi.service.EarthRadius;

/**
 * Class responsible to calculate distance between cities.
 * @author j.a.vasconcelos
 *
 */
@RestController
@RequestMapping("/distances")
public class DistanceController {

	Logger log = LoggerFactory.getLogger(DistanceController.class);

	@Autowired
	private DistanceService service;

	@GetMapping("/by-points")
	public Double byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return service.distanceByPointsInMiles(city1, city2);
	}

	@GetMapping("/by-cube")
	public Double byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byCube");
		return service.distanceByCubeInMeters(city1, city2);
	}

	@GetMapping("/by-math")
	public Double byMath(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2,
			@RequestParam final EarthRadius unit) {

		log.info("byMath");
		return service.distanceUsingMath(city1, city2, unit);
	}
}