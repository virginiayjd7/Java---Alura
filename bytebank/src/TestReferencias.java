public class TestReferencias {
    public static void main(String[] args) {

    // Elemento  mas generico puede ser apadtado al elemento mas 
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Virginia");

        Gerente gerente= new Gerente();
        gerente.setNombre("Yaneth");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.inciarSesion("_ddddd");
        
    }
}
