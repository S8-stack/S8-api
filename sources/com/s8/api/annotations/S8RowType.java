package com.s8.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 
 * The Type of row.
 *
 * Storage is fixed forever. For evolving the model, create new record (for
 * instance let's say you have an object MyStorage {
 *
 * 
 * <pre>
 * &#64;S8Record(name = "storage-#0001")
 * public class MyStorage {
 * 	public @S8Val String code;
 * 	public @S8Val int quantity;
 * }
 * </pre>
 * 
 * and you want to evolve to:
 * 
 * <pre>
 * &#64;S8Record(name = "storage-#0002")
 * public class MyStorage_0002 {
 * 	public @S8Val String code;
 * 	public @S8Val int quantity;
 * 	public @S8Val float size;
 * }
 * </pre>
 * <p>
 * Then, in this case use lambda <code>MyStorage -> MyStorage_0002</code> to
 * entirely build new objects that will replace the previous ones
 * </p>
 * <p>
 * Since storage format is not supposed to evolve, then we don't need to attach
 * fix
 * 
 *
 * @author Pierre Convert Copyright (C) 2025, Pierre Convert. All rights
 *         reserved.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface S8RowType {

	
	/**
	 * Gove the name of the type of this Row object
	 * @return the typename
	 */
	public String name();

}
