public class TestCuentas {
    public static void main(String[] args) {

        CuentaCorriente cc = null;
        int num =0;//nose puede dividir en cero
        int resultado =30/num;
        System.out.println(resultado);
        CuentaAhorros ca = new CuentaAhorros(2, 3);
        cc.depositar(2000);
        //ca.depositar(2000);
        cc.trasferir(1000, ca);
        System.out.println("cc:" + cc.getSaldo());
        System.out.println("ca:" + ca.getSaldo());

        
    }
}
