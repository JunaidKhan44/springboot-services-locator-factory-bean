/**
 * 
 */
package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Vehicle;
import com.springboot.registry.AdapterService;

/**
 * @author Junaid.Khan
 *
 */
@Service("Bike")
public class BikeService implements AdapterService<Vehicle> {

	@Override
	public void process(Vehicle request) {
	
		System.out.println("inside bike service::"+request.toString());
		
	}

}
