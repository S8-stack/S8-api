package com.s8.api.serial;

/**
 * Can parse from a <code>ByteInflow</code> and compose to a <code>ByteOutflow</code>.
 * Only limited to predefined types
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
public interface S8ExplicitSerializable extends S8Serializable {



	@Override
	public abstract S8ExplicitSerialPrototype<?> getSerialPrototype();
	
	
	
}