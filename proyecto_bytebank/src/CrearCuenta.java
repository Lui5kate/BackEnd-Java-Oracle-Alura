
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primerCuenta = new Cuenta();
		primerCuenta.depositar(1000);
		primerCuenta.getSaldo();
		// primerCuenta.pais = "Mexico";
		System.out.println(primerCuenta.getSaldo());

		Cuenta segundaCuenta = new Cuenta();
		primerCuenta.depositar(1000);
		primerCuenta.getSaldo();
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primerCuenta.getAgencia());
		
		System.out.println(primerCuenta);
		System.out.println(segundaCuenta);
		
		if (primerCuenta == segundaCuenta ) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes objetos");
		}
		
		if (primerCuenta.getSaldo() == segundaCuenta.getSaldo() ) {
			System.out.println("Son el mismo");
		} else {
			System.out.println("Son diferentes");
		}
	}
}

