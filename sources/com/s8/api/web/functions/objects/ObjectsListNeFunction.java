package com.s8.api.web.functions.objects;

import java.util.List;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.NeFunction;


@FunctionalInterface
public interface ObjectsListNeFunction<T extends S8WebObject> extends NeFunction {
	
	
	public abstract void run(S8AsyncFlow flow, List<T> arg);
	
}
