package entrenador;

public class Entrenador {
	
	//POO
	
	private String nombre; //declarar una variable tipo txt
	public String getNombre() { //metodo publico que devulve un string de tipo nombre
		return nombre;
	}
	public void setNombre(String nombre) { 
		this.nombre = nombre;
	}
	public int getEdad() { //metodo público que devuelve un entero
		return edad;
	}
	public void setEdad(int edad) { //metodo publico vacio que establece una edad
		this.edad = edad; // cuadno recibe un dato de tipo edad llama a la variable de la clase
	}
	private int edad; //declarar una variable tipo númerica
	//una clase tiene por defecto un constructor vacio
	
	
}
