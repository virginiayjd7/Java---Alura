public class PruebaConstrutor {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(333);
        //cuenta.setAgencia(-4);
        //System.out.println(cuenta.getAgencia());
        //Cuenta.total=7;
        System.out.println(Cuenta.getTotal());
        
    }
}
