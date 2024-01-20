package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-03-17
 */
public class CAS extends Professor {

    // your code here
    private String term = "";

    /**
     * @param lastName   Professor last name
     * @param firstName  Professor first name
     * @param department Professor department code
     * @param term       Professor term code
     */
    public CAS(final String lastName, final String firstName, final String department, final String term) {
	super(lastName, firstName, department);
	this.term = term;
    }

    /**
     * Getter for term.
     * 
     * @return this.term
     */
    public String getTerm() {
	return this.term;
    }

    /**
     * Creates formatted string version of CAS.
     */
    @Override
    public String toString() {
	return super.toString() + "\nTerm: " + this.term;
    }

}
