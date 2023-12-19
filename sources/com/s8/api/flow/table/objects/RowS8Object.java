package com.s8.api.flow.table.objects;

/**
 * 
 * @author pierreconvert
 *
 */
public abstract class RowS8Object {

	
	/**
	 * S8 key
	 */
	public final String S8_key;
	
	
	/**
	 * 
	 * @param id
	 */
	public RowS8Object(String id) {
		super();
		this.S8_key = id;
	}
	
	
}
