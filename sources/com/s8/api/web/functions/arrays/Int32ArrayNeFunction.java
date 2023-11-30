package com.s8.api.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

@FunctionalInterface
public interface Int32ArrayNeFunction extends NeFunction {
	
	public abstract void run(S8AsyncFlow flow, int[] arg);
}
