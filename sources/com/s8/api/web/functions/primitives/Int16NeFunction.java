package com.s8.api.web.functions.primitives;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;



/**
 * 
 * A Web function on an Int16 argument (from network).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface Int16NeFunction extends NeFunction {
	
	
	/**
	 * The function method
	 * @param flow the {@link S8AsyncFlow} flow on which the callback method is run
	 * @param arg the argurment passed from the front side
	 */
	public abstract void run(S8AsyncFlow flow, int arg);
}
