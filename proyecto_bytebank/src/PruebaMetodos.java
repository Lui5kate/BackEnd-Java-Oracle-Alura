
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(); // Nueva instancia de cuenta, Cuenta 1er clase, cuenta 2do variable
		miCuenta.depositar(300);
		
		miCuenta.depositar(200); //llamar a un método ej: nombreDeReferencia.nombreDelMetodo();
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100); // si dejas presionado CTRL + click nos manda al origen del objeto/metodo
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeLaura = new Cuenta();
		cuentaDeLaura.depositar(1000);
		boolean puedeTransferir = cuentaDeLaura.transferir(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		System.out.println(cuentaDeLaura.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}