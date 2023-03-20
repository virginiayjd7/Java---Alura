public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario yaneth = new Contador();
        yaneth.setSalario(2000);

        Gerente vicky = new Gerente();
        vicky.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(yaneth);
        controlBonificacion.registrarSalario(vicky);
        controlBonificacion.registrarSalario(alex);


    }
}
