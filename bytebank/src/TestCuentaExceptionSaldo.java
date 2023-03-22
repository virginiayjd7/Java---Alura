public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(1, 456);
        cuenta.depositar(210);
        try{
        cuenta.retirar(200);
        cuenta.retirar(10);
        }catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }
        
    }
}
