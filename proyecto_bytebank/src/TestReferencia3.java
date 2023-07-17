
public class TestReferencia3 {
	public static void main(String[] args) {
		//Cuenta cuentaDeDiego = new Cuenta();
		//cuentaDeDiego.titular.nombre = "Diego";
		//System.out.println(cuentaDeDiego.titular.nombre);
		// Da una excepción ya que no se ha inicializado el objeto Cliente
		//por ende no tiene como referenciar titular con los atributos
		// por ejemplo el atributo de nombre
		
		//Cuenta cuentaDeDiego = new Cuenta();
		//Cliente cliente = new Cliente();
		//cuentaDeDiego.titular = cliente;
		// Hasta aquí el atributo nombre es null
		//System.out.println(cuentaDeDiego.titular); // Ya tiene espacio en memoria
		//cuentaDeDiego.titular.nombre = "Diego";
		//System.out.println(cuentaDeDiego.titular.documento); // null
	
		//Cuenta cuentaDeDiego = new Cuenta();
		//Cliente cliente = new Cliente(); Queda obsoleto
		//cuentaDeDiego.titular = new Cliente();
		//cuentaDeDiego.titular.nombre = "Diego";
		//System.out.println(cuentaDeDiego.titular.nombre); // Diego
		
		// Lo correcto es a través de la clase cuenta, inicializar el objeto Cliente = new Cliente(); así ya no tenemos que inicializarla
	
		Cuenta cuentaDeDiego = new Cuenta();
		System.out.println(cuentaDeDiego.getTitular().getNombre()); // null
		
	}
}
