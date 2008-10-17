package org.jamp.model.query;

public interface IJampQuery {

	/**
	 * Does the supplied object match the specification.
	 * 
	 * @param obj
	 *            to be tested.
	 * @return true if the object passes the test.
	 */
	boolean isSatisfiedBy(Object obj);

	/**
	 * Compose two specifications into an AND composite specification.
	 * 
	 * @param other
	 *            the specification to be composed to this
	 * @return the resulted specification
	 */
	IJampQuery and(IJampQuery other);

	/**
	 * Compose two specifications into an OR composite specification.
	 * 
	 * @param other
	 *            the specification to be composed to this
	 * @return the resulted specification
	 */
	IJampQuery or(IJampQuery other);

	/**
	 * Negate a specification.
	 * 
	 * @return the resulted specification
	 */
	IJampQuery not();

}
