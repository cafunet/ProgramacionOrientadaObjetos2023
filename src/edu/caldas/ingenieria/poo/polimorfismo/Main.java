package edu.caldas.ingenieria.poo.polimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		carro mazda = new carro("Mazda", "1998", 100);
		bicicleta gw = new bicicleta("GW", "2015", 30);
		bicicleta cross = new bicicleta("Cross", "2020", 70);
		
		
		gw.andarBicicleta();
		gw.picarBicicleta();
		System.out.println("la bicicleta " + gw.marca + " ando " + gw.kilometrosRecorridos);
		
		cross.andarBicicleta();
		cross.picarBicicleta();
		System.out.println("la bicicleta " + cross.marca + " ando " + cross.kilometrosRecorridos);
		
		
		vehiculo vehiculos[] = new vehiculo[3];
		vehiculos[0]=gw;
		vehiculos[1]=mazda;
		vehiculos[2]=cross;
		
		
		
		int opcion;
		while(opcion != 0) {
			if (opcion = 1 gw.andarBicicleta());
				if (opcion) = 2
					
					
			System.out.println("ingrese un numero del 1 al 8: ");

		}

	}

}
