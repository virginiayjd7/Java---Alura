public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario yaneth = new Contador();
        yaneth.setNombre("yaneth");
        yaneth.setDocumento("76416003");
        yaneth.setSalario(2000);
        yaneth.setTipo(0);

        System.out.println(yaneth.getSalario());
        System.out.println(yaneth.getBonificacion());

    }
}
