import javax.lang.model.element.Element;

// entidad Cuenta
class Cuenta{
//atributo
    private double saldo;//ya estan inicializados lo hace java por defecto null es string y int y bolleano es 00
    private int agencia;
    private int numero;
    private Cliente titular=new Cliente();//inicialice un a string

    /*public Cuenta(){

    }*/
    private static int total = 0;//se accede anivel de clase
    public Cuenta(int agencia){//constructor
        
        if(agencia<=0){
            System.out.println("no se permite 0");
            this.agencia=1;
        }else{
            this.agencia=agencia;
        }
        total++;
        System.out.println("se van creando:"+ total +"cuentas");

    }

    //metodo que NO retorna valor
    public void depositar(double valor){ //void solo ejecuta el metodo depositar no retorna nada dentro del metodod
       this.saldo =+ valor;
    }
    // metodo que SI retorna valor
    public boolean retirar(double valor ){

        if (this.saldo >= valor){
            this.saldo -=  valor;
            return true;
        }//else{
           // return false;
        //}
        return false;
    }

    public boolean trasferir(double valor, Cuenta cuenta){

        if(this.saldo >= valor){
            this.saldo -= valor;
            //this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }//else{
            //return false;
       // }
       return false;

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
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal(){
        return Cuenta.total;
    }
}