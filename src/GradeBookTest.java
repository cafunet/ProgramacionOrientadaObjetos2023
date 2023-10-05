import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest() {
		
	}
	public static void main (String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		GradeBook gradebook = new GradeBook();
		GradeBook gradebookProgramacion00 = new GradeBook ("programacion orientada a objetos");
		
		//gradebook.determineClassAverage();
		gradebookProgramacion00.determineClassAverage();
		
		/*
		System.out.print("ingrese nombre del curso: ");
		String courseName = sc.nextLine();
		gradebook.setCourseName(courseName);
		System.out.println("nombre curso desde el main(): " + gradebook.getCourseName());
		System.out.println("nombre curso con constructor: " + gradebookProgramacion00.getCourseName());
		gradebook.displayMessage(courseName);
		*/
	}

}