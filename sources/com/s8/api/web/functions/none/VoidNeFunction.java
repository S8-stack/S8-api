package com.s8.api.web.functions.none;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

@FunctionalInterface
public interface VoidNeFunction extends NeFunction {

	


	/**
	 * 
	 */
	public abstract void run(S8AsyncFlow flow);



}
