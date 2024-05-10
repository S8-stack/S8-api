package com.s8.api.serial;

import java.io.IOException;

import com.s8.api.bytes.ByteOutflow;



/**
 * Can parse from a <code>ByteInflow</code> and compose to a <code>ByteOutflow</code>.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
public interface S8Serializable {


	


	/**
	 * 
	 * @param outflow
	 * @throws IOException
	 */
	public void serialize(ByteOutflow outflow) throws IOException;
	
	
	/**
	 * 
	 * @param <S>
	 * @return
	 */
	public abstract S8SerialPrototype<?> getSerialPrototype();
	
	
	/**
	 * return a proxy of memory footprint
	 * @return
	 */
	public long computeFootprint();
	
	
	/**
	 * 
	 * @return
	 */
	public S8Serializable deepClone();

	
	
	
}