package com.s8.api.web;

import java.util.List;

import com.s8.api.serial.S8ExplicitSerializable;


public interface S8WebVertexOutbound {


	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setBool8Field(String name, boolean value);

	


	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setBool8ArrayField(String name, boolean[] value);

	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt8Field(String name, int value);

	

	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt8ArrayField(String name, int[] value);



	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt16Field(String name, int value);

	
	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt16ArrayField(String name, int[] value);

	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt32Field(String name, long value);
	
	
	

	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt32ArrayField(String name, long[] value);
	
	
	


	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setUInt64Field(String name, long value);
	

	

	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setInt8Field(String name, int value);
	
	


	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setInt16Field(String name, int value);


	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setInt32Field(String name, int value);
	

	
	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setInt64Field(String name, long value);


	

	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setInt64ArrayField(String name, long[] value);

	
	

	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setFloat32Field(String name, float value);


	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setFloat32ArrayField(String name, float[] value);



	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setFloat64Field(String name, double value);


	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setFloat64ArrayField(String name, double[] value);

	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setStringUTF8Field(String name, String value);



	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setStringUTF8ArrayField(String name, String[] value);
	
	
	/**
	 * 
	 * @param name
	 * @param value
	 * @throws NeException 
	 * @throws S8WebException 
	 */
	public <S extends S8ExplicitSerializable> void setSerializableField(String name, S value);



	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public <S extends S8ExplicitSerializable> void setExplicitSerializableArrayField(String name, S[] value);


	/**
	 * 
	 * @param <T>
	 * @param name
	 * @param value
	 */
	public <T extends S8WebObject> void setObjectField(String name, T value);


	


	public <T extends S8WebObject> void setObjectListField(String name, List<T> value);
	
	public <T extends S8WebObject> void setObjectListField(String name, T[] value);
	
	
	public <T extends S8WebObject> void setObjectListField(String name, T singleValue);

	
	
}
