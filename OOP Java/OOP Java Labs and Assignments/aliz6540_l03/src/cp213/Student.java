package cp213;

import java.time.LocalDate;

/**
 * Student class definition.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-03
 */
public class Student implements Comparable<Student> {

    // Attributes
    private LocalDate birthDate = null;
    private String forename = "";
    private int id = 0;
    private String surname = "";

    /**
     * Instantiates a Student object.
     * 
     *
     * @param id        student ID number
     * @param surname   student surname
     * @param forename  name of forename
     * @param birthDate birthDate in 'YYYY-MM-DD' format
     */
    public Student(int id, String surname, String forename, LocalDate birthDate) {

	// assign attributes here
	this.id = id;
	this.surname = surname;
	this.forename = forename;
	this.birthDate = birthDate;

	return;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString() Creates a formatted string of student data.
     */
    @Override
    public String toString() {
	String string = "";

	// your code here
	string = String.format("Name: %9s, %3s\nID: %12s\nBirthdate: %9s", surname, forename, id, birthDate);

	return string;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(final Student target) {
	int result = 0;

	// your code here
	if (this.surname.compareTo(target.surname) > 0) {
	    result = 1;
	} else if (this.surname.compareTo(target.surname) < 0) {
	    result = -1;
	} else {
	    if (this.forename.compareTo(target.forename) > 0) {
		result = 1;
	    } else if (this.forename.compareTo(target.forename) < 0) {
		result = -1;
	    } else {
		if (this.id > target.id) {
		    result = 1;
		} else if (this.id == target.id) {
		    result = 0;
		} else {
		    result = -1;
		}
	    }
	}

	return result;
    }

    // getters and setters defined here

    public int getId() {
	return this.id;
    }

    public String getSurname() {
	return this.surname;
    }

    public String getForename() {
	return this.forename;
    }

    public LocalDate getBirthDate() {
	return this.birthDate;
    }

    public void setId(int id) {
	this.id = id;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public void setForename(String forename) {
	this.forename = forename;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }
}
