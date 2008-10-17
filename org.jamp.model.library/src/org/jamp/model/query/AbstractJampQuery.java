package org.jamp.model.query;

public abstract class AbstractJampQuery implements IJampQuery {

	/**
	 * Compose two specifications into an AND composite specification.
	 * 
	 * @param other
	 *            the specification to be composed to this
	 * @return the resulted specification
	 */
	public IJampQuery and(IJampQuery other) {
		return new AndSpecification(this, other);
	}

	/**
	 * Compose two specifications into an OR composite specification.
	 * 
	 * @param other
	 *            the specification to be composed to this
	 * @return the resulted specification
	 */
	public IJampQuery or(IJampQuery other) {
		return new OrSpecification(this, other);
	}

	/**
	 * Negate a specification.
	 * 
	 * @return the resulted specification
	 */
	public IJampQuery not() {
		return new NotSpecification(this);
	}

	/**
	 * Compose two specifications into an AND composite specification.
	 */
	public class AndSpecification extends AbstractJampQuery {

		IJampQuery _one;

		IJampQuery _other;

		public AndSpecification(IJampQuery one, IJampQuery other) {
			_one = one;
			_other = other;
		}

		public boolean isSatisfiedBy(Object candidate) {
			return _one.isSatisfiedBy(candidate)
					&& _other.isSatisfiedBy(candidate);
		}
	}

	/**
	 * Compose two specifications into an OR composite specification.
	 */
	public class OrSpecification extends AbstractJampQuery {

		IJampQuery _one;

		IJampQuery _other;

		public OrSpecification(IJampQuery one, IJampQuery other) {
			_one = one;
			_other = other;
		}

		public boolean isSatisfiedBy(Object candidate) {
			return _one.isSatisfiedBy(candidate)
					|| _other.isSatisfiedBy(candidate);
		}
	}

	/**
	 * Add a NOT to a specification.
	 */
	public class NotSpecification extends AbstractJampQuery {

		IJampQuery _one;

		public NotSpecification(IJampQuery one) {
			_one = one;
		}

		public boolean isSatisfiedBy(Object candidate) {
			return !_one.isSatisfiedBy(candidate);
		}
	}

}
