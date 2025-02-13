package com.s8.api.web;


/**
 * 
 * Main interface representing the front.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public interface S8WebFront {

	
	/**
	 * Create a vertex to be used for {@link S8WebObject}. Vertices form a graph representing the front side.
	 * @param typeName the type name
	 * @param object the object to be attached to this vertex
	 * @return the vertex
	 */
	public S8WebVertex createVertex(String typeName, S8WebObject object);

}
