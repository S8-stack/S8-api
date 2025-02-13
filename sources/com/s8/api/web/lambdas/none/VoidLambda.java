package com.s8.api.web.lambdas.none;

/**
 * 
 * A Web lambda on an UInt8[] argument (from network). Button callback for
 * instance.
 * 
 * @author Pierre Convert Copyright (C) 2025, Pierre Convert. All rights
 *         reserved.
 *
 */
@FunctionalInterface
public interface VoidLambda {

	/**
	 * The function method
	 * 
	 */
	public void operate();

}
