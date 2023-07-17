public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario luis = new Contador();
        luis.setDocumento("luis");
        luis.setNombre("luis");
        luis.setDocumento("59756429");
        luis.setSalario(2000);
        luis.setTipo(0);

        System.out.println(luis.getSalario());
        System.out.println(luis.getBonificacion());
        
    }
}
