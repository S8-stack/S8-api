package com.s8.api.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;



/**
 * 
 * A web function on Bool8 Array.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface Bool8ArrayNeFunction extends NeFunction {
		
	/**
	 * The function method
	 * @param flow the {@link S8AsyncFlow} flow on which the callback method is run
	 * @param arg the argurment passed from the front side
	 */
	public abstract void operate(S8AsyncFlow flow, boolean[] arg);

}
