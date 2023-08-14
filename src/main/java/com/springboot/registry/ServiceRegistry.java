/**
 * 
 */
package com.springboot.registry;

/**
 * @author Junaid.Khan
 *
 */
public interface ServiceRegistry {

	public <T> AdapterService<T> getService(String serviceName);
}

