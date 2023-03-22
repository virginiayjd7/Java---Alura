// entidad Cuenta
public abstract class Cuenta{
//atributo
    protected double saldo;//ya estan inicializados lo hace java por defecto null es string y int y bolleano es 00
    private int agencia = 1;
    private int numero;
    private Cliente titular=new Cliente();//inicialice un a string

    private static int total;//se accede anivel de clase

    public Cuenta(){

    }
    
    public Cuenta(int agencia, int numero){//constructor
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estoy creando una cuenta :"+ this.numero);
        Cuenta.total ++;
       /*  if(agencia<=0){
            System.out.println("no se permite 0");
            this.agencia=1;
        }else{
            this.agencia=agencia;
        }
        total++;
        System.out.println("se van creando:"+ total +"cuentas");
*/
    }

    //metodo que NO retorna valor
    public abstract void depositar(double valor);//{ //void solo ejecuta el metodo depositar no retorna nada dentro del metodod
       //this.saldo =+ valor;
       //this.saldo =  this.saldo + valor;
    //}
    // metodo que SI retorna valor
    public void retirar(double valor ) throws SaldoInsuficienteException{

        if(this.saldo < valor){
            throw new SaldoInsuficienteException("no tiene saldo");
        }
            this.saldo -=  valor;
           
        //return false;
    }

    public boolean trasferir(double valor, Cuenta cuenta){

        if(this.saldo >= valor){
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //-= valor;
            //this.saldo = this.saldo - valor;
            //cuenta.depositar(valor);
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
       //return false;

    }
    public double getSaldo(){
        return this.saldo;

    }

    /*public void setAgencia(int agencia){
        if(agencia>0){
            this.agencia= agencia;
        }else{
            System.out.println("no esta permitido valores - negativos");
        }
    }*/

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0){
           this.agencia = agencia;
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal(){
        return Cuenta.total;
    }
    public void setNumero(int numero) {
        if(numero > 0)
        this.numero = numero;
    }
}