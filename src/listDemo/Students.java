/*Username: cebi
 * Name: Chuka Ebi
 */
package listDemo;

import java.util.ArrayList;

public class Students {
	private int studentID;
	private String lastName;
	private String firstName;
	/**
	 * creates constructor for student
	 * @param StudentID
	 * @param lastName
	 * @param firstName
	 */
	public Students(int StudentID, String lastName, String firstName){
		this.studentID = StudentID;
		this.lastName = lastName;
		this.firstName = firstName;
		
	}
	
	public int getID(){
		return this.studentID;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String toString(){
		return "Name: " + this.firstName + " " + this.lastName + " \n";
		}
	
	
	
}
