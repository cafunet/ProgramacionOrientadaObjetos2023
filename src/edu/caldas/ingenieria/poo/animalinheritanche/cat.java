package edu.caldas.ingenieria.poo.animalinheritanche;

public class cat extends animal{
	
	private int placa;
	
	public cat(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}

	public void hacerSonido(){
		System.out.println(getNombre() + "Miau!");		
	}
	
	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}
	
	public void propietario() {	
	}
	
	public void nopropietario() {
		
	}
}
