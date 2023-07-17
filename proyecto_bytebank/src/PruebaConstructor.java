public class PruebaConstructor {
    public static void main(String[] args) {
        // Creamos una nueva instancia de la clase
        // clase | variable del tipo cuenta = instancia
        Cuenta cuenta = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(333);
        Cuenta cuenta3= new Cuenta(444);
        System.out.println(Cuenta.getTotal());
    }
}