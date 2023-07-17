
public class EjemploCaracteres {
	public static void main(String[] args) {
		
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65; // Por la tabla ASCII, 65 = A
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
	
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}
}
