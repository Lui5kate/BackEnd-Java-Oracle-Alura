//                   extiende de
public class Gerente extends Funcionario implements Autenticable {

    // super -> palabra reservada para acceder a los métodos de la clase Funcionario
    // public double getBonificacion() es una sobre-escritura ya que se llama igual el método en la clase Funcionario 
    public double getBonificacion() {
        System.out.println("Ejecutndo desde Gerente");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
