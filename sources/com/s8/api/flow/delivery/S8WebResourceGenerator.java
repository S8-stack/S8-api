package com.s8.api.flow.delivery;



/**
 * A resource generator (on-the-fly resource serving)
 */
@FunctionalInterface
public interface S8WebResourceGenerator {

	/**
	 * Generate a resource
	 * 
	 * @return the resource
	 * @throws Exception exception
	 */
	public S8WebResource generate() throws Exception;
	
	
}
