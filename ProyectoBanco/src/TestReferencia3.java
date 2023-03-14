public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaYaneth = new Cuenta();
        //Cliente cliente = new Cliente();
        //cuentaYaneth.titular=new Cliente();
        //cuentaYaneth.titular.nombre="yaneth";
        System.out.println(cuentaYaneth.titular.nombre);//antes mostraba erro ahora es null
    }
}
