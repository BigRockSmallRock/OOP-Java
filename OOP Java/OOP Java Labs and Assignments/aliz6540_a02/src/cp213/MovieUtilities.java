package cp213;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utilities for working with Movie objects.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-16
 */
public class MovieUtilities {

    /**
     * Counts the number of movies in each genre given in Movie.GENRES. An empty
     * movies list should produce a count array of: [0,0,0,0,0,0,0,0,0,0,0]
     *
     * @param movies List of movies.
     * @return Number of genres across all Movies. One entry for each genre in the
     *         Movie.GENRES array.
     */
    public static int[] genreCounts(final ArrayList<Movie> movies) {

	// your code here
	int length = Movie.GENRES.length;
	int[] counter = new int[length];
	String genre;

	for (Movie movie : movies) {
	    genre = movie.genreToName();
	    for (int i = 0; i < length; i++) {
		if (Movie.GENRES[i].equals(genre)) {
		    counter[i]++;
		}
	    }
	}

	return counter;
    }

    /**
     * Creates a Movie object by requesting data from a user. Uses the format:
     *
     * <pre>
    Title:
    Year:
    Director:
    Rating:
    Genres:
    0: science fiction
    1: fantasy
    ...
    10: mystery
    
    Enter a genre number:
     * </pre>
     *
     * @param keyboard A keyboard (System.in) Scanner.
     * @return A Movie object.
     */
    public static Movie getMovie(final Scanner keyboard) {

	// your code here
	System.out.print("Title: ");
	String title = keyboard.nextLine();

	System.out.print("Year: ");
	int year = keyboard.nextInt();
	keyboard.nextLine();

	System.out.print("Director: ");
	String director = keyboard.nextLine();

	System.out.print("Rating: ");
	double rating = keyboard.nextDouble();
	keyboard.nextLine();

	System.out.print("\n");
	System.out.println(Movie.genresMenu());
	System.out.print("Enter a genre number: ");
	int genre = keyboard.nextInt();
	keyboard.nextLine();

	return new Movie(title, year, director, rating, genre);
    }

    /**
     * Creates a list of Movies whose genre is equal to the genre parameter.
     *
     * @param movies List of movies.
     * @param genre  Genre to compare against.
     * @return List of movies of genre.
     */
    public static ArrayList<Movie> getByGenre(final ArrayList<Movie> movies, final int genre) {

	// your code here
	ArrayList<Movie> movieGenre = new ArrayList<Movie>();

	for (Movie movie : movies) {

	    if (movie.getGenre() == genre) {
		movieGenre.add(movie);
	    }
	}

	return movieGenre;
    }

    /**
     * Creates a list of Movies whose ratings are equal to or higher than rating.
     *
     * @param movies List of movies.
     * @param rating Rating to compare against.
     * @return List of movies of rating or higher.
     */
    public static ArrayList<Movie> getByRating(final ArrayList<Movie> movies, final double rating) {

	// your code here
	ArrayList<Movie> movieRating = new ArrayList<Movie>();

	for (Movie movie : movies) {

	    if (movie.getRating() == rating) {
		movieRating.add(movie);
	    }
	}

	return movieRating;
    }

    /**
     * Creates a list of Movies from a particular year.
     *
     * @param movies List of movies.
     * @param year   Year to compare against.
     * @return List of movies of year.
     */
    public static ArrayList<Movie> getByYear(final ArrayList<Movie> movies, final int year) {

	// your code here
	ArrayList<Movie> movieYear = new ArrayList<Movie>();

	for (Movie movie : movies) {

	    if (movie.getYear() == year) {
		movieYear.add(movie);
	    }
	}

	return movieYear;
    }

    /**
     * Asks a user to select a genre from a list of genres displayed by calling
     * Movie.genresMenu() and returns an integer genre code. The genre must be a
     * valid index to an item in Movie.GENRES.
     *
     * @param keyboard A keyboard (System.in) Scanner.
     * @return An integer genre code.
     */
    public static int readGenre(final Scanner keyboard) {

	// your code here

	return -1;
    }

    /**
     * Creates and returns a Movie object from a line of formatted string data.
     *
     * @param line A vertical bar-delimited line of movie data in the format
     *             title|year|director|rating|genre
     * @return The data from line as a Movie object.
     */
    public static Movie readMovie(final String line) {

	// your code here

	String[] splitLine = line.split("\\|");
	String title = splitLine[0];
	int year = Integer.parseInt(splitLine[1]);
	String director = splitLine[2];
	Double rating = Double.parseDouble(splitLine[3]);
	int genre = Integer.parseInt(splitLine[4]);

	Movie newMovie = new Movie(title, year, director, rating, genre);

	return newMovie;
    }

    /**
     * Reads a list of Movies from a file.
     *
     * @param fileIn A Scanner of a Movie data file in the format
     *               title|year|director|rating|genre
     * @return A list of Movie objects.
     */
    public static ArrayList<Movie> readMovies(final Scanner fileIn) {

	// your code here
	ArrayList<Movie> movies = new ArrayList<Movie>();
	String str = "";

	while (fileIn.hasNextLine()) {
	    str = fileIn.nextLine();
	    movies.add(readMovie(str));
	}

	return movies;
    }

    /**
     * Writes the contents of a list of Movie to a PrintStream.
     *
     * @param movies A list of Movie objects.
     * @param ps     Output PrintStream.
     */
    public static void writeMovies(final ArrayList<Movie> movies, PrintStream ps) {

	// your code here

	return;
    }

}
