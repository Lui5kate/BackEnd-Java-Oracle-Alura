// Podemos extender solo una clase abstracta, pero podemos implementar varias interfaces.
// Todos los métodos de una interfaz son abstractos, los de una clase abstracta pueden no serlo.
// interface no puede tener métodos implementados
// Una interfáz no puede extender de una clase, pero si de otra interfáz
public interface Autenticable {

    public void setClave(String clave);
    public boolean iniciarSesion(String clave);
}



// Polimorfismo: Es la capacidad de un objeto de ser referenciado por varios tipos.
// Tenemos polimorfismo cuando una clase se extiende de otra o también cuando una clase implementa una interfaz.