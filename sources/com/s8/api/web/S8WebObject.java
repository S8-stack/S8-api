package com.s8.api.web;


/**
 * 
 * @author pierreconvert
 *
 */
public class S8WebObject {


	/**
	 * 
	 */
	public final S8WebVertex vertex;
	
	
	/**
	 * 
	 * @param front
	 * @param typeName
	 */
	public S8WebObject(S8WebFront front, String typeName) {
		super();
		
		/* create vertex and assign object to it */
		vertex = front.createVertex(typeName, this);
	}


}
