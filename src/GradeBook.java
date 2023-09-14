
public class GradeBook {
	
	private String courseName;
	
	//zona de constructores
	public GradeBook()
	{
	}
	//param courseName
	 public GradeBook(String courseName) {
		//super no tiene relevancia ya que se toma como metodo de herencia y son por default al generarse autom.
		 super();
		this.courseName = courseName;
	}
	 
	//zona getters y setters  
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayMessage(String course)
	 {
		System.out.print("hello from GreenBook class " + getCourseName());
	 }

}