package com.s8.api.web.lambdas.arrays;

/**
 * 
 * A Web lambda on an Int64[] argument (from network).
 * 
 * @author Pierre Convert Copyright (C) 2025, Pierre Convert. All rights
 *         reserved.
 *
 */
@FunctionalInterface
public interface Int64ArrayLambda {

	/**
	 * The function method
	 * 
	 * @param arg the argurment passed from the front side
	 */
	public void operate(long[] arg);
}
