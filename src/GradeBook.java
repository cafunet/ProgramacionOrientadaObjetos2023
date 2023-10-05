import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	//zona de constructores 
	public GradeBook()
	{
	}
	//param courseName sirve para crear el atributo y asignarle el valor de tipo de dato
	public GradeBook(String courseName) {
		//super no tiene relevancia ya que se toma como metodo de herencia y son por default al generarse autom.
		super();
		this.courseName = courseName;
	}
	//zona getters y setters  
	public String getCourseName() {
		return courseName;
	}
//el void es vacio que no devuelve nada y esto permite modificar el atributo creado
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
// zona logica de negocio
	public void displayMessage(String course){
		System.out.print("hello from GreenBook class " + getCourseName());
	 }
	
	// metodo para promedio de calificacines
	public void determineClassAverage() {

	Scanner sc = new Scanner(System.in);
	
	//declarar atributos a utilizar e inicializarlos
	int total= 0, grade, gradeCounter=1, average;
	
	while (gradeCounter <= 5 ) {
		System.out.println("por favor ingrese notas: "); // pedir info al usuario
		grade = sc.nextInt(); //permite que el usuario ingrese la info
		total = total + grade;
		gradeCounter = gradeCounter + 1;
		
	}
	//promedio = sumatorio de muestras 
	average = total/5;
	
	System.out.println("el promedio de las notas es: " + average);
	
	}

}