/*Username: cebi
 * Name: Chuka Ebi
 */
package listDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public  class AddStudent extends JFrame implements ActionListener {
	
	private JTextField idField;
	private JTextField firstField;
	private JTextField lastField;
	private String lastName;
	private String firstName;
	private String ID;
	private ListDemo ld;
	private ListStudents ls;
	/**
	 * 
	 * @param ld
	 * @param ls
	 */
	public AddStudent(ListDemo ld, ListStudents ls){// class for the AddStudent JFrame
		super("Add Student Information");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout( new BorderLayout());
		this.ld = ld;
		this.ls = ls;

		JPanel infoPanel = new JPanel();

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		JLabel firstNameLabel = new JLabel("First Name: ");
		JLabel lastNameLabel = new JLabel("Last Name: ");
		JLabel SID = new JLabel("Student ID: ");
		lastField = new JTextField(20);
		firstField = new JTextField(20);
		idField = new JTextField(6);

		JButton okayButton = new JButton("Okay");
		okayButton.addActionListener(new OkayListener(ls,this));

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new CancelListener());

		buttonPanel.add(okayButton);
		buttonPanel.add(cancelButton);

		infoPanel.add(lastNameLabel);
		infoPanel.add(lastField);
		infoPanel.add(firstNameLabel);
		infoPanel.add(firstField);
		infoPanel.add(SID);
		infoPanel.add(idField);

		add(buttonPanel, BorderLayout.SOUTH);
		add(infoPanel, BorderLayout.CENTER);
	}
	
	//Register for the OkayListener Controller
	public void registerListener(OkayListener listener){
		lastField.addActionListener(listener);
		firstField.addActionListener(listener);
		idField.addActionListener(listener);
	}
	
	// CancelListener gets rid of the window
	public class CancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	
	public ListDemo getLD(){
		return ld;
	}
	
	public Students getStudent(){
		return new Students(Integer.parseInt(idField.getText()), lastField.getText(), firstField.getText());
	}
	
	public String getLastName(){
		return lastField.getText();
	}

	public String getFirstName(){
		return firstField.getText();
	}
		 
	public String getStudentId(){
		return idField.getText();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}

