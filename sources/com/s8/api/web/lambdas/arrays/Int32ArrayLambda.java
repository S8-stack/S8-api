package com.s8.api.web.lambdas.arrays;



/**
 * 
 * A Web lambda on an Int32[] argument (from network).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface Int32ArrayLambda {

	/**
	 * The function method
	 * @param arg the argurment passed from the front side
	 */
	public void operate(int[] arg);
}
