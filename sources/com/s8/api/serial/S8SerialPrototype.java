package com.s8.api.serial;

import java.io.IOException;

import com.s8.api.bytes.ByteInflow;

/**
 * <p>
 * <b>Important explanation on why it's coded that way</b>.
 * </p>
 * <p>
 * Assume you have a -slightly- complex ByteOutflowable object: it's called
 * <code>ThFluid</code> and it contains all properties of a given fluid. Let's
 * ay that they are limite nb of fluids (air, water, methane, etc.) so that you
 * can simply assign a number to them (CAS number in real life). The trick is
 * that there is multiple types of fluids (like for instance
 * <code>ImcompressibleFluid</code> or <code>PerfetGasThFluid</code>, eah
 * bringing it's own formula, equation of state and so on. So when reading the
 * encoding of the fluid, there is a rot switch that will call sub-factories (on
 * specialized on perfect gas, another one in incompressible fluid, etc.).
 * </p>
 * <p>
 * That being said, say you are now building a parsing/composing engine for
 * serilization/persistency or whatever. You stumble on a field which has a type
 * that actually implementts the <code>ByteOutflowable</code> interface, but it
 * MUST have a method to indicate the PROPER factory to be used for
 * deserializing this type of field. In the case described in previous
 * paragraph, the factory cannot be a constant of for instance
 * <code>ImcompressibleFluid</code> since type parsing may need to be done at an
 * higher level (for instance <code>ThFluid</code>) to enable the possibility to
 * switch dynamically between differnt types of fluid with a unified encoding
 * (for instance first type gives the type of fluid and allows to switch to a
 * give factory, then each factory will continue to read bytes, each one havong
 * it's own byte pattern). If relying on constant fields, override is extremly
 * painful since we cannot select from a specific class the right factory. For
 * instance tf the type of the fiekd is simply Impcoressible, we might want to
 * restrain encoding to simply the one give by this specific factory.
 * </p>
 * 
 * @param <S> The serializable type
 */
public interface S8SerialPrototype<S extends S8Serializable> {

	/**
	 * deserialize object from the {@link ByteInflow} byte inflow.
	 * @param inflow the inflow
	 * @return The deserialized object
	 * @throws IOException the raised exception when deserializing
	 */
	public abstract S deserialize(ByteInflow inflow) throws IOException;

	/**
	 * Compare two objects to determine if there are deltas.
	 * @param left  left object for comparison
	 * @param right right object for comparison
	 * @return true if there is a delta/difference.
	 */
	public abstract boolean hasDelta(S left, S right);

	/**
	 * Get serial type
	 * @return the class of the objects represented by this prototype
	 */
	public abstract Class<?> getSerialType();

}
