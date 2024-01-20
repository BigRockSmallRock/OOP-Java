package cp213;

import java.time.LocalDate;

/**
 * Tests the Student class.
 *
 * @author Jamal Alizadah - 210786540 - aliz6540@mylaurier.ca
 * @version 2023-02-03
 */
public class Main {

    public static void main(String[] args) {
	final String line = "-".repeat(40);
	int id = 123456;
	String surname = "Brown";
	String forename = "David";
	LocalDate birthDate = LocalDate.parse("1962-10-25");
	Student student = new Student(id, surname, forename, birthDate);
	System.out.println("New Student:");
	System.out.println(student);
	System.out.println(line);
	System.out.println("Test Getters");

	// call getters here
	System.out.println("Testing GetId(): " + student.getId());
	System.out.println("Testing GetSurname(): " + student.getSurname());
	System.out.println("Testing GetForename(): " + student.getForename());
	System.out.println("Testing GetBirthdate(): " + student.getBirthDate());

	System.out.println(line);
	System.out.println("Test Setters");

	// call setters here
	student.setId(210786540);
	student.setSurname("Alizadah");
	student.setForename("Jamal");
	student.setBirthDate(LocalDate.parse("2002-12-19"));

	System.out.println("Updated Student:");
	System.out.println(student);
	System.out.println(line);
	System.out.println("Test compareTo");

	// create new Students - call comparisons here
	id = 654321;
	surname = "Joe";
	forename = "Bob";
	birthDate = LocalDate.parse("2182-01-01");
	student = new Student(id, surname, forename, birthDate);
	System.out.println(line);
	System.out.println("Testing student 1: ");
	System.out.println(student);

	System.out.println();
	id = 909090;
	surname = "Rock";
	forename = "Grass";
	birthDate = LocalDate.parse("1633-06-19");
	Student student1 = new Student(id, surname, forename, birthDate);
	System.out.println("Testing student 2: ");
	System.out.println(student1);

	System.out.println();
	System.out.println("Testing compareTo() with student 1 and student 2: " + student.compareTo(student1));

	System.out.println();
	id = 616161;
	surname = "Kat";
	forename = "Kit";
	birthDate = LocalDate.parse("1998-04-03");
	student = new Student(id, surname, forename, birthDate);
	System.out.println("Testing new student: ");
	System.out.println(student);

    }

}
