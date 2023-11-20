package com.s8.api.objects.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.objects.web.functions.NeFunction;

@FunctionalInterface
public interface Int16ArrayNeFunction extends NeFunction {
	
	
	/**
	 * 
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, int[] arg);
	
}
