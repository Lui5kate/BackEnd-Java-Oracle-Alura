
public class conversiones {

	public static void main(String[] args) {
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cast 
		System.out.println(variable1); //Éste metodo imprime en consola
		System.out.println(variable1Entero);
		
		long prueba = 12122222223232323L; // La L al final se especifica para decir que es un numero grande
		//long soporta 2^63 positivo y 2^63 negativo 
		// int soporta 2^31 positivo y 2^31 negativo menos 1 por el 0
		short numeroPequeno = 13555;
		// short soporta 2^16 positivo y 2^16 negativo menos 1 por el 0
		byte numeroMasPequeno = 123;
		// byte soporta 8 bits de tamaño
		float numeroDecimalPequeno = 3.85F; // La F al final se especifica para decir que es un numero pequeño decimal
		System.out.println(prueba);
		System.out.println(numeroPequeno);
		System.out.println(numeroMasPequeno);
		System.out.println(numeroDecimalPequeno);
	
		int resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado);
	
	}
}