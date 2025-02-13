package com.s8.api.flow;


/**
 * 
 * An simple Runnable block (most basic task of the {@code S8AsyncFlow}).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 * @see S8AsyncFlow
 */
@FunctionalInterface
public interface S8CodeBlock {

	
	/**
	 * The function method
	 */
	public void run();
	
}
