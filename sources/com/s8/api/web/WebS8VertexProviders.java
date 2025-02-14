package com.s8.api.web;

import com.s8.api.flow.delivery.S8WebResourceGenerator;


/**
 * Base module for providers inside the vertex.
 * 
 * @see S8WebVertex
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public interface WebS8VertexProviders {



	/**
	 * Get the resource generator
	 * 
	 * @param ordinal the ordinal (index) of the generator
	 * @return the ressource generator
	 */
	public S8WebResourceGenerator getGenerator(int ordinal);
	

	
	/**
	 * Set Providers
	 * 
	 * @param name the name attached to the feature
	 * @param generator the ressource generator attached
	 */
	public void setRawProvider(String name, S8WebResourceGenerator generator);

	
}
