package com.whitebox.math;

/**
 * <b>This is to write White Box test cases</b><p>
 * <h1>Multiplication class with various methods</h1>
 * <P> This Class has methods to add number and some operations
 * on the Strings.
 * 
 * 
 * @author JALA ACADEMY
 * @version 1.0
 * @since	9-JULY-2022
 *
 */
public class Division {

	/**
	 * This method is used to Divide two integers. This is a the simplest form of a
	 * class method, just to show the usage of various javadoc Tags.
	 * 
	 * @param num1
	 *            This is the first parameter to Division method
	 * @param num2
	 *            This is the second parameter to Division method
	 * @return int This returns sum of num1 and num2
	 */
	// Adding two Integer numbers
	public int addition(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	/**
	 * This method is used to Divide three integers.
	 * 
	 * @param num1
	 *            This is the first parameter to Division method
	 * @param num2
	 *            This is the second parameter to Division method
	 * @param num3
	 *            This is the third parameter to Division method
	 * @return int This returns sum of num1 and num2
	 */

	// Adding three Integer numbers
	public int addition(int num1, int num2, int num3) {
		int div = num1 / num2 * num3;
		return div;
	}

	/**
	 * This method is used to Divide two double numbers
	 * 
	 * @param d1
	 *            This is the first parameter to Division method
	 * @param d2
	 *            This is the second parameter to Division method
	 * @return double This returns sum of d1 and d2
	 * @exception IOException On input error
	 * @see IOException
	 * 
	 */

	// Adding two double numbers
	public double addition(double d1, double d2) {
		double mul = d1 * d2;
		return mul;
	}

	/**
	 * This method is used to Divide three double numbers
	 * 
	 * @param d1
	 *            This is the first parameter to Division method
	 * @param d2
	 *            This is the second parameter to Division method
	 * @param d3
	 *            This is the third parameter to Division method
	 * 
	 * @return double This returns sum of d1 and d2
	 * @exception IOException On input error
	 * @see IOException
	 * 
	 */
	public double addition(double d1, double d2, double d3) {
		double mul = d1 / d2 / d3;
		return mul;
	}
	/**
	 * This method is used to Divide three double numbers
	 * 
	 * @param d1
	 *            This is the first parameter to Division method
	 * @param d2
	 *            This is the second parameter to Division method
	 * @param d3
	 *            This is the third parameter to Division method
	 * 
	 * @return double This returns sum of d1 and d2
	 * @exception IOException On input error
	 * @see IOException
	 * 
	 */
	public double addition(double d4, double d5, double d6) {
		double mul = d4 / d5 / d6;
		return mul;
	}


}
