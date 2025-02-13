package com.s8.api.web;


/**
 * 
 * Base type of the object that can be used to populate the front.
 * 
 * @see S8WebFront
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public class S8WebObject {


	/**
	 * the vertex attached to this object
	 */
	public final S8WebVertex vertex;
	
	
	/**
	 * Main constructor
	 * @param front the front this web object is attached to
	 * @param typeName the type name of this object
	 */
	public S8WebObject(S8WebFront front, String typeName) {
		super();
		
		/* create vertex and assign object to it */
		vertex = front.createVertex(typeName, this);
	}


}
