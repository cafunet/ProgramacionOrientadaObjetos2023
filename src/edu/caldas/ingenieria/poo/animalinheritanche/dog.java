package edu.caldas.ingenieria.poo.animalinheritanche;

public class dog extends animal{

	public dog(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}

	public void hacerSonido(){
		System.out.println(getNombre() + "Guau!");	
	}
	
	public void olfatear(){
		System.out.println(getNombre() + "El perro esta olfateando!");		
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getHaircolor() {
		return haircolor;
	}

	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}

	private int weight; 
	private String haircolor; 
	

	
	public void pesonormal() {
		
	}
	
	public void sobrepeso() {
		
	}
	
	public void uncolor() {
		
	}

	public void mascolores() {
	
	}
	
}
