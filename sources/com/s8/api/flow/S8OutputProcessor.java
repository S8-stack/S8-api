package com.s8.api.flow;


/**
 * 
 * A generic output processor.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 * @param <T> type to be processed on callback
 *
 */
@FunctionalInterface
public interface S8OutputProcessor<T> {

	
	/**
	 * The function method
	 * @param arg the argument to be processed
	 */
	public void run(T arg);
	
}
