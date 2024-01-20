package cp213;

/**
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-02
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as
     * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
     * case, spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {

	// your code here
	String str = "";
	String finalStr = "";
	int length = string.length();

	for (int i = 0; i < length; i++) {
	    if (Character.isLetter(string.charAt(i))) {
		str = str + Character.toLowerCase(string.charAt(i));
	    }
	}
	length = str.length();
	for (int i = length - 1; i >= 0; i--) {
	    finalStr = finalStr + str.charAt(i);
	}

	if (finalStr.equals(str)) {
	    return true;
	}

	return false;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {

	// your code here
	int length = name.length();

	if (name.length() == 0) {
	    return false;

	} else if (name.length() == 1 && (!Character.isLetter(name.charAt(0)))) {
	    return false;
	}

	else if (name.length() == 1 && (name.charAt(0) == '_')) {
	    return false;
	}

	else {
	    if (name.charAt(0) == '_') {
		for (int i = 1; i < length; i++) {
		    if (Character.isLetter(name.charAt(i))) {
			return true;
		    }
		}
	    } else if (!Character.isLetter(name.charAt(0))) {
		return false;
	    }
	}

	return true;
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {

	// your code here
	String finalStr = "";
	int length = word.length();

	if (VOWELS.contains("" + word.charAt(0)) == true) {
	    finalStr = word + "way";
	} else {
	    for (int i = 1; i < length; i++) {
		finalStr += word.charAt(i);
	    }

	    finalStr = finalStr + Character.toLowerCase(word.charAt(0)) + "ay";
	    if (Character.isUpperCase(word.charAt(0))) {
		finalStr = Character.toUpperCase(finalStr.charAt(0)) + finalStr.substring(1);
	    }
	}

	return finalStr;
    }

}
