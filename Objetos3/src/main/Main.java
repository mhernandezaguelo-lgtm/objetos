package main;

import entrenador.Entrenador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrenador a= new Entrenador();
		
		a.setNombre("Sergi");
		a.setEdad(22);
		
		System.out.println("El nombre es : " + a.getNombre());
		System.out.println("La edad es : " + a.getEdad());;
	}

}
