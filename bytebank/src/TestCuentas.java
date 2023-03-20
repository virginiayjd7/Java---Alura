public class TestCuentas {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca = new CuentaAhorros(2, 3);
        cc.depositar(2000);
        //ca.depositar(2000);
        
        cc.trasferir(1000, ca);
        System.out.println("cc:" + cc.getSaldo());
        System.out.println("ca:" + ca.getSaldo());

        
    }
}
