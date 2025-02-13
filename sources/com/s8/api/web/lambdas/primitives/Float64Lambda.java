package com.s8.api.web.lambdas.primitives;



/**
 * 
 * 
 * A Web lambda on an Float64 argument (from network).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface Float64Lambda {

	
	/**
	 * The function method
	 * @param arg the argurment passed from the front side
	 */
	public void operate(double arg);
	
}
