package com.s8.api.web.lambdas.primitives;


/**
 * 
 * A Lambda expression operating on an int which has been converted from UInt64 generic format 
 * (Either transmitted through network or read in a persistency module).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface UInt64Lambda {

	

	/**
	 * The function method
	 * @param arg the argurment passed from the front side
	 */
	public void operate(long arg);
	
}

