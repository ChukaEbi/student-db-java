/*Username: cebi
 * Name: Chuka Ebi
 */
package listDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkayListener implements ActionListener {
	private ListStudents studentList;
	private AddStudent v; 
	//private ListDemo lid;
	public OkayListener (ListStudents studentList, AddStudent v){
	this.studentList = studentList;
	this.v=v;
	//this.lid = lid;
	}

	@Override
	//Controller for the Model, and view. Appends the student to the
	// ListStudents ArrayList and also to the Scroll Pane window
	public void actionPerformed(ActionEvent e) {
		try {
			studentList.addStudent(v.getStudent());
		} catch (StudentAlreadyExists e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		v.getLD().getListModel().addElement(v.getLastName() + "," + " " + v.getFirstName() + " " + v.getStudentId());
	
		v.setVisible(false);
	}

}
