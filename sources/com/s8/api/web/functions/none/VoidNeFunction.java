package com.s8.api.web.functions.none;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;


/**
 * 
 * A Web function on void (for on a click button callback).
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
@FunctionalInterface
public interface VoidNeFunction extends NeFunction {

	
	/**
	 * The function method
	 * @param flow the {@link S8AsyncFlow} flow on which the callback method is run
	 */
	public abstract void run(S8AsyncFlow flow);



}
