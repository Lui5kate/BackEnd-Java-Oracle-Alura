
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello World"); // sysout + click + enter

		int edad = 21;
		int cantidadPersonas = 2;
		
		// Scope es el alcance de las variables
		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
				
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) { // || or, && and, == iquals
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido a entrar");
		}
	}
}