package com.whitebox.math;

/**
 * <b>This is to write White Box test cases</b><p>
 * <h1>Subtraction class with various methods</h1>
 * <P> This Class has methods to Subtract number and some operations
 * on the Strings.
 * 
 * 
 * @author JALA ACADEMY
 * @version 1.0
 * @since	9-JULY-2022
 *
 */

public class Substraction {
	
	/**
	 * This method is used to Subtract two integers. This is a the simplest form of a
	 * class method, just to show the usage of various javadoc Tags.
	 * 
	 * @param num1
	 *            This is the first parameter to Subtraction  method
	 * @param num2
	 *            This is the second parameter to Subtraction method
	 * @return int This returns difference of num1 and num2
	 */
	// Subtracting two Integer numbers
		public int subtraction(int num1, int num2) {
			int sub = num1 - num2;
			return sub;
		}
		
		/**
		 * This method is used to Subtract three integers.
		 * 
		 * @param num1
		 *            This is the first parameter to Subtraction method
		 * @param num2
		 *            This is the second parameter to Subtraction method
		 * @param num3
		 *            This is the third parameter to Subtraction method
		 * @return int This returns Difference of num1,num2 and num3
		 */

		// Adding three Integer numbers
		public int subtraction(int num1, int num2, int num3) {
			int sub = num1 - num2 - num3;
			return sub;
		}

		/**
		 * This method is used to subtract two double numbers
		 * 
		 * @param d1
		 *            This is the first parameter to subtraction method
		 * @param d2
		 *            This is the second parameter to subtraction method
		 * @return double This returns difference of d1 and d2
		 * @exception IOException On input error
		 * @see IOException
		 * 
		 */

		// Adding two double numbers
		public double subtraction(double d1, double d2) {
			double sub = d1 * d2;
			return sub;
		}
		
		/**
		 * This method is used to Subtract three double numbers
		 * 
		 * @param d1
		 *            This is the first parameter to subtraction method
		 * @param d2
		 *            This is the second parameter to subtraction method
		 * @param d3
		 *            This is the third parameter to subtraction method
		 * 
		 * @return double This returns difference of d1 and d2
		 * @exception IOException On input error
		 * @see IOException
		 * 
		 */
		public double subtraction(double d1, double d2, double d3) {
			double sum = d1 - d2 - d3;
			return sum;
		}
		/**
		 * This method is used to Subtract three double numbers
		 * 
		 * @param d1
		 *            This is the first parameter to subtraction method
		 * @param d2
		 *            This is the second parameter to subtraction method
		 * @param d3
		 *            This is the third parameter to subtraction method
		 * 
		 * @return double This returns difference of d1 and d2
		 * @exception IOException On input error
		 * @see IOException
		 * 
		 */
		public double subtraction(double d1, double d2, double d3) {
			double sum = d1 + d2 - d3;
			return sum;
		}

}

