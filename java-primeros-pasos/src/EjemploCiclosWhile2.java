public class EjemploCiclosWhile2 {
	public static void main(String[] args) {
		int contador = 1;
		int total = 0;
		while (contador < 11) {
			total = total + contador;
			contador++;
		}
		System.out.println(total);
	}
}