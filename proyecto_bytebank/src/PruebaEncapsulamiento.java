public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("f4f4f4f4");

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
   } 
}