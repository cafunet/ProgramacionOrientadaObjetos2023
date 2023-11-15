package edu.caldas.ingenieria.poo.animalinheritanche;

public class dog extends animal{

	private int weight; 
	private String haircolor; 
	
	public dog(String name, String raza, int edad) {
		super(name, raza, edad);
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

	public void hacerSonido(){
		System.out.println(getName() + " Esta ladrando, Guau! Guau!");	
	}
	
	public void olfatear(){
		System.out.println(getName() + " Esta olfateando!");
	}
	
}
