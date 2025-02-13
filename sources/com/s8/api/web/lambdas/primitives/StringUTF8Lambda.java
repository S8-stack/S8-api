package com.s8.api.web.lambdas.primitives;


/**
 * 
 * 
 * A Web lambda on a String UTF8 argument (from network).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface StringUTF8Lambda {

	
	/**
	 * The function method
	 * @param arg the argurment passed from the front side
	 */
	public void operate(String arg);
}
