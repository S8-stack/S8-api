package com.s8.api.web.lambdas.objects;

import java.util.List;

import com.s8.api.web.S8WebFrontObject;



public interface ListLambda<T extends S8WebFrontObject> {

	public void operate(List<T> arg);
}
