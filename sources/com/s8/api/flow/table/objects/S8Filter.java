package com.s8.api.flow.table.objects;


/**
 * 
 * A filter class for selection in database.
 * 
 * @author Pierre Convert
 * Copyright (c) 2025, Pierre Convert. All rights reserved.
 * 
 * 
 * @param <T> the type of object to be screened
 */
@FunctionalInterface
public interface S8Filter<T> {

	
	/**
	 * Test to tell if row object should be selected
	 * @param object the object tested
	 * 
	 * @return boolean true if object is selected
	 */
	public boolean isSelected(T object);
	
}
