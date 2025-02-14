package com.s8.api.exceptions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;



/**
 * 
 * 
 * Build Exception
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public class S8BuildException extends Exception {

	
	/**
	 * the serial UID
	 */
	private static final long serialVersionUID = -3056476425696740047L;

	/**
	 * The involved type
	 */
	private Class<?> type;
	
	
	/**
	 * the involved field
	 */
	private Field field;
	
	
	/**
	 * the involved method
	 */
	private Method method;
	
	
	
	/**
	 * Default S8BuildException constructor
	 * @param message the message
	 */
	public S8BuildException(String message) {
		super(message);
	}
	
	
	/**
	 * S8BuildException constructor
	 * @param message the message
	 * @param type the implied type
	 */
	public S8BuildException(String message, Class<?> type) {
		super(message+"for type: "+type);
		this.type = type;
	}

	
	/**
	 * S8BuildException constructor
	 * @param message the message
	 * @param field the implied field
	 */
	public S8BuildException(String message, Field field) {
		super(message+"for type: "+field);
		this.field = field;
		this.type = field.getDeclaringClass();
	}
	
	
	/**
	 * S8BuildException constructor
	 * @param message the message
	 * @param method the implied method
	 */
	public S8BuildException(String message, Method method) {
		super(message+", for method: "+method);
		this.method = method;
		this.type = method.getDeclaringClass();
	}
	
	
	
	/**
	 * Get cause type
	 * @return the cause type
	 */
	public Class<?> getCauseType(){
		return type;
	}
	
	
	/**
	 * Get cause field
	 * @return the cause field
	 */
	public Field getCauseField(){
		return field;
	}
	
	
	/**
	 * Get cause method
	 * @return the cause method
	 */
	public Method getCauseMethod(){
		return method;
	}
	
	
}
