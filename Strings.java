package com.whitebox.string;

public class Strings {

	
	/**
	 * This method is used to append two strings
	 * 
	 * @param str1
	 *            This is the first paramter to addition method
	 * @param str2
	 *            This is the second parameter to addition method
	 * @return String This returns the string after merging str1 and str2
	 * @exception IOException On input error
	 * @see IOException
	 * 
	 */

	public String addition(String str1, String str2) {
		String str = str1 + str2;
		return str;
	}

	/**
	 * This method is used to find the length of the String
	 * 
	 * @param str
	 *            This is the first paramter to stringLength method
	 * 
	 * @return int This returns the lenght of the given string
	 * @exception IOException On input error
	 * @see IOException
	 */

	public int stringLength(String str) {
		return (str.length());
	}

	/**
	 * This method is used to find the first character of the String
	 * 
	 * @param str
	 *            This is the first paramter to stringFirstCharacter method
	 * 
	 * @return char This returns first character of the String
	 * @exception IOException On input error
	 * @see IOException
	 */
	
	public char StringFirstLetter(String str) {
		char c = str.charAt(0);
		return c;
	}

}
