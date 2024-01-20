package cp213;

/**
 * Sample string methods.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-01-25
 */
public class StringMethods {
    // Constants
    /**
     * String of vowels.
     */
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Counts the number of vowels in a string. Does not include 'y'.
     *
     * @param string A string.
     * @return Number of vowels in string.
     */
    public static int vowelCount(final String string) {
	int count = 0;

	// your code here

	for (int i = 0; i < string.length(); i++) {
	    String isVowel = "" + string.charAt(i);
	    if (VOWELS.contains(isVowel)) {
		count++;
	    }

	}
	return count;
    }

    /**
     * Counts the number of digits in a string.
     *
     * @param string A string.
     * @return Number of digits in string.
     */
    public static int digitCount(final String string) {
	int count = 0;

	// your code here
	for (int i = 0; i < string.length(); i++) {
	    if (Character.isDigit(string.charAt(i))) {
		count++;
	    }

	}

	return count;
    }

    /**
     * Totals the individual digits in a string.
     *
     * @param string A string.
     * @return The integer total of all individuals digits in string.
     */
    public static int totalDigits(final String string) {
	int total = 0;

	// your code here
	for (int i = 0; i < string.length(); i++) {
	    if (Character.isDigit(string.charAt(i))) {
		total -= '0' - string.charAt(i);
	    }

	}

	return total;
    }

    /**
     * Compares string1 and string2 and returns a comma-delimited concatenated
     * string consisting of the string that is first lexically followed by the
     * string that is second lexically. If the strings are equal, then only string1
     * is returned.
     *
     * @param string1 String to compare against string2.
     * @param string2 String to compare against string1.
     * @return A concatenation of string1 and string2 in order.
     */
    public static String pairs(String string1, String string2) {
	String line = null;

	// your code here
	if (string2.equals(string1)) {
	    line = string1;
	}

	else if (string2.compareTo(string1) > 0) {
	    line = string1 + ',' + string2;
	}

	else {
	    line = string2 + ',' + string1;
	}

	return line;
    }

    /**
     * Finds the distance between the s1 and s2. The distance between two strings of
     * the same length is the number of positions in the strings at which their
     * characters are different. If two strings are not the same length, the
     * distance is unknown (-1). If the distance is zero, then two strings are
     * equal.
     *
     * @param string1 String to compare against string2.
     * @param string2 String to compare against string1.
     * @return The distance between string1 and string2.
     */
    public static int stringDistance(String string1, String string2) {
	int distance = 0;

	// your code here

	if (string1.length() == string2.length()) {
	    for (int i = 0; i < string1.length(); i++) {
		String str1 = "" + string1.charAt(i);
		String str2 = "" + string2.charAt(i);
		boolean isEqual = (str1.equals(str2));

		if (isEqual == false) {
		    distance++;
		}
	    }

	} else {
	    distance = -1;
	}

	return distance;
    }
}
