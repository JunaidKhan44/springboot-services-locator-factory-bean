/**
 * 
 */
package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Vehicle;
import com.springboot.registry.ServiceRegistry;

/**
 * @author Junaid.Khan
 *
 */

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private ServiceRegistry  registry;
	
	@PostMapping
	public void processVehicleRequest(@RequestBody Vehicle  vehicle) {
		registry.getService(vehicle.getVehicleType()).process(vehicle);
	}
}
