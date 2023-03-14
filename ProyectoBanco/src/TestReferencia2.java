public class TestReferencia2 {
    public static void main(String[] args) {
        
        Cliente Yaneth = new Cliente();
        Yaneth.nombre="yaneth";
        Yaneth.documento="76416003";
        Yaneth.telefono="975957007";

        Cuenta cuentaDeYaneth = new Cuenta();
        cuentaDeYaneth.agencia=1;
        cuentaDeYaneth.titular= Yaneth;

        System.out.println(cuentaDeYaneth.titular.documento);
        System.out.println(cuentaDeYaneth.titular);
        System.out.println(Yaneth);



    }
}
