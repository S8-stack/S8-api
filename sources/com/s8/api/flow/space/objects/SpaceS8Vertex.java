package com.s8.api.flow.space.objects;

import com.s8.api.exceptions.S8IOException;
import com.s8.api.web.S8WebFront;


/**
 * Vertex for Space Objects
 * 
 * @see S8WebFront
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 */
public interface SpaceS8Vertex {

	
	/**
	 * Use this method to report changes
	 * 
	 * @param fieldName the name of field (annotation-related) to report an update on.
	 * @throws S8IOException the exception raised
	 */
	public void reportChange(String fieldName) throws S8IOException;

}
