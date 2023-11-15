package edu.caldas.ingenieria.poo.animalinheritanche;

public class cat extends animal{
	
	private int placa;
	
	public cat(String name, String raza, int edad) {
		super(name, raza, edad);
	}
	
	public void hacerSonido(){
		System.out.println(getName() + " Miau!");		
	}
	
	public void olfatear(){
		System.out.println(getName() + " El gato esta olfateando!");
	}
	
	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}
	
}
