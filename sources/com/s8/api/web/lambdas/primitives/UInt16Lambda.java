package com.s8.api.web.lambdas.primitives;


/**
 * 
 * 
 * A Web lambda on an UInt16 argument (from network).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface UInt16Lambda {

	/**
	 * The function method
	 * @param arg the argurment passed from the front side
	 */
	public void operate(int arg);
}
