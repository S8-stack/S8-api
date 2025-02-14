package com.s8.api.bytes;

import java.io.IOException;



/**
 * 
 * <p>
 * /!\ All array or String lengths are encoded as UInt32 to reflect their
 * maximum possible length in JAVA.
 * </p>
 * 
 *
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 * 
 */
public interface ByteOutflow {
	
	
	/**
	 * Default capacity for underlybing buffer. Highly dependent of implementations and purposes. Basic value only.
	 */
	public final static int DEFAULT_CAPACITY = 64;

	
	/**
	 * Set the capacity of the underlying buffer.
	 * @param capacity the capacity of the underlying buffer
	 */
	public void setCapacity(int capacity);
	

	/**
	 * Write bytes array. Auto-feed underlying ByteBuffer as necessary.
	 * @param bytes the bytes to be written
	 * @throws IOException exception while writing to the flow
	 */
	public void putByteArray(byte[] bytes) throws IOException;

	
	/**
	 * Put an array of bytes from an array from a given offset for a given length.
	 * 
	 * @param array the byte array to be pushed to the outlfow
	 * @param offset offset
	 * @param length length to be read of the array argument
	 * @throws IOException exception while writing to the flow
	 */
	public void putByteArray(byte[] array, int offset, int length) throws IOException;

	
	/**
	 * 
	 * @param head
	 * @throws IOException
	 */
	/*
	public default void putBytes(QxBytes head) throws IOException{
		while(head!=null) {
			putByteArray(head.bytes, head.offset, head.length);
			head = head.next;
		}
	}
	*/
	

	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param flags the flags to be wirtten in the outflow
	 * @throws IOException exception while writing to the flow
	 */
	public void putFlags8(boolean[] flags) throws IOException;


	/**
	 * Hack for js part
	 * 
	 * @param value the boolean value to be writtent to the flow
	 * @throws IOException exception while writing to the flow
	 */
	public default void putBool8(boolean value) throws IOException {
		putUInt8(value ? ByteInflow.BOOL8_TRUE : ByteInflow.BOOL8_FALSE);
	}
	

	/**
	 * Directly put byte
	 * @param b the value to write
	 * @throws IOException exception while writing to the flow
	 */
	void putByte(byte b) throws IOException;
	

	
	/**
	 * Put a flexible encoding int to the flow
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt7x(long value) throws IOException;
	
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt8(int value) throws IOException;


	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt16(int value) throws IOException;


	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt24(int value) throws IOException;
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt31(int value) throws IOException;
	
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt32(long value) throws IOException;
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt40(long value) throws IOException;
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt48(long value) throws IOException;
	

	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * This format is adequate to send JAVA long to JS (since JS MAX_INTEGER is 2^53).
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt53(long value) throws IOException;


	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt56(long value) throws IOException;
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putUInt64(long value) throws IOException;

	

	/**
	 * Write value to the flow (Auto-feed underlying ByteBuffer as necessary).
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putInt8(byte value) throws IOException;

	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putInt16(short value) throws IOException;
	
	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putInt32(int value) throws IOException;
	
	
	/**
	 * Push an Int32[] array into the flow. Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value written
	 * @throws IOException the exception rasied in the writing process
	 */
	public default void putInt32Array(int[] value) throws IOException {
		if(value != null) {
			int n = value.length;
			putInt32(n);
			for(int i = 0; i < n; i++) { putInt32(value[i]); }
		}
		else { putInt32(-1); } // null
	}


	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putInt64(long value) throws IOException;
	

	/**
	 * Put value in thr flow
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public default void putInt64Array(long[] value) throws IOException {
		if(value != null) {
			int n = value.length;
			putInt32(n);
			for(int i = 0; i < n; i++) { putInt64(value[i]); }
		}
		else { putInt32(-1); } // null
	}



	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putFloat32(float value) throws IOException;



	/**
	 * Write an float[] array into the flow.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public default void putFloat32Array(float[] value) throws IOException {
		if(value != null) {
			int n = value.length;
			putInt32(n);
			for(int i = 0; i < n; i++) { putFloat32(value[i]); }
		}
		else { putInt32(-1); } // null
	}


	/**
	 * Auto-feed underlying ByteBuffer as necessary.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putFloat64(double value) throws IOException;
	

	
	/**
	 * Write double[] value to the outflow.
	 * @param value the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public default void putFloat64Array(double[] value) throws IOException {
		if(value != null) {
			int n = value.length;
			putInt32(n);
			for(int i = 0; i < n; i++) { putFloat64(value[i]); }
		}
		else { putInt32(-1); } // null
	}



	/**
	 * String is encoded in UTF8.
	 * 
	 * @param str the value to write
	 * @throws IOException exception while writing to the flow
	 */
	public void putStringUTF8(String str) throws IOException;

	
	
}


