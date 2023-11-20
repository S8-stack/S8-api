package com.s8.api.objects.web;


/**
 * 
 * @author pierreconvert
 *
 */
public class S8WebFrontObject {


	/**
	 * 
	 */
	public final S8WebVertex vertex;
	
	
	/**
	 * 
	 * @param front
	 * @param typeName
	 */
	public S8WebFrontObject(S8WebFront front, String typeName) {
		super();
		
		/* create vertex and assign object to it */
		vertex = front.createVertex(typeName, this);
	}


}
