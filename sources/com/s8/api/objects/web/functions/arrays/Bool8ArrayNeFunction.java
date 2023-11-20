package com.s8.api.objects.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.objects.web.functions.NeFunction;


@FunctionalInterface
public interface Bool8ArrayNeFunction extends NeFunction {
		
	public abstract void operate(S8AsyncFlow flow, boolean[] arg);

}
