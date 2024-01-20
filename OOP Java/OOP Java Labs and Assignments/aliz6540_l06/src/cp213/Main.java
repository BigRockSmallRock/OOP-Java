package cp213;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
	System.out.println("Test scannerTest");
	System.out.println();
	Scanner keyboard = new Scanner(System.in);
	int total = scannerTest(keyboard);
	keyboard.close();
	System.out.println("Total: " + total);
	System.out.println();

	System.out.print("Test stringPrinter");
	System.out.println();

	try {
	    String output = stringPrinter(5, "*");
	    System.out.println(output);
	    output = stringPrinter(-5, "*");
	    System.out.println(output);
	} catch (Exception e) {
	    System.out.println();
	    System.out.println("getMessage:");
	    System.out.println(e.getMessage());
	    System.out.println();
	    System.out.println("toString:");
	    System.out.println(e.toString());
	    System.out.println();
	    System.out.println("printStackTrace:");
	    e.printStackTrace();
	}
    }

    /**
     * Uses exceptions to capture bad input from a keyboard Scanner.
     *
     * @return The total of all the integers entered.
     */
    public static int scannerTest(final Scanner keyboard) {

	// your code here
	String input = "";
	boolean loop = true;
	int total = 0;

	while (loop) {
	    try {
		System.out.print("Enter an integer ('Quit' to stop): ");
		total += keyboard.nextInt();

	    } catch (InputMismatchException i) {
		input = keyboard.next();

		if (input.equals("Quit")) {
		    loop = false;
		} else {
		    System.out.println("That is not an integer!");
		}
	    }
	}

	return total;

    }

    /**
     * Repeats a string.
     *
     * @param n   Number of times to repeat a string.
     * @param str The string to print.
     * @return The repeated string.
     * @throws Exception If n is negative.
     */
    public static String stringPrinter(int n, String str) throws Exception {

	// your code here
	String repeated = "";

	System.out.println("Print " + str + n + " times");

	try {
	    if (n > 0) {
		for (int i = 0; i < n; i++) {
		    repeated += str;
		}
	    } else {
		throw new Exception("Please Enter a Positive Number! ");
	    }
	}

	catch (Exception i) {
	    throw new Exception(i);
	}

	return repeated;
    }
}
