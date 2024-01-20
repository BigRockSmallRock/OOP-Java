package cp213;

import java.util.Scanner;

/**
 * Class to demonstrate the use of Scanner with a keyboard and File objects.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2022-01-08
 */
public class ScannerTest {

    /**
     * Count lines in the scanned file.
     *
     * @param source Scanner to process
     * @return number of lines in scanned file
     */
    public static int countLines(final Scanner source) {
	int count = 0;

	// your code here
	while (source.hasNextLine()) {
	    source.nextLine();
	    count++;
	}

	return count;
    }

    /**
     * Count tokens in the scanned object.
     *
     * @param source Scanner to process
     * @return number of tokens in scanned object
     */
    public static int countTokens(final Scanner source) {
	int tokens = 0;

	// your code here
	while (source.hasNext()) {
	    source.next();
	    tokens++;
	}

	return tokens;
    }

    /**
     * Ask for and total integers from the keyboard.
     *
     * @param source Scanner to process
     * @return total of positive integers entered from keyboard
     */
    public static int readNumbers(final Scanner keyboard) {
	int total = 0;
	boolean inputQ = false;
	// your code here

	while (inputQ == false) {

	    if (keyboard.hasNextInt()) {
		total = total + keyboard.nextInt();
		keyboard.nextLine();
	    }

	    else if (!keyboard.hasNext("q") && !keyboard.hasNextInt()) {
		System.out.println("'" + keyboard.nextLine() + "' is not an integer or 'q'.");
	    }

	    else {
		inputQ = true;
	    }

	}

	return total;
    }

}
