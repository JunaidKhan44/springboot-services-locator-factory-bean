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
@Service("Truck")
public class TruckService  implements AdapterService<Vehicle> {

	@Override
	public void process(Vehicle request) {
		// TODO Auto-generated method stub
		System.out.println("inside Truck service::"+request.toString());
	}

}
