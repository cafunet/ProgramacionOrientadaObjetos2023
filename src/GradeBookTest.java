import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest() {
		
	}
	public static void main (String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		GradeBook gradebook = new GradeBook();
		
		System.out.print("give a course name: ");
		
		String courseName = sc.nextLine();
		gradebook.setCourseName(courseName);
		System.out.println("nombre curso desde el main()" + gradebook.getCourseName());
		System.out.println("nombre curso con constructor"+ gradebook);
		gradebook.displayMessage(courseName);

	}

}