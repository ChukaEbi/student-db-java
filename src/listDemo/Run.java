/*Username: cebi
 * Name: Chuka Ebi
 */
package listDemo;

public class Run implements Runnable {
	
	private ListDemo lde;
	private ListStudents lst;
	
	/**Launches the AddStudent window which pulls in information for the ListStudents and ListDemo
	 * 
	 * @param lde 
	 * @param lst
	 */
	public Run(ListDemo lde, ListStudents lst){
		this.lde = lde;
		this.lst = lst;
	}
	public void run() {
		// TODO Auto-generated method stub
		AddStudent a = new AddStudent(lde,lst);
		
		a.setVisible(true);
	}

}
