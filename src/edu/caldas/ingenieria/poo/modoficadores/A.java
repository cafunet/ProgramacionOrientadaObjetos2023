package edu.caldas.ingenieria.poo.modoficadores;

public class A {
    public int publicoA;
    protected int protegidoA;
    int defaultA;
    private int privadoA;

    public void metodoPublicoA() { /* ... */ }
    protected void metodoProtegidoA() { /* ... */ }
    void metodoDefaultA() { /* ... */ }
    private void metodoPrivadoA() { /* ... */ }
}

// En el archivo B.java
public class B {
    public static void main(String[] args) {
        A objetoA = new A();
        objetoA.publicoA = 10;
        objetoA.protegidoA = 20;
        objetoA.defaultA = 30;  // No se puede acceder si B no está en el mismo paquete que A
        objetoA.privadoA = 40; // No se puede acceder, es privado

        objetoA.metodoPublicoA();
        objetoA.metodoProtegidoA();
        objetoA.metodoDefaultA();  // No se puede acceder si B no está en el mismo paquete que A
        objetoA.metodoPrivadoA(); // No se puede acceder, es privado
    }
}

