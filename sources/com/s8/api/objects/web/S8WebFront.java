package com.s8.api.objects.web;


/**
 * 
 * @author pierreconvert
 *
 */
public interface S8WebFront {

	
	/**
	 * 
	 * @param typeName
	 * @param object
	 * @return
	 */
	public S8WebVertex createVertex(String typeName, S8WebFrontObject object);

}
