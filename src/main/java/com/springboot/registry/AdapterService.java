/**
 * 
 */
package com.springboot.registry;

/**
 * @author Junaid.Khan
 *
 */
public interface AdapterService<T> {

	public void process(T request);
}
