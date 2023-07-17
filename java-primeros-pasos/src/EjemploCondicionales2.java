
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello World"); // sysout + click + enter

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) { // || or, && and, == iquals
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido a entrar");
		}
	}
}
