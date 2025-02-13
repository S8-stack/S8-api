package com.s8.api.web.functions.objects;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.NeFunction;

/**
 * 
 * 
 * A Web function on an {@link S8WebObject} object.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 * @param <T> the type of  {@link S8WebObject} on which we apply the <code>run</code> method.
 *
 */
@FunctionalInterface
public interface ObjectNeFunction<T extends S8WebObject> extends NeFunction {

	
	/**
	 * The function method
	 * @param flow the {@link S8AsyncFlow} flow on which the callback method is run
	 * @param arg the argurment passed from the front side
	 */
	public abstract void run(S8AsyncFlow flow, T arg);
	
	
}
