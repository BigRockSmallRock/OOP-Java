package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-03-17
 */
public class IA extends Student {

    // your code here
    private String course = "";

    /**
     * IA constructor
     *
     * @param lastName  Student last name
     * @param firstName Student first name
     * @param id        Student id number
     * @param course    Student course code
     */
    public IA(final String lastName, final String firstName, final String id, final String course) {
	super(lastName, firstName, id);
	this.course = course;
    }

    /**
     * Getter for course.
     *
     * @return this.course
     */
    public String getCourse() {
	return this.course;
    }

    /**
     * Creates formatted string version of IA.
     */
    @Override
    public String toString() {
	return super.toString() + "\nCourse: " + this.course;
    }

}
