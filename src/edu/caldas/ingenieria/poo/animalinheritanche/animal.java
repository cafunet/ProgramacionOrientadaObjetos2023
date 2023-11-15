package edu.caldas.ingenieria.poo.animalinheritanche;

public class animal {
	
	private String name;
	private String raza;
	private int edad;
	
	public animal(String name, String raza, int edad) {
		this.name = name;
		this.raza = raza;
		this.edad = edad;				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void hacerSonido(){
		System.out.println("hacer un sonido");		
	}
	
	public void olfatear(){
		System.out.println("El animal esta olfateando!");	
	}
}
