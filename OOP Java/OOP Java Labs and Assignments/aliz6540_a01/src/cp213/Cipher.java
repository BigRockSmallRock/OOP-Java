package cp213;

/**
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-02
 */
public class Cipher {
    // Constants
    public static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int ALPHA_LENGTH = ALPHA.length();

    /**
     * Encipher a string using a shift cipher. Each letter is replaced by a letter
     * 'n' letters to the right of the original. Thus for example, all shift values
     * evenly divisible by 26 (the length of the English alphabet) replace a letter
     * with itself. Non-letters are left unchanged.
     *
     * @param s string to encipher
     * @param n the number of letters to shift
     * @return the enciphered string in all upper-case
     */
    public static String shift(final String s, final int n) {

	// your code here
	int stringLength = s.length();
	int inAlpha;
	int overflow;
	char newChar;
	String finalStr = "";

	if (n <= 0) {
	    return s;
	}

	for (int i = 0; i < stringLength; i++) {
	    char curr = s.charAt(i);

	    if (Character.isLetter(curr) == true) {
		inAlpha = ALPHA.indexOf(Character.toUpperCase(curr));

		if ((inAlpha + n) < ALPHA_LENGTH) {
		    if (n > (ALPHA_LENGTH - inAlpha)) {
			newChar = ALPHA.charAt((n - (ALPHA_LENGTH - inAlpha)));
			finalStr += newChar;
		    }

		    else {
			newChar = ALPHA.charAt(inAlpha + n);
			finalStr += newChar;
		    }
		}

		else {

		    overflow = n % ALPHA_LENGTH;

		    if (ALPHA_LENGTH - inAlpha <= overflow) {
			newChar = ALPHA.charAt(overflow - (ALPHA_LENGTH - inAlpha));
			finalStr += newChar;
		    }

		    else {
			newChar = ALPHA.charAt((inAlpha + overflow));
			finalStr += newChar;
		    }

		}
	    }

	}

	return finalStr;
    }

    /**
     * Encipher a string using the letter positions in ciphertext. Each letter is
     * replaced by the letter in the same ordinal position in the ciphertext.
     * Non-letters are left unchanged. Ex:
     *
     * <pre>
    Alphabet:   ABCDEFGHIJKLMNOPQRSTUVWXYZ
    Ciphertext: AVIBROWNZCEFGHJKLMPQSTUXYD
     * </pre>
     *
     * A is replaced by A, B by V, C by I, D by B, E by R, and so on. Non-letters
     * are ignored.
     *
     * @param s          string to encipher
     * @param ciphertext ciphertext alphabet
     * @return the enciphered string in all upper-case
     */
    public static String substitute(final String s, final String ciphertext) {

	// your code here
	String finalStr = "";
	int stringLength = s.length();
	for (int i = 0; i < stringLength; i++) {
	    char curr = ciphertext.charAt(ALPHA.indexOf(s.charAt(i)));
	    finalStr += curr;
	}

	return finalStr;
    }

}
