package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-02
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
	boolean result = true;
	int length = str.length();

	for (int i = 0; i < length; i++) {
	    if (Character.isDigit(str.charAt(i)) == false) {
		return false;
	    }
	}

	return result;
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
	boolean valid = true;
	int length = sn.length();

	if (length == 11) {
	    if (sn.charAt(0) != 'S' && sn.charAt(1) != 'N' && sn.charAt(2) != '/') {
		return false;
	    }

	    for (int i = 3; i < 6; i++) {
		if (Character.isDigit(sn.charAt(i)) == false) {
		    return false;
		}
	    }

	    if (sn.charAt(7) != '-') {
		return false;
	    }

	    for (int i = 8; i < 10; i++) {
		if (Character.isDigit(sn.charAt(i)) == false) {
		    return false;
		}
	    }

	}

	else {
	    return false;
	}

	return valid;
    }

    /**
     * Evaluates serial numbers from a file. Writes valid serial numbers to
     * good_sns, and invalid serial numbers to bad_sns.
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
