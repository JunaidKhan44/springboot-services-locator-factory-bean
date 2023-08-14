/**
 * 
 */
package com.springboot.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.registry.ServiceRegistry;

/**
 * @author Junaid.Khan
 *
 */
@Configuration
public class VehicleConfig {

	
	@Bean
	public FactoryBean<?> factoryBean(){
		final ServiceLocatorFactoryBean bean=new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(ServiceRegistry.class);
		return bean;
	}
}
