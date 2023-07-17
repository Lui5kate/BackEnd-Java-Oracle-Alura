public class TestReferencias {
        public static void main(String[] args) {
        // Polimorfismo: Las referencias de tipos de clases más genéricos referencian objetos más específicos.
        // El elemento mas genérico puede ser adaptado al elemento más específico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Luis");
    
        Gerente gerente = new Gerente();
        gerente.setNombre("Laura");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("_ddddd");
    }
}
