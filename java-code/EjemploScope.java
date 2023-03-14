public class EjemploScope {

    public static void main(String[] args) {
        
        System.out.println("hello wordl");

        int edad=21;
        int cantidadPersonas=2;
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja == true;
        System.out.println("el valor de la consion:" +esPareja);

        if (puedeEntrar){
            System.out.println("usted puede entrar");
        }else{
            System.out.println("usted no puede" +"entrar");
        }

    }
    
}
