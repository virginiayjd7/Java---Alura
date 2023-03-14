public class TestIR {
    
    public static void main(String[] args) {

        double salario = 4500.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("su IR es de   7.5%");
            System.out.println("Puede deducir hasta R$ 142");
        }

        if(salario >=2800.01 && salario <= 3751.0 ) {
            System.out.println("Su tasa es del  15%");
            System.out.println("Puede deducir hasta R$ 350");
        }

        if(salario >= 3751.01 && salario <= 4664.00 ){
            System.out.println("Su tasa es del  22.5%");
            System.out.println("Puede deducir hasta R$ 636");
        }

    }
}
