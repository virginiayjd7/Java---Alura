public class CrearCuenta {
    public static void main(String[] args) {
        // varibale                valor su vlor por defec ejemplo en memorie122fd
        Cuenta primeraCuenta = new Cuenta();//instancia
        primeraCuenta.saldo=  2000;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta =new Cuenta();//separame en la memoria ese nuevo obejto nu nueva ubicacion
        segundaCuenta.saldo = 2000;
        System.out.println(segundaCuenta.saldo);
        System.out.println(primeraCuenta.agencia);

        System.out.println(segundaCuenta);
        System.out.println(primeraCuenta);

        if (primeraCuenta.saldo == segundaCuenta.saldo){
            System.out.println("son el mismo objeto");
        }else{
            System.out.println("son diferentes");//la ubicacion de memoria de las dos instancias son diferentes
        }

    }
}
