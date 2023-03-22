public class TestCuentaExceptionChecked {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.depositar();
        } catch (MiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
