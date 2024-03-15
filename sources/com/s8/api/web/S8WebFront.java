package com.s8.api.web;


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
	public S8WebVertex createVertex(String typeName, S8WebObject object);

}
