package com.s8.api.serial;


/**
 * 
 * @param <S>
 */
public interface S8ExplicitSerialPrototype<S extends S8ExplicitSerializable> extends S8SerialPrototype<S> {

	/**
	 * 
	 * @return the signature of the explicit serial
	 */
	public byte[] getSignature();

}
