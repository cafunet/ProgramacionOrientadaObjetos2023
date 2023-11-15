package edu.caldas.ingenieria.poo.animalinheritanche;

public class main {
	public static void main(String[] args) {

		// Sin Polimorfismo
        cat cat = new cat("Garfield", "Angora", 10);
        dog dog = new dog("Scoobie Do", " Doberman", 5);
        animal animalUno = new cat("Felix", "Criollo", 1);
        animal animalDos = new dog("Rex", "Criollo", 2);
        
        
        animal[] animals = new animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = animalUno;
        animals[3] = animalDos;
        
        // animal[0].dormir();
        // mascotas[1].dormir();
        
        
        for(animal a : animals){
            nombreClaseYMascota(a);
        }
        // nombreClaseYMascota(perro);
        
        cat.hacerSonido();
        cat.olfatear();
        System.out.println(cat.getName());

        dog.olfatear();
        dog.hacerSonido();
        System.out.println(dog.getName());

        
        /*
        // Arbol Jerarquico
        Class clase = perro.getClass();
        while(clase.getSuperclass() != null){
            String hijo = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hijo + " es una clase hija  de la clase padre: " + padre);
            clase = clase.getSuperclass();
        }*/
        
    }
    
    public static void nombreClaseYMascota(animal algo){
        System.out.println(algo.getName() + ", Clase: " + algo.getClass().getName());
			
	}

}
