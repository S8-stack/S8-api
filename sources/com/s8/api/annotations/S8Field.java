package com.s8.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * 
 * The field name annotation for the S8 Stack.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface S8Field {

	
	/**
	 * The name of the field
	 * @return the name this field will be bound to
	 */
	public String name();
	
	
	/**
	 * The export value for the field
	 * @return the chosen I/O format for exchanging data
	 */
	public String export() default "(default)";
	
	

}
