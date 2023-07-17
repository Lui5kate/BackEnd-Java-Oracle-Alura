public class TestControlBonificacion {
    public static void main(String[] args) {
        
        Funcionario luis = new Contador();
        luis.setSalario(2000);

        Gerente laura = new Gerente();
        laura.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(luis);
        controlBonificacion.registrarSalario(laura);
        controlBonificacion.registrarSalario(alex);
    }
}