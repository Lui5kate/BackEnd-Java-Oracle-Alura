
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("1234567899");
		diego.setTelefono("59756439");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(1);
		// Referenciamos el objeto tipo Cliente llamado diego
		cuentaDeDiego.setTitular(diego);
		
		// Podemos acceder a los atributos del objeto Cliente 
		//a través de la referencia titular
		//cuentaDeDiego -> Objeto
		//titular -> referencia al objeto Cliente
		// documento -> atributo del objeto Cliente
		System.out.println(cuentaDeDiego.getTitular().getDocumento());
		// En los 2 siguientes prints, vemos que tiene el
		// mismo espacio en memoria del objeto diego y el objeto 
		// titular en cuentaDeDiego
		System.out.println(cuentaDeDiego.getTitular());
		System.out.println(diego);
	}
}
