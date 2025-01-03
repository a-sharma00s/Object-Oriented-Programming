package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Your name and id here
 * @version 2023-05-23
 */
public class SerialNumber {

    /**
     * Determines if a string contains all digits.
     *
     * @param str The string to test.
     * @return true if str is all digits, false otherwise.
     */
    public static boolean allDigits(final String str) {

	// your code here
    	boolean strDigits = true;
    	// iterate through the entire string
    	for (int i = 0; i < str.length(); i++) {
    		// check if char at specific index is a digit
    		if (!Character.isDigit(str.charAt(i))) {
    			strDigits = false;
    		}
    	}

	return strDigits;
    }

    /**
     * Determines if a string is a good serial number. Good serial numbers are of
     * the form 'SN/nnnn-nnn', where 'n' is a digit.
     *
     * @param sn The serial number to test.
     * @return true if the serial number is valid in form, false otherwise.
     */
    public static boolean validSn(final String sn) {

	// your code here
    	boolean validSerialNum = true;
    	// go through cases where number may not be valid
    	if (sn.length() < 11) {
    		validSerialNum = false;
    	}
    	else if (!sn.startsWith("SN/")) {
    		validSerialNum = false;
    	}
    	else if(sn.charAt(7) != '-') {
    		validSerialNum = false;
    	}

	return validSerialNum;
    }

    /**
     * Evaluates serial numbers from a file. Writes valid serial numbers to
     * good_sns, and invalid serial numbers to bad_sns. Each line of fileIn contains
     * a (possibly valid) serial number.
     *
     * @param fileIn  a file already open for reading
     * @param goodSns a file already open for writing
     * @param badSns  a file already open for writing
     */
    public static void validSnFile(final Scanner fileIn, final PrintStream goodSns, final PrintStream badSns) {

	// your code here

	return;
    }

}