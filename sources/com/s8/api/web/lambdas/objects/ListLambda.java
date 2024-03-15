package com.s8.api.web.lambdas.objects;

import java.util.List;

import com.s8.api.web.S8WebObject;



public interface ListLambda<T extends S8WebObject> {

	public void operate(List<T> arg);
}
