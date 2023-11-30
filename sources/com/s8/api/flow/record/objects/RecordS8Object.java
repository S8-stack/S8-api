package com.s8.api.flow.record.objects;

/**
 * 
 * @author pierreconvert
 *
 */
public abstract class RecordS8Object {

	
	/**
	 * 
	 */
	public final String S8_key;
	
	
	/**
	 * 
	 * @param id
	 */
	public RecordS8Object(String id) {
		super();
		this.S8_key = id;
	}
	
	
}
