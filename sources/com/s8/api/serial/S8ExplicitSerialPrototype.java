package com.s8.api.serial;


/**
 * An explicit serial prototype based on {@code S8SerialPrototype<S>}
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 * @param <S> the Serializable type
 * @see S8SerialPrototype
 */
public interface S8ExplicitSerialPrototype<S extends S8ExplicitSerializable> extends S8SerialPrototype<S> {

	/**
	 * Get the signature of the serializable object.
	 * 
	 * @return the signature of the explicit serial
	 */
	public byte[] getSignature();

}
