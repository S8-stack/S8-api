package com.s8.api.web.functions.primitives;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

@FunctionalInterface
public interface Int64NeFunction extends NeFunction {
	

	/**
	 * 
	 * @param flow
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, long arg);
}
