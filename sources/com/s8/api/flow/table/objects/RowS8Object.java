package com.s8.api.flow.table.objects;

/**
 * 
 * 
 * A Row object to be store in a table
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public abstract class RowS8Object {

	
	/**
	 * S8 key
	 */
	public final String S8_key;
	
	
	/**
	 * Main constructor
	 * @param id the (final) key for the row
	 */
	public RowS8Object(String id) {
		super();
		this.S8_key = id;
	}
	
	
}
