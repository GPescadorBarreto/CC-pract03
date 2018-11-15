// TODO: Auto-generated Javadoc
/**
 * The Class PRF.
 */
public class PRF {
	
	/**
	 * Zero.
	 *
	 * @return the int
	 */
	public static int zero() {
		return 0;
	}

	/**
	 * Next number after x.
	 *
	 * @param x the x
	 * @return the 
	 */
	public static int next(int x) {
		return x + 1;
	}

	/**
	 * Adds x and y.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int add(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return next(add(x, y - 1));
		}
	}

	/**
	 * Multiply x by y.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int multiply(int x, int y) {
		if (y == 0) {
			return zero();
		} else {
			return add(x, multiply(x, y - 1));
		}
	}

	/**
	 * Power of x to the y.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int power(int x, int y) {
		if (y == 0) {
			return next(zero());
		} else {
			return multiply(x, power(x, y - 1));
		}
	}

}
