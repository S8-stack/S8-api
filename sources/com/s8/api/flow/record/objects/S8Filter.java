package com.s8.api.flow.record.objects;

@FunctionalInterface
public interface S8Filter<T> {

	
	/**
	 * 
	 * @param object
	 * @return
	 */
	public boolean isSelected(T object);
	
}
