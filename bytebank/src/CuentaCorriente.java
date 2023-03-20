public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }

    @Override //es para sobreescribir
    public boolean retirar(double valor) {
        // TODO Auto-generated method stub
        double comision = 0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
       
    }

}
