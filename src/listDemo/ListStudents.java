/*Username: cebi
 * Name: Chuka Ebi
 */
package listDemo;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class ListStudents extends DefaultListModel {
	private ArrayList<Students> list1 = new ArrayList<Students>();
	
	/**Place a student inside the list of students
	 * 
	 * @param s
	 * @throws StudentAlreadyExists
	 */
	public void addStudent(Students s) throws StudentAlreadyExists{
		if(!list1.contains(s)){
			list1.add(s);
			//super.addElement(s);
		}
		else{
			throw new StudentAlreadyExists("Student is already in the file");
		}
	}
	
	/**Removes student if the ID matches up with the specified student
	 * 
	 * @param s1
	 * @throws StudentNotFound
	 */
 
	public void removeStudent(Students s1) throws StudentNotFound{
		for(Students qw : list1){
			if(qw.getID() == s1.getID()){
				super.remove(list1.indexOf(s1));
				list1.remove(s1);
			}
			else{
				throw new StudentNotFound("Student not found");
			}
		}
	}
}