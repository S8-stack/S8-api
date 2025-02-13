package com.s8.api.web;

import java.util.List;

import com.s8.api.serial.S8ExplicitSerializable;

/**
 * 
 * The vertex outbound side.
 * 
 * @author Pierre Convert Copyright (C) 2025, Pierre Convert. All rights
 *         reserved.
 *
 */
public interface S8WebVertexOutbound {

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setBool8Field(String name, boolean value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setBool8ArrayField(String name, boolean[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt8Field(String name, int value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt8ArrayField(String name, int[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt16Field(String name, int value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt16ArrayField(String name, int[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt32Field(String name, long value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt32ArrayField(String name, long[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setUInt64Field(String name, long value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setInt8Field(String name, int value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setInt16Field(String name, int value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setInt32Field(String name, int value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setInt64Field(String name, long value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setInt64ArrayField(String name, long[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setFloat32Field(String name, float value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setFloat32ArrayField(String name, float[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setFloat64Field(String name, double value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setFloat64ArrayField(String name, double[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setStringUTF8Field(String name, String value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 */
	public void setStringUTF8ArrayField(String name, String[] value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <S>   The serialized type
	 */
	public <S extends S8ExplicitSerializable> void setSerializableField(String name, S value);

	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <S>   The serialized type
	 */
	public <S extends S8ExplicitSerializable> void setExplicitSerializableArrayField(String name, S[] value);

	
	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <S>   The serialized type
	 */
	public <S extends S8ExplicitSerializable> void setExplicitSerializableArrayField(String name, List<S> value);

	
	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <T>   The S8WebObjectType type
	 */
	public <T extends S8WebObject> void setObjectField(String name, T value);

	
	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <T>   The S8WebObjectType type
	 */
	public <T extends S8WebObject> void setObjectListField(String name, List<T> value);

	
	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <T>   The S8WebObjectType type
	 */
	public <T extends S8WebObject> void setObjectListField(String name, T[] value);

	
	/**
	 * Set the value of field whose name is equal to the name arg on the remote
	 * front object this vertex outbound is linked to.
	 * 
	 * @param name  the name of the field in the remote front object
	 * @param value the new value to be assigned to the field
	 * @param <T>   The S8WebObjectType type
	 */
	public <T extends S8WebObject> void setObjectListField(String name, T value);

}
